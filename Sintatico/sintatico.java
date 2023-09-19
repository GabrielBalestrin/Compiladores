package Sintatico;

import java.util.List;

public class sintatico {
	private List<Token> tokens;
	private int posicaoAtual;

	public sintatico(List<Token> tokens) {
		this.tokens = tokens;
		this.posicaoAtual = 0;
	}

	private String getTokenAtual() {
		if (this.posicaoAtual >= tokens.size()) {
			return null;
		}
		return tokens.get(this.posicaoAtual).getTipo();
	}

	public boolean term(String tk) {
	    String currentToken = getTokenAtual();
	    if (currentToken == null || !tk.equalsIgnoreCase(currentToken)) {
	        return false;
	    }
	    this.posicaoAtual++;
	    return true;
	}

	private boolean nextTokenIs(String tokenType) {
		if (this.posicaoAtual >= tokens.size()) {
			return false;
		}

		String nextTokenType = tokens.get(this.posicaoAtual).getTipo();

		return tokenType.equals(nextTokenType);
	}

	public boolean prog() {
	    return term("programa") && term("id") && term("ap") && (lista_var_parametros1() || lista_var_parametros2())
	            && term("fp") && term("achaves") && lista_comandos() && term("fchaves");
	}


	public boolean lista_var_parametros1() {
		if (lista_param()) {
			return true;
		} else
			return lista_var_parametros2(); // ε production
	}

