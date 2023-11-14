package slr;

import java.util.Stack;

public class SLR {
	private TabelaAcao tabelaAcao;
	private TabelaGoTo tabelaGoTo;
	private Stack<Integer> pilha;

	public SLR() {
		this.tabelaAcao = new TabelaAcao(); // Inicializa a tabela de ação
		this.tabelaGoTo = new TabelaGoTo(); // Inicializa a tabela GOTO
		this.pilha = new Stack<>();
	}

	public boolean analisar(String[] entrada) {
		pilha.push(0);
		int i = 0;

		while (i < entrada.length) {
			String token = entrada[i];
			String acao = tabelaAcao.getAcao(pilha.peek(), token);

			if (acao == null) {
				return false; // Erro, token não esperado ou ação não definida
			}

			// Extrai o número da ação
			String numeroStr = acao.replaceAll("[^0-9]", "");
			int numero;
			try {
				numero = Integer.parseInt(numeroStr);
			} catch (NumberFormatException e) {
				return false; // Formato da ação é inválido
			}

			if (acao.startsWith("S")) {
				// Deslocamento (Shift)
				pilha.push(numero);
				i++;
			} else if (acao.startsWith("R")) {
				// Redução
				int numSimbolosParaDesempilhar;
				String naoTerminal;
				switch (numero) {
				case 1:
					numSimbolosParaDesempilhar = 1;
					naoTerminal = "<-START->";
					break;
				case 2:
					numSimbolosParaDesempilhar = 8;
					naoTerminal = "<prog>";
					break;
				case 3:
					numSimbolosParaDesempilhar = 8;
					naoTerminal = "<prog>";
					break;
				case 4:
					numSimbolosParaDesempilhar = 8;
					naoTerminal = "<prog>";
					break;
				case 5:
					numSimbolosParaDesempilhar = 8;
					naoTerminal = "<prog>";
					break;
				case 6:
					numSimbolosParaDesempilhar = 2;
					naoTerminal = "<lista_var_parametros>";
					break;
				case 7:
					numSimbolosParaDesempilhar = 2;
					naoTerminal = "<parametro>";
					break;
				case 8:
					numSimbolosParaDesempilhar = 1;
					naoTerminal = "<tipo>";
					break;
				case 9:
					numSimbolosParaDesempilhar = 1;
					naoTerminal = "<tipo>";
					break;
				case 10:
					numSimbolosParaDesempilhar = 1;
					naoTerminal = "<tipo>";
					break;
				case 11:
					numSimbolosParaDesempilhar = 8;
					naoTerminal = "<prog>";
					break;
				case 12:
					numSimbolosParaDesempilhar = 2;
					naoTerminal = "<lista_var_parametros>";
					break;
				case 13:
					numSimbolosParaDesempilhar = 3;
					naoTerminal = "<mais_parametros>";
					break;
				case 14:
					numSimbolosParaDesempilhar = 2;
					naoTerminal = "<parametro>";
					break;
				case 15:
					numSimbolosParaDesempilhar = 8;
					naoTerminal = "<prog>";
					break;
				case 16:
					numSimbolosParaDesempilhar = 3;
					naoTerminal = "<mais_parametros>";
					break;
				case 17:
					numSimbolosParaDesempilhar = 8;
					naoTerminal = "<prog>";
					break;
				case 18:
					numSimbolosParaDesempilhar = 2;
					naoTerminal = "<lista_comandos>";
					break;
				case 19:
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:
				case 25:
					numSimbolosParaDesempilhar = 1;
					naoTerminal = "<comando>";
					break;
				case 26:
					numSimbolosParaDesempilhar = 5;
					naoTerminal = "<estrutura_controle>";
					break;
				case 27:
					numSimbolosParaDesempilhar = 6;
					naoTerminal = "<estrutura_controle>";
					break;
				case 28:
					numSimbolosParaDesempilhar = 7;
					naoTerminal = "<estrutura_controle>";
					break;
				case 29:
					numSimbolosParaDesempilhar = 4;
					naoTerminal = "<declaracao_variavel>";
					break;
				case 30:
					numSimbolosParaDesempilhar = 4;
					naoTerminal = "<atribuicao>";
					break;
				case 31:
					numSimbolosParaDesempilhar = 5;
					naoTerminal = "<print>";
					break;
				case 32:
					numSimbolosParaDesempilhar = 10;
					naoTerminal = "<for>";
					break;
				case 33:
					numSimbolosParaDesempilhar = 5;
					naoTerminal = "<while>";
					break;
				case 34:
					numSimbolosParaDesempilhar = 3;
					naoTerminal = "<mais_parametros>";
					break;
				case 35:
					numSimbolosParaDesempilhar = 8;
					naoTerminal = "<prog>";
					break;
				case 36:
					numSimbolosParaDesempilhar = 2;
					naoTerminal = "<lista_comandos>";
					break;
				case 37:
					numSimbolosParaDesempilhar = 6;
					naoTerminal = "<estrutura_controle>";
					break;
				case 38:
					numSimbolosParaDesempilhar = 7;
					naoTerminal = "<estrutura_controle>";
					break;
				case 39:
					numSimbolosParaDesempilhar = 8;
					naoTerminal = "<estrutura_controle>";
					break;
				case 40:
					numSimbolosParaDesempilhar = 4;
					naoTerminal = "<declaracao_variavel>";
					break;
				case 41:
					numSimbolosParaDesempilhar = 4;
					naoTerminal = "<atribuicao>";
					break;
				case 42:
				case 43:
					numSimbolosParaDesempilhar = 3;
					naoTerminal = "<incremento>";
					break;
				case 44:
					numSimbolosParaDesempilhar = 5;
					naoTerminal = "<print>";
					break;
				case 45:
					numSimbolosParaDesempilhar = 10;
					naoTerminal = "<for>";
					break;
				case 46:
					numSimbolosParaDesempilhar = 5;
					naoTerminal = "<while>";
					break;
				case 47:
					numSimbolosParaDesempilhar = 6;
					naoTerminal = "<estrutura_controle>";
					break;
				case 48:
					numSimbolosParaDesempilhar = 3;
					naoTerminal = "<condicao>";
					break;
				case 49:
					numSimbolosParaDesempilhar = 1;
					naoTerminal = "<expressao>";
					break;
				case 50:
					numSimbolosParaDesempilhar = 1;
					naoTerminal = "<expressao>";
					break;
				case 51:
					numSimbolosParaDesempilhar = 7;
					naoTerminal = "<estrutura_controle>";
					break;
				case 52:
					numSimbolosParaDesempilhar = 8;
					naoTerminal = "<estrutura_controle>";
					break;
				case 53:
					numSimbolosParaDesempilhar = 4;
					naoTerminal = "<declaracao_variavel>";
					break;
				case 54:
					numSimbolosParaDesempilhar = 2;
					naoTerminal = "<inicializacao_variavel>";
					break;
				case 55:
					numSimbolosParaDesempilhar = 4;
					naoTerminal = "<atribuicao>";
					break;
				case 56:
				case 57:
					numSimbolosParaDesempilhar = 3;
					naoTerminal = "<incremento>";
					break;
				case 58:
					numSimbolosParaDesempilhar = 5;
					naoTerminal = "<print>";
					break;
				case 59:
					numSimbolosParaDesempilhar = 3;
					naoTerminal = "<print_conteudo>";
					break;
				case 60:
				case 61:
					numSimbolosParaDesempilhar = 1;
					naoTerminal = "<print_conteudo>";
					break;
				case 62:
					numSimbolosParaDesempilhar = 10;
					naoTerminal = "<for>";
					break;
				case 63:
					numSimbolosParaDesempilhar = 5;
					naoTerminal = "<while>";
					break;
				case 64:
					numSimbolosParaDesempilhar = 6;
					naoTerminal = "<estrutura_controle>";
					break;
				case 65:
					numSimbolosParaDesempilhar = 3;
					naoTerminal = "<condicao>";
					break;
				case 66:
				case 67:
				case 68:
				case 69:
				case 70:
					numSimbolosParaDesempilhar = 1;
					naoTerminal = "<comparador>";
				case 71:
					numSimbolosParaDesempilhar = 7; // switch ap id fp achaves <lista_cases> fchaves
					naoTerminal = "<estrutura_controle>";
					break;
				case 72:
					numSimbolosParaDesempilhar = 8; // foreach ap <tipo> id pp id fp <bloco>
					naoTerminal = "<estrutura_controle>";
					break;
				case 73:
					numSimbolosParaDesempilhar = 4; // <tipo> id <inicializacao_variavel> pv
					naoTerminal = "<declaracao_variavel>";
					break;
				case 74:
					numSimbolosParaDesempilhar = 2; // igual <expressao>
					naoTerminal = "<inicializacao_variavel>";
					break;
				case 75:
					numSimbolosParaDesempilhar = 4; // id igual <expressao> pv
					naoTerminal = "<atribuicao>";
					break;
				case 76:
					numSimbolosParaDesempilhar = 5; // print ap <print_conteudo> fp pv
					naoTerminal = "<print>";
					break;
				case 77:
					numSimbolosParaDesempilhar = 3;
					naoTerminal = "<print_conteudo>";
					break;
				case 78:
				case 79:
				case 80:
				case 81:
					numSimbolosParaDesempilhar = 1;
					naoTerminal = "<string_chars>";
					break;
				case 82:
					numSimbolosParaDesempilhar = 10;
					naoTerminal = "<for>";
					break;
				case 83:
				case 84:
					numSimbolosParaDesempilhar = 2;
					naoTerminal = "<for_inicializacao>";
					break;
				case 85:
					numSimbolosParaDesempilhar = 3;
					naoTerminal = "<declaracao_variavel_for>";
					break;
				case 86:
					numSimbolosParaDesempilhar = 3; // id igual <expressao>
					naoTerminal = "<atribuicao_for>";
					break;
				case 87:
					numSimbolosParaDesempilhar = 5; // while ap <condicao> fp <bloco>
					naoTerminal = "<while>";
					break;
				case 88:
					numSimbolosParaDesempilhar = 6; // if ap <condicao> fp <bloco> <if_else>
					naoTerminal = "<estrutura_controle>";
					break;
				case 89:
					numSimbolosParaDesempilhar = 3; // achaves <lista_comandos> fchaves
					naoTerminal = "<bloco>";
					break;
				case 90:
					numSimbolosParaDesempilhar = 3; // <expressao> <comparador> <expressao>
					naoTerminal = "<condicao>";
					break;
				case 91:
					numSimbolosParaDesempilhar = 7; // switch ap id fp achaves <lista_cases> fchaves
					naoTerminal = "<estrutura_controle>";
					break;
				case 92:
					numSimbolosParaDesempilhar = 8; // foreach ap <tipo> id pp id fp <bloco>
					naoTerminal = "<estrutura_controle>";
					break;
				case 93:
					numSimbolosParaDesempilhar = 5; // print ap <print_conteudo> fp pv
					naoTerminal = "<print>";
					break;
				case 94:
					numSimbolosParaDesempilhar = 3; // aspas <string_chars> aspas
					naoTerminal = "<print_conteudo>";
					break;
				case 95:
					numSimbolosParaDesempilhar = 2; // <string_char> <string_chars>
					naoTerminal = "<string_chars>";
					break;
				case 96:
					numSimbolosParaDesempilhar = 10; // for ap int <for_inicializacao> pv <condicao> pv <for_iteracao>
														// fp <bloco>
					naoTerminal = "<for>";
					break;
				case 97:
					numSimbolosParaDesempilhar = 3; // <tipo> id <inicializacao_variavel>
					naoTerminal = "<declaracao_variavel_for>";
					break;
				case 98:
					numSimbolosParaDesempilhar = 3; // id igual <expressao>
					naoTerminal = "<atribuicao_for>";
					break;
				case 99:
					numSimbolosParaDesempilhar = 5; // while ap <condicao> fp <bloco>
					naoTerminal = "<while>";
					break;
				case 100:
					numSimbolosParaDesempilhar = 6; // if ap <condicao> fp <bloco> <if_else>
					naoTerminal = "<estrutura_controle>";
					break;
				case 101:
					numSimbolosParaDesempilhar = 2; // else <bloco> OU else <estrutura_controle>
					naoTerminal = "<if_else>";
					break;
				case 102:
					numSimbolosParaDesempilhar = 3; // achaves <lista_comandos> fchaves
					naoTerminal = "<bloco>";
					break;
				case 103:
					numSimbolosParaDesempilhar = 7; // switch ap id fp achaves <lista_cases> fchaves
					naoTerminal = "<estrutura_controle>";
					break;
				case 104:
					numSimbolosParaDesempilhar = 7; // case const pp <lista_comandos> break pv <lista_cases>
					naoTerminal = "<lista_cases>";
					break;
				case 105:
					numSimbolosParaDesempilhar = 3; // default pp <lista_comandos>
					naoTerminal = "<lista_cases>";
					break;
				case 106:
					numSimbolosParaDesempilhar = 8; // foreach ap <tipo> id pp id fp <bloco>
					naoTerminal = "<estrutura_controle>";
					break;
				case 107:
					numSimbolosParaDesempilhar = 10; // for ap int <for_inicializacao> pv <condicao> pv <for_iteracao>
														// fp <bloco>
					naoTerminal = "<for>";
					break;
				case 108:
					numSimbolosParaDesempilhar = 3; // <tipo> id <inicializacao_variavel>
					naoTerminal = "<declaracao_variavel_for>";
					break;
				case 109:
					numSimbolosParaDesempilhar = 3; // id igual <expressao>
					naoTerminal = "<atribuicao_for>";
					break;
				case 110:
				case 111:
					numSimbolosParaDesempilhar = 2; // else <bloco> OU else <estrutura_controle>
					naoTerminal = "<if_else>";
					break;
				case 112:
					numSimbolosParaDesempilhar = 3; // achaves <lista_comandos> fchaves
					naoTerminal = "<bloco>";
					break;
				case 113:
					numSimbolosParaDesempilhar = 7; // switch ap id fp achaves <lista_cases> fchaves
					naoTerminal = "<estrutura_controle>";
					break;
				case 114:
					numSimbolosParaDesempilhar = 7; // case const pp <lista_comandos> break pv <lista_cases>
					naoTerminal = "<lista_cases>";
					break;
				case 115:
					numSimbolosParaDesempilhar = 3; // default pp <lista_comandos>
					naoTerminal = "<lista_cases>";
					break;
				case 116:
					numSimbolosParaDesempilhar = 8; // foreach ap <tipo> id pp id fp <bloco>
					naoTerminal = "<estrutura_controle>";
					break;
				case 117:
					numSimbolosParaDesempilhar = 10; // for ap int <for_inicializacao> pv <condicao> pv <for_iteracao>
														// fp <bloco>
					naoTerminal = "<for>";
					break;
				case 118:
					numSimbolosParaDesempilhar = 7; // case const pp <lista_comandos> break pv <lista_cases>
					naoTerminal = "<lista_cases>";
					break;
				case 119:
					numSimbolosParaDesempilhar = 3; // default pp <lista_comandos>
					naoTerminal = "<lista_cases>";
					break;
				case 120:
					numSimbolosParaDesempilhar = 8; // foreach ap <tipo> id pp id fp <bloco>
					naoTerminal = "<estrutura_controle>";
					break;
				case 121:
					numSimbolosParaDesempilhar = 10; // for ap int <for_inicializacao> pv <condicao> pv <for_iteracao>
														// fp <bloco>
					naoTerminal = "<for>";
					break;
				case 122:
					numSimbolosParaDesempilhar = 2;
					naoTerminal = "<for_iteracao>";
					break;
				case 123:
					numSimbolosParaDesempilhar = 2;
					naoTerminal = "<for_iteracao>";
					break;
				case 124:
					numSimbolosParaDesempilhar = 1;
					naoTerminal = "<operacao>";
					break;
				case 125:
					numSimbolosParaDesempilhar = 1;
					naoTerminal = "<operacao>";
					break;
				case 126:
					numSimbolosParaDesempilhar = 7;
					naoTerminal = "<lista_cases>";
					break;
				case 127:
					numSimbolosParaDesempilhar = 10;
					naoTerminal = "<for>";
					break;
				case 128:
				case 129:
					numSimbolosParaDesempilhar = 2;
					naoTerminal = "<for_iteracao>";
					break;
				case 130:
					numSimbolosParaDesempilhar = 7;
					naoTerminal = "<for>";
					break;
				case 131:
					numSimbolosParaDesempilhar = 10;
					naoTerminal = "<for>";
					break;
				case 132:
					numSimbolosParaDesempilhar = 7;
					naoTerminal = "<lista_cases>";
					break;
				case 133:
					numSimbolosParaDesempilhar = 7;
					naoTerminal = "<lista_cases>";
					break;
				default:
					return false; // Produção não definida
				}

				for (int j = 0; j < numSimbolosParaDesempilhar; j++) {
					pilha.pop();
				}

				Integer proximoEstado = tabelaGoTo.getProximoEstado(pilha.peek(), naoTerminal);
				if (proximoEstado != null) {
					pilha.push(proximoEstado);
				} else {
					return false; // Erro na transição de estado
				}
			} else if (acao.equals("ACC")) {
				return true; // Aceitação da entrada
			} else {
				return false; // Erro
			}
		}

		return false; // Se chegou ao fim da entrada e não aceitou, é um erro
	}
	 public static void main(String[] args) {
	        SLR analisadorSLR = new SLR();
	        
	        String[] entradaTeste = {"programa", "id", "ap","fp","achaves","fchaves","$"};
	        boolean resultado = analisadorSLR.analisar(entradaTeste);
	        if (resultado) {
	            System.out.println("Análise sintática concluída com sucesso. A entrada segue a gramática.");
	        } else {
	            System.out.println("Erro na análise sintática. A entrada não segue a gramática.");
	        }
	    }
}