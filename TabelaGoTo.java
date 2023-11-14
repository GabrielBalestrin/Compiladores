package slr;

import java.util.HashMap;
import java.util.Map;


public class TabelaGoTo {
	private Map<Integer, Map<String, Integer>> tabela;

	public TabelaGoTo() {
		tabela = new HashMap<>();

		for (int estado = 0; estado <= 133; estado++) {
			Map<String, Integer> desviosEstado = new HashMap<>();
			
			switch (estado) {
			case 0:
				desviosEstado.put("<prog>", 1);
				break;
			case 4:
				desviosEstado.put("<lista_var_parametros>", 5);
				desviosEstado.put("<parametro>", 6);
				desviosEstado.put("<tipo>", 7);
				break;
			case 6:
				desviosEstado.put("<mais_parametros>", 12);
				break;
			case 13:
				desviosEstado.put("<parametro>", 16);
				desviosEstado.put("<tipo>", 7);
				break;
			case 15:
				desviosEstado.put("<lista_comandos>", 17);
				desviosEstado.put("<comando>", 18);
				desviosEstado.put("<estrutura_controle>", 19);
				desviosEstado.put("<tipo>", 29);
				desviosEstado.put("<atribuicao>", 21);
				desviosEstado.put("<print>", 22);
				desviosEstado.put("<declaracao_variavel>", 20);
				desviosEstado.put("<for>", 23);
				desviosEstado.put("<while>", 24);
				desviosEstado.put("<incremento>", 25);
				break;
			case 16:
				desviosEstado.put("<mais_parametros>", 34);
				break;
			case 18:
				desviosEstado.put("<lista_comandos>", 36);
				desviosEstado.put("<comando>", 18);
				desviosEstado.put("<estrutura_controle>", 19);
				desviosEstado.put("<tipo>", 29);
				desviosEstado.put("<atribuicao>", 21);
				desviosEstado.put("<print>", 22);
				desviosEstado.put("<declaracao_variavel>", 20);
				desviosEstado.put("<for>", 23);
				desviosEstado.put("<while>", 24);
				desviosEstado.put("<incremento>", 25);
				break;
			case 37:
				desviosEstado.put("<condicao>", 47);
				desviosEstado.put("<expressao>", 48);
			case 39:
				desviosEstado.put("<tipo>", 52);
				break;
			case 40:
				desviosEstado.put("<inicializacao_variavel>", 53);
				break;
			case 41:
				desviosEstado.put("<expressao>", 55);
				break;
			case 44:
				desviosEstado.put("<print_conteudo>", 58);
				break;
			case 46:
				desviosEstado.put("<condicao>", 63);
				desviosEstado.put("<expressao>", 48);
				break;
			case 48:
				desviosEstado.put("<comparador>", 65);
				break;
			case 54:
				desviosEstado.put("<expressao>", 74);
				break;
			case 59:
				desviosEstado.put("<string_chars>", 77);
				desviosEstado.put("<string_char>", 78);
				break;
			case 62:
				desviosEstado.put("<tipo>", 85);
				desviosEstado.put("<for_inicializacao>", 82);
				desviosEstado.put("<declaracao_variavel_for>", 83);
				desviosEstado.put("<atribuicao_for>", 84);
				break;
			case 64:
				desviosEstado.put("<bloco>", 88);
				break;
			case 65:
				desviosEstado.put("<expressao>", 90);
				break;
			case 78:
				desviosEstado.put("<string_chars>", 95);
				desviosEstado.put("<string_char>", 78);
				break;
			case 87:
				desviosEstado.put("<bloco>", 99);
				break;
			case 88:
				desviosEstado.put("<if_else>", 100);
				break;
			case 89:
				desviosEstado.put("<lista_comandos>", 102);
				desviosEstado.put("<comando>", 18);
				desviosEstado.put("<estrutura_controle>", 19);
				desviosEstado.put("<tipo>", 29);
				desviosEstado.put("<atribuicao>", 21);
				desviosEstado.put("<print>", 22);
				desviosEstado.put("<declaracao_variavel>", 20);
				desviosEstado.put("<for>", 23);
				desviosEstado.put("<while>", 24);
				desviosEstado.put("<incremento>", 25);
				break;
			case 91:
				desviosEstado.put("<lista_cases>", 103);
				break;
			case 96:
				desviosEstado.put("<condicao>", 107);
				desviosEstado.put("<expressao>", 48);
				break;
			case 97:
				desviosEstado.put("<<inicializacao_variavel>>", 108);
				break;
			case 98:
				desviosEstado.put("<expressao>", 109);
				break;
			case 101:
				desviosEstado.put("<estrutura_controle>", 111);
				desviosEstado.put("<bloco>", 110);
				break;
			case 115:
				desviosEstado.put("<lista_comandos>", 119);
				desviosEstado.put("<comando>", 18);
				desviosEstado.put("<estrutura_controle>", 19);
				desviosEstado.put("<tipo>", 29);
				desviosEstado.put("<atribuicao>", 21);
				desviosEstado.put("<print>", 22);
				desviosEstado.put("<declaracao_variavel>", 20);
				desviosEstado.put("<for>", 23);
				desviosEstado.put("<while>", 24);
				desviosEstado.put("<incremento>", 25);
				break;
			case 116:
				desviosEstado.put("<bloco>", 120);
				break;
			case 117:
				desviosEstado.put("<operacao>", 123);
				desviosEstado.put("<for_iteracao>", 121);
				break;
			case 118:
				desviosEstado.put("<lista_comandos>", 126);
				desviosEstado.put("<comando>", 18);
				desviosEstado.put("<estrutura_controle>", 19);
				desviosEstado.put("<tipo>", 29);
				desviosEstado.put("<atribuicao>", 21);
				desviosEstado.put("<print>", 22);
				desviosEstado.put("<declaracao_variavel>", 20);
				desviosEstado.put("<for>", 23);
				desviosEstado.put("<while>", 24);
				desviosEstado.put("<incremento>", 25);
				break;
			case 122:
				desviosEstado.put("<operacao>", 128);
				break;
			case 127:
				desviosEstado.put("<bloco>", 131);
				break;
			case 132:
				desviosEstado.put("<lista_cases>", 133);
				break;
			}

			tabela.put(estado, desviosEstado);
		}
	}

	public Integer getProximoEstado(int estado, String simbolo) {
		Map<String, Integer> desvios = tabela.get(estado);
		return (desvios != null) ? desvios.get(simbolo) : null;
	}
	// Métodos adicionais conforme necessário...
}