	public boolean lista_var_parametros2() {

		if (nextTokenIs("")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean lista_param() {
		if (tipo() && term("id") && lista_param_tail1()) {
			return true;
		}
		return false;
	}

	public boolean lista_param_tail1() {
		String nextToken = getTokenAtual();
		if (nextToken != null && nextToken.equals("v")) {
			if (term("v") && tipo() && term("id")) {
				return lista_param_tail1(); 
			}
		}
		return lista_param_tail2();
	}

	public boolean lista_param_tail2() {
		if (term("")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean lista_var() {
		String nextToken = getTokenAtual();
		if (nextToken != null && (nextToken.equals("int") || nextToken.equals("string") || nextToken.equals("char")
				|| nextToken.equals("id"))) {
			return var() && lista_var_tail1();
		}
		return lista_var_tail2();
	}

	public boolean lista_var_tail1() {
		String nextToken = getTokenAtual();
		if (nextToken != null && nextToken.equals("v")) {
			return term("v") && var() && lista_var_tail1(); 
		}
		return lista_var_tail2(); 
	}

	public boolean lista_var_tail2() {
		if (term("")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean lista_comandos() {
	    String nextToken = getTokenAtual();
	    if (nextToken != null && (nextToken.equals("if") || nextToken.equals("switch") || nextToken.equals("while")
	            || nextToken.equals("for") || nextToken.equals("foreach") || nextToken.equals("print")
	            || nextToken.equals("id"))) {
	        return comando() && lista_comandos();
	    }
	    return true;
	}


	public boolean lista_cases() {
		if (term("case")) {
			return caseStatement() && lista_cases();
		}
		return true;
	}

	public boolean default_case() {
		if (term("default")) {
			return term("default") && term("pp") && lista_comandos();
		}
		return true;
	}

	public boolean resto_conteudo() {
		String nextToken = getTokenAtual();
		if (nextToken != null && (nextToken.equals("id") || nextToken.equals("const"))) {
			return term(nextToken) && resto_conteudo();
		}
		return true;
	}

	public boolean resto_inicializacao() {
		String nextToken = getTokenAtual();
		if (nextToken != null && nextToken.equals("v")) {
			return term("v") && declaracao() && resto_inicializacao();
		}
		return true;
	}

	public boolean var() {
	    if (tipo() && term("id")) {
	        return true;
	    } else if (term("id")) {
	        return true;
	    }
	    return var1();
	}

	public boolean var1() {
	    if (term("")) {
	        return true;
	    } else {
	        return false;
	    }
	}


	public boolean tipo() {
		if (term("int") || term("string") || term("char")) {
			return true;
		}
		return tipo2();
	}

	public boolean tipo2() {
		if (term("")) {
			return true;
		} else
			return false;
	}

	public boolean comando() {
		if (term("PRINT") && term("ap") && term("fp") && term("pv")) {
			return true;
		} else {
			if (estrutura_controle() || print() || atribuicao() || bloco()) {
				return true;
			}
		}
		return comando2();

	}

	public boolean comando2() {
		if (term(""))
			return true;
		else
			return false;
	}

	public boolean atribuicao() {
		if (term("id") && term("igual") && expressao() && term("pv")) {
			return true;
		}
		return atribuicao2();
	}

	public boolean atribuicao2() {
		if (term(""))
			return true;
		else
			return false;
	}

	public boolean estrutura_controle() {
		if (ifStatement() || switchStatement() || whileStatement() || forStatement() || foreachStatement()) {
			return true;
		}
		return estrutura_controle2();
	}

	public boolean estrutura_controle2() {
		if (term(""))
			return true;
		else
			return false;
	}

	public boolean print() {
		if (term("print") && term("ap") && argumento_print() && term("fp") && term("pv")) {
			return true;
		}
		return print2();
	}

	public boolean print2() {
		if (term(""))
			return true;
		else
			return false;
	}

	public boolean argumento_print() {
		if (term("id") || (term("aspas") && conteudo_argumento() && term("aspas"))) {
			return true;
		}
		return argumento_print2();
	}

	public boolean argumento_print2() {
		if (term(""))
			return true;
		else
			return false;
	}

	public boolean conteudo_argumento() {
		if ((term("id") && resto_conteudo()) || (term("const") && resto_conteudo())) {
			return true;
		}
		return true;
	}

	public boolean foreachStatement() {
		if (term("foreach") && term("ap") && tipo() && term("id") && term("in") && term("id") && term("fp")
				&& bloco()) {
			return true;
		}
		return foreachStantament2();
	}

	public boolean foreachStantament2() {
		if (term(""))
			return true;
		else
			return false;
	}

	public boolean ifStatement() {
		if (term("if") && term("ap") && condicao() && term("fp") && bloco() && ifElse()) {
			return true;
		}
		return ifStatement();
	}

	public boolean ifStatement2() {
		if (term(""))
			return true;
		else
			return false;
	}

	public boolean ifElse() {
		if (term("else")) {
			return estrutura_controle();
		}
		return true; // ε production
	}

	public boolean switchStatement() {
		if (term("switch") && term("ap") && var() && term("fp") && term("achaves") && lista_cases() && default_case()
				&& term("fchaves")) {
			return true;
		}
		return SwitchStatement2();
	}

	public boolean SwitchStatement2() {
		if (term(""))
			return true;
		else
			return false;
	}

	public boolean caseStatement() {
		if (term("case") && term("const") && term("pp") && lista_comandos() && term("break") && term("pv")) {
			return true;
		}
		return caseStatement2();
	}

	public boolean caseStatement2() {
		if (term(""))
			return true;
		else
			return false;
	}

	public boolean whileStatement() {
		if (term("while") && term("ap") && condicao() && term("fp") && bloco()) {
			return true;
		}
		return whileStatement2();
	}

	public boolean whileStatement2() {
		if (term(""))
			return true;
		else
			return false;
	}

	public boolean forStatement() {
		if (term("for") && term("ap") && inicializacao() && term("pv") && condicao() && term("pv") && incremento()
				&& term("fp") && bloco()) {
			return true;
		}
		return forStatement2();
	}

	public boolean forStatement2() {
		if (term(""))
			return true;
		else
			return false;
	}

	public boolean inicializacao() {
		if (tipo() && term("id") && term("igual") && expressao() && resto_inicializacao()) {
			return true;
		}
		return inicializacao2();
	}

	public boolean inicializacao2() {
		if (term(""))
			return true;
		else
			return false;
	}

	public boolean expressao() {
		if (term("id") || term("const")) {
			return true;
		}
		return expressao2();
	}

	public boolean expressao2() {
		if (term(""))
			return true;
		else
			return false;
	}

	public boolean bloco() {
		if (term("achaves") && lista_comandos() && term("fchaves")) {
			return true;
		}
		return bloco2();
	}

	public boolean bloco2() {
		if (term(""))
			return true;
		else
			return false;
	}

	public boolean condicao() {
		if (expressao() && comparador() && expressao()) {
			return true;
		}
		return condicao2();
	}

	public boolean condicao2() {
		if (term(""))
			return true;
		else
			return false;
	}

	public boolean comparador() {
		if (term("maiorq") || term("menorq") || term("menorigual") || term("maiorigual") || term("igualigual")) {
			return true;
		}
		return comparador2();
	}

	public boolean comparador2() {
		if (term(""))
			return true;
		else
			return false;
	}

	public boolean incremento() {
		if (term("id") && operacao()) {
			return true;
		}
		return incremento2();
	}

	public boolean incremento2() {
		if (term(""))
			return true;
		else
			return false;
	}

	public boolean operacao() {
		if (term("maismais") || term("menosmenos")) {
			return true;
		}
		return operacao2();
	}

	public boolean operacao2() {
		if (term(""))
			return true;
		else
			return false;
	}

	public boolean declaracao() {
		if (tipo() && term("id")) {
			return true;
		}
		return declaracao2();
	}

	public boolean declaracao2() {
		if (term(""))
			return true;
		else
			return false;
	}

}