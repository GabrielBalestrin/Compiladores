package Lexer;
// Analisador Léxico 
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class At1 {
	private static final Map<String, Map<Character, String>> delta = new HashMap<>();
	static {
		// ESTADO q0
		Map<Character, String> q0Transicoes = new HashMap<>();
		// CONSTANTE
		q0Transicoes.put('0', "q20");
		q0Transicoes.put('1', "q20");
		q0Transicoes.put('2', "q20");
		q0Transicoes.put('3', "q20");
		q0Transicoes.put('4', "q20");
		q0Transicoes.put('5', "q20");
		q0Transicoes.put('6', "q20");
		q0Transicoes.put('7', "q20");
		q0Transicoes.put('8', "q20");
		q0Transicoes.put('9', "q20");

		// IDENTIFICADORES
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'I' && c != 'E' && c != 'F' && c != 'S' && c != 'W' && c != 'D' && c != 'P' && c != 'R') {
				q0Transicoes.put(c, "q28");
			}
		}

		for (char c = 'a'; c <= 'z'; c++) {
			q0Transicoes.put(c, "q28");
		}
		// PALAVRAS RESERVADAS
		q0Transicoes.put('I', "q1");
		q0Transicoes.put('E', "q3");
		q0Transicoes.put('F', "q7");
		q0Transicoes.put('S', "q10");
		q0Transicoes.put('R', "q16");
		q0Transicoes.put('D', "q21");
		q0Transicoes.put('W', "q23");
		q0Transicoes.put('P', "q29");
		// SEPARADORES (;);{;};[;]
		q0Transicoes.put('(', "q47");
		q0Transicoes.put(')', "q48");
		q0Transicoes.put('[', "q49");
		q0Transicoes.put(']', "q50");
		q0Transicoes.put('{', "q51");
		q0Transicoes.put('}', "q52");
		// OPERADORES: +;-;*;/;%;--;++;<;>;<=;>=;^;!=
		q0Transicoes.put('+', "q38");
		q0Transicoes.put('-', "q39");
		q0Transicoes.put('*', "q40");
		q0Transicoes.put('/', "q41");
		q0Transicoes.put('%', "q42");
		q0Transicoes.put('<', "q43");
		q0Transicoes.put('>', "q44");
		q0Transicoes.put('^', "q45");
		q0Transicoes.put('!', "q53");
		delta.put("q0", q0Transicoes);

		// ESTADO q1
		Map<Character, String> q1Transicoes = new HashMap<>();
		q1Transicoes.put('F', "q2");
		for (char c = '0'; c <= '9'; c++) {
			q1Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'F')
				q1Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q1Transicoes.put(c, "q28");
		}
		q1Transicoes.put(' ', "q28");
		delta.put("q1", q1Transicoes);
		// ESTADO q2
		Map<Character, String> q2Transicoes = new HashMap<>();
		for (char c = '0'; c <= '9'; c++) {
			q2Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			q2Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q2Transicoes.put(c, "q28");
		}

		delta.put("q2", q2Transicoes);
		// ESTADO q3
		Map<Character, String> q3Transicoes = new HashMap<>();
		q3Transicoes.put('L', "q4");
		for (char c = '0'; c <= '9'; c++) {
			q3Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'L')
				q3Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q3Transicoes.put(c, "q28");
		}
		delta.put("q3", q3Transicoes);
		// ESTADO q4
		Map<Character, String> q4Transicoes = new HashMap<>();
		q4Transicoes.put('S', "q5");
		for (char c = '0'; c <= '9'; c++) {
			q4Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'S')
				q4Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q4Transicoes.put(c, "q28");
		}
		delta.put("q4", q4Transicoes);
		// ESTADO q5
		Map<Character, String> q5Transicoes = new HashMap<>();
		q5Transicoes.put('E', "q6");
		for (char c = '0'; c <= '9'; c++) {
			q5Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'E')
				q5Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q5Transicoes.put(c, "q28");
		}
		delta.put("q5", q5Transicoes);
		// ESTADO q6
		Map<Character, String> q6Transicoes = new HashMap<>();
		for (char c = '0'; c <= '9'; c++) {
			q6Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'L')
				q6Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q6Transicoes.put(c, "q28");
		}
		delta.put("q6", q6Transicoes);
		// ESTADO q7
		Map<Character, String> q7Transicoes = new HashMap<>();
		q7Transicoes.put('F', "q8"); // Se encontrar 'F', transita para o estado q8
		for (char c = '0'; c <= '9'; c++) {
			q7Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'F')
				q7Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q7Transicoes.put(c, "q28");
		}
		delta.put("q7", q7Transicoes);
		// ESTADO q8
		Map<Character, String> q8Transicoes = new HashMap<>();
		q8Transicoes.put('R', "q9");
		for (char c = '0'; c <= '9'; c++) {
			q8Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'R')
				q8Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q8Transicoes.put(c, "q28");
		}
		delta.put("q8", q8Transicoes);
		// ESTADO q9
		Map<Character, String> q9Transicoes = new HashMap<>();
		q9Transicoes.put('E', "q34");
		for (char c = '0'; c <= '9'; c++) {
			q9Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'E')
				q9Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q9Transicoes.put(c, "q28");
		}
		delta.put("q9", q9Transicoes);
		// ESTADO q10
		Map<Character, String> q10Transicoes = new HashMap<>();
		q10Transicoes.put('W', "q11");
		for (char c = '0'; c <= '9'; c++) {
			q10Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'W')
				q10Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {

			q10Transicoes.put(c, "q28");
		}

		delta.put("q10", q10Transicoes);
		// ESTADO q11
		Map<Character, String> q11Transicoes = new HashMap<>();
		q11Transicoes.put('I', "q12");
		for (char c = '0'; c <= '9'; c++) {
			q11Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'I')
				q11Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q11Transicoes.put(c, "q28");
		}
		delta.put("q11", q11Transicoes);
		// ESTADO q12
		Map<Character, String> q12Transicoes = new HashMap<>();
		q12Transicoes.put('T', "q13");
		for (char c = '0'; c <= '9'; c++) {
			q12Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'T')
				q12Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q12Transicoes.put(c, "q28");
		}
		delta.put("q12", q12Transicoes);
		// ESTADO q13
		Map<Character, String> q13Transicoes = new HashMap<>();
		q13Transicoes.put('C', "q14");
		for (char c = '0'; c <= '9'; c++) {
			q13Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'C')
				q13Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q13Transicoes.put(c, "q28");
		}
		q13Transicoes.put(' ', "q28");
		delta.put("q13", q13Transicoes);
		// ESTADO q14
		Map<Character, String> q14Transicoes = new HashMap<>();
		q14Transicoes.put('H', "q15");
		for (char c = '0'; c <= '9'; c++) {
			q14Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'H')
				q14Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q14Transicoes.put(c, "q28");
		}
		delta.put("q14", q14Transicoes);
		// ESTADO q15
		Map<Character, String> q15Transicoes = new HashMap<>();
		for (char c = '0'; c <= '9'; c++) {
			q15Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			q15Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q15Transicoes.put(c, "q28");
		}
		delta.put("q15", q15Transicoes);
		// ESTADO q16
		Map<Character, String> q16Transicoes = new HashMap<>();
		q16Transicoes.put('E', "q17");
		for (char c = '0'; c <= '9'; c++) {
			q16Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'E')
				q16Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q16Transicoes.put(c, "q28");
		}
		delta.put("q16", q16Transicoes);
		// ESTADO q17
		Map<Character, String> q17Transicoes = new HashMap<>();
		q17Transicoes.put('A', "q18");
		for (char c = '0'; c <= '9'; c++) {
			q17Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'A')
				q17Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q17Transicoes.put(c, "q28");
		}
		delta.put("q17", q17Transicoes);
		// ESTADO q18
		Map<Character, String> q18Transicoes = new HashMap<>();
		q18Transicoes.put('D', "q19");
		for (char c = '0'; c <= '9'; c++) {
			q18Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'D')
				q18Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q18Transicoes.put(c, "q28");
		}
		delta.put("q18", q18Transicoes);
		// ESTADO q19
		Map<Character, String> q19Transicoes = new HashMap<>();
		for (char c = '0'; c <= '9'; c++) {
			q19Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			q19Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q19Transicoes.put(c, "q28");
		}
		delta.put("q19", q19Transicoes);
		// ESTADO q20
		Map<Character, String> q20Transicoes = new HashMap<>();
		for (char c = '0'; c <= '9'; c++) {
			q20Transicoes.put(c, "q20");
		}
		delta.put("q20", q20Transicoes);
		// ESTADO q21
		Map<Character, String> q21Transicoes = new HashMap<>();
		q21Transicoes.put('O', "q22");
		for (char c = '0'; c <= '9'; c++) {
			q21Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'O')
				q21Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q21Transicoes.put(c, "q28");
		}
		delta.put("q21", q21Transicoes);
		// ESTADO q22
		Map<Character, String> q22Transicoes = new HashMap<>();
		for (char c = '0'; c <= '9'; c++) {
			q22Transicoes.put(c, "q22");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			q22Transicoes.put(c, "q22");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q22Transicoes.put(c, "q22");
		}
		delta.put("q22", q22Transicoes);
		// ESTADO q23
		Map<Character, String> q23Transicoes = new HashMap<>();
		q23Transicoes.put('H', "q24");
		for (char c = '0'; c <= '9'; c++) {
			q23Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'H')
				q23Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q23Transicoes.put(c, "q28");
		}
		delta.put("q23", q23Transicoes);
		// ESTADO q24
		Map<Character, String> q24Transicoes = new HashMap<>();
		q24Transicoes.put('I', "q25");
		for (char c = '0'; c <= '9'; c++) {
			q24Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'I')
				q24Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q24Transicoes.put(c, "q28");
		}
		delta.put("q24", q24Transicoes);
		// ESTADO q25
		Map<Character, String> q25Transicoes = new HashMap<>();
		q25Transicoes.put('L', "q26");
		for (char c = '0'; c <= '9'; c++) {
			q25Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'L') {
				q25Transicoes.put(c, "q28");
			}
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q25Transicoes.put(c, "q28");
		}
		delta.put("q25", q25Transicoes);
		// ESTADO q26
		Map<Character, String> q26Transicoes = new HashMap<>();
		q26Transicoes.put('E', "q27");
		for (char c = '0'; c <= '9'; c++) {
			q26Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'E')
				q26Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q26Transicoes.put(c, "q28");
		}
		delta.put("q26", q26Transicoes);
		// ESTADO q27
		Map<Character, String> q27Transicoes = new HashMap<>();
		for (char c = '0'; c <= '9'; c++) {
			q27Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			q27Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q27Transicoes.put(c, "q28");
		}
		delta.put("q27", q27Transicoes);
		// ESTADO q28
		Map<Character, String> q28Transicoes = new HashMap<>();
		for (char c = '0'; c <= '9'; c++) {
			q28Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			q28Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q28Transicoes.put(c, "q28");
		}
		delta.put("q28", q28Transicoes);
		// ESTADO q29
		Map<Character, String> q29Transicoes = new HashMap<>();
		q29Transicoes.put('R', "q30");
		for (char c = '0'; c <= '9'; c++) {
			q29Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'R')
				q29Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q29Transicoes.put(c, "q28");
		}
		delta.put("q29", q29Transicoes);
		// ESTADO q30
		Map<Character, String> q30Transicoes = new HashMap<>();
		q30Transicoes.put('I', "q31");
		for (char c = '0'; c <= '9'; c++) {
			q30Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'I')
				q30Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q30Transicoes.put(c, "q28");
		}
		delta.put("q30", q30Transicoes);
		// ESTADO q31
		Map<Character, String> q31Transicoes = new HashMap<>();
		q31Transicoes.put('N', "q32");
		for (char c = '0'; c <= '9'; c++) {
			q31Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'N')
				q31Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q31Transicoes.put(c, "q28");
		}
		delta.put("q31", q31Transicoes);
		// ESTADO q32
		Map<Character, String> q32Transicoes = new HashMap<>();
		q32Transicoes.put('T', "q33");
		for (char c = '0'; c <= '9'; c++) {
			q32Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c != 'T')
				q32Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q32Transicoes.put(c, "q28");
		}
		delta.put("q32", q32Transicoes);
		// ESTADO q33
		Map<Character, String> q33Transicoes = new HashMap<>();
		for (char c = '0'; c <= '9'; c++) {
			q33Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			q33Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q33Transicoes.put(c, "q28");
		}
		delta.put("q33", q33Transicoes);
		// ESTADO q34
		Map<Character, String> q34Transicoes = new HashMap<>();
		q34Transicoes.put('A', "q35");
		for (char c = '0'; c <= '9'; c++) {
			q34Transicoes.put(c, "q28");
		}
		for (char c = 'B'; c <= 'Z'; c++) {
			if (c != 'A')
				q34Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q34Transicoes.put(c, "q28");
		}
		delta.put("q34", q34Transicoes);
		// ESTADO q35
		Map<Character, String> q35Transicoes = new HashMap<>();
		q35Transicoes.put('C', "q36");
		for (char c = '0'; c <= '9'; c++) {
			q35Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'B'; c++) {
			if (c != 'C')
				q35Transicoes.put(c, "q28");
		}
		for (char c = 'D'; c <= 'Z'; c++) {
			q35Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q35Transicoes.put(c, "q28");
		}
		delta.put("q35", q35Transicoes);
		// ESTADO q36
		Map<Character, String> q36Transicoes = new HashMap<>();
		q36Transicoes.put('H', "q37");
		for (char c = '0'; c <= '9'; c++) {
			q36Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'G'; c++) {
			q36Transicoes.put(c, "q28");
		}
		for (char c = 'I'; c <= 'Z'; c++) {
			q36Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q36Transicoes.put(c, "q28");
		}
		delta.put("q36", q36Transicoes);
		// ESTADO q37
		Map<Character, String> q37Transicoes = new HashMap<>();
		for (char c = '0'; c <= '9'; c++) {
			q37Transicoes.put(c, "q28");
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			q37Transicoes.put(c, "q28");
		}
		for (char c = 'a'; c <= 'z'; c++) {
			q37Transicoes.put(c, "q28");
		}
		delta.put("q37", q37Transicoes);
		// ESTADO q38
		Map<Character, String> q38Transicoes = new HashMap<>();
		q38Transicoes.put('+', "q55");
		delta.put("q38", q38Transicoes);

		// ESTADO q39
		Map<Character, String> q39Transicoes = new HashMap<>();
		q39Transicoes.put('-', "q56");
		delta.put("q39", q39Transicoes);
		// ESTADO q43
		Map<Character, String> q43Transicoes = new HashMap<>();
		q43Transicoes.put('=', "q57");
		delta.put("q43", q43Transicoes);
		// ESTADO q44
		Map<Character, String> q44Transicoes = new HashMap<>();
		q44Transicoes.put('=', "q58");
		delta.put("q44", q44Transicoes);
		// ESTADO q53
		Map<Character, String> q53Transicoes = new HashMap<>();
		q53Transicoes.put('=', "q54");
		delta.put("q53", q53Transicoes);
	}

	public static String formatarToken(String tipo, String lexema, int linha, int colunaInicial, int colunaFinal) {
		return String.format("<%s, %s, Linha %d, Coluna %d, Coluna %d>", tipo, lexema, linha, colunaInicial,
				colunaFinal);
	}
	public static String tipoToken(String estado) {
		if (estado.equals("q28")) {
			return "Identificador";
		} else if (estado.equals("q20")) {
			return "Constante";
		} else if (estado.equals("q2")) {
			return "Palavra Reservada";
		} else if (estado.equals("q6")) {
			return "Palavra Reservada";
		} else if (estado.equals("q9")) {
			return "Palavra Reservada: FOR";
		} else if (estado.equals("q15")) {
			return "Palavra Reservada: SWITCH";
		} else if (estado.equals("q22")) {
			return "Palavra Reservada: DO";
		} else if (estado.equals("q27")) {
			return "Palavra Reservada: WHILE";
		} else if (estado.equals("q37")) {
			return "Palavra Reservada: FOREACH";
		} else if (estado.equals("q33")) {
			return "Palavra Reservada: PRINT";
		} else if (estado.equals("q47") || estado.equals("q48") || estado.equals("q49") || estado.equals("q50")
				|| estado.equals("q51") || estado.equals("q52")) {
			return "Separador";
		} else if (estado.equals("q33") || estado.equals("q38") || estado.equals("q40") || estado.equals("q41")
				|| estado.equals("q42") || estado.equals("q43") || estado.equals("q44") || estado.equals("q45")
				|| estado.equals("q54") || estado.equals("q55") || estado.equals("q56") || estado.equals("q57")
				|| estado.equals("q58")) {
			return "Operador";
		} else {
			return "Desconhecido";
		}
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma cadeia: ");
		String entrada = ler.nextLine();
		ler.close();
		String estadoAtual = "q0";
		int posicaoAtual = 0;
		int linhaAtual = 1;
		int colunaInicial = 0;
		String lexema = "";

		while (posicaoAtual < entrada.length()) {
			char caracterAtual = entrada.charAt(posicaoAtual);

			if (caracterAtual == ' ' || caracterAtual == '\n') {
				if (estadoAtual.equals("q0")) {
					posicaoAtual++;
					colunaInicial = posicaoAtual + 1;
					if (caracterAtual == '\n') {
						linhaAtual++;
					}
					continue;
				}
			}
			if (!delta.containsKey(estadoAtual) || !delta.get(estadoAtual).containsKey(caracterAtual)) {
				if (!lexema.isEmpty()) {
					String tipoToken = tipoToken(estadoAtual);
					System.out.println(formatarToken(tipoToken, lexema, linhaAtual, colunaInicial, posicaoAtual - 1));
					lexema = "";
					estadoAtual = "q0";
					colunaInicial = posicaoAtual + 1;
					continue;
				} else {
					System.out.println("Erro: Sequência inválida na linha " + linhaAtual + ", coluna "
							+ (posicaoAtual - colunaInicial + 1));
					estadoAtual = "q0";
					colunaInicial = posicaoAtual + 1;
					posicaoAtual++;
					continue;
				}
			} else {
				estadoAtual = delta.get(estadoAtual).get(caracterAtual);
				lexema += caracterAtual;
				posicaoAtual++;
			}
		}
		if (!lexema.isEmpty()) {
			String tipoToken = tipoToken(estadoAtual);
			System.out.println(formatarToken(tipoToken, lexema, linhaAtual, colunaInicial, posicaoAtual - 1));
			lexema = "";
			estadoAtual = "q0";
			colunaInicial = posicaoAtual + 1;
		}
	}
}
