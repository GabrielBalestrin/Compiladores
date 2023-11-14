package slr;

import java.util.HashMap;
import java.util.Map;

public class TabelaAcao {
	private Map<Integer, Map<String, String>> tabela;

	public TabelaAcao() {
		tabela = new HashMap<>();

		for (int estado = 0; estado <= 133; estado++) {
			Map<String, String> acoesEstado = new HashMap<>();

			switch (estado) {
			case 0:
				acoesEstado.put("programa", "S(2)");
				break;
			case 1:
				acoesEstado.put("$", "ACC");
				break;
			case 2:
				acoesEstado.put("id", "S(3)");
				break;

			case 3:
				acoesEstado.put("ap", "S(4)");
				break;
			case 4:
				acoesEstado.put("int", "S(8)");
				acoesEstado.put("string", "S(9)");
				acoesEstado.put("char", "S(10)");
				acoesEstado.put("fp", "R(0)");
				break;
			case 5:
				acoesEstado.put("pf", "S(11)");
				break;
			case 6:
				acoesEstado.put("fp", "R(0)");
				acoesEstado.put("v", "S(13)");
				break;
			case 7:
				acoesEstado.put("id", "S(14)");
				break;
			case 8:
				acoesEstado.put("id", "R(1)");
				break;
			case 9:
				acoesEstado.put("id", "R(1)");
				break;
			case 10:
				acoesEstado.put("id", "R(1)");
				break;
			case 11:
				acoesEstado.put("achaves", "S(15)");
				break;
			case 12:
				acoesEstado.put("fp", "R(2)");
				break;
			case 13:
				acoesEstado.put("int", "S(8)");
				acoesEstado.put("string", "S(9)");
				acoesEstado.put("char", "S(10)");
				break;
			case 14:
				acoesEstado.put("fp", "R(2)");
				acoesEstado.put("v", "R(2)");
				break;
			case 15:
				acoesEstado.put("if", "S(26)");
				acoesEstado.put("switch", "S(27)");
				acoesEstado.put("while", "S(33)");
				acoesEstado.put("break", "R(0)");
				acoesEstado.put("for", "S(32)");
				acoesEstado.put("foreach", "S(28)");
				acoesEstado.put("print", "S(31)");
				acoesEstado.put("int", "S(8)");
				acoesEstado.put("string", "S(9)");
				acoesEstado.put("char", "S(10)");
				acoesEstado.put("id", "S(30)");
				acoesEstado.put("fchaves", "R(0)");
				break;
			case 16:
				acoesEstado.put("fp", "R(0)");
				acoesEstado.put("v", "S(13)");
				break;
			case 17:
				acoesEstado.put("fchaves", "S(35)");
				break;
			case 18:
				acoesEstado.put("if", "S(26)");
				acoesEstado.put("switch", "S(27)");
				acoesEstado.put("while", "S(33)");
				acoesEstado.put("break", "R(0)");
				acoesEstado.put("for", "S(32)");
				acoesEstado.put("foreach", "S(28)");
				acoesEstado.put("print", "S(31)");
				acoesEstado.put("int", "S(8)");
				acoesEstado.put("string", "S(9)");
				acoesEstado.put("char", "S(10)");
				acoesEstado.put("id", "S(30)");
				acoesEstado.put("fchaves", "R(0)");
				break;
			case 19:
				acoesEstado.put("if", "R(1)");
				acoesEstado.put("switch", "R(1)");
				acoesEstado.put("while", "R(1)");
				acoesEstado.put("break", "R(1)");
				acoesEstado.put("for", "R(1)");
				acoesEstado.put("foreach", "R(1)");
				acoesEstado.put("print", "R(1)");
				acoesEstado.put("int", "R(1)");
				acoesEstado.put("string", "R(1)");
				acoesEstado.put("char", "R(1)");
				acoesEstado.put("id", "R(1)");
				acoesEstado.put("fchaves", "R(1)");
				break;
			case 20:
				acoesEstado.put("if", "R(1)");
				acoesEstado.put("switch", "R(1)");
				acoesEstado.put("while", "R(1)");
				acoesEstado.put("break", "R(1)");
				acoesEstado.put("for", "R(1)");
				acoesEstado.put("foreach", "R(1)");
				acoesEstado.put("print", "R(1)");
				acoesEstado.put("int", "R(1)");
				acoesEstado.put("string", "R(1)");
				acoesEstado.put("char", "R(1)");
				acoesEstado.put("id", "R(1)");
				acoesEstado.put("fchaves", "R(1)");
				break;
			case 21:
				acoesEstado.put("if", "R(1)");
				acoesEstado.put("switch", "R(1)");
				acoesEstado.put("while", "R(1)");
				acoesEstado.put("break", "R(1)");
				acoesEstado.put("for", "R(1)");
				acoesEstado.put("foreach", "R(1)");
				acoesEstado.put("print", "R(1)");
				acoesEstado.put("int", "R(1)");
				acoesEstado.put("string", "R(1)");
				acoesEstado.put("char", "R(1)");
				acoesEstado.put("id", "R(1)");
				acoesEstado.put("fchaves", "R(1)");
				break;
			case 22:
				acoesEstado.put("if", "R(1)");
				acoesEstado.put("switch", "R(1)");
				acoesEstado.put("while", "R(1)");
				acoesEstado.put("break", "R(1)");
				acoesEstado.put("for", "R(1)");
				acoesEstado.put("foreach", "R(1)");
				acoesEstado.put("print", "R(1)");
				acoesEstado.put("int", "R(1)");
				acoesEstado.put("string", "R(1)");
				acoesEstado.put("char", "R(1)");
				acoesEstado.put("id", "R(1)");
				acoesEstado.put("fchaves", "R(1)");
				break;
			case 23:
				acoesEstado.put("if", "R(1)");
				acoesEstado.put("switch", "R(1)");
				acoesEstado.put("while", "R(1)");
				acoesEstado.put("break", "R(1)");
				acoesEstado.put("for", "R(1)");
				acoesEstado.put("foreach", "R(1)");
				acoesEstado.put("print", "R(1)");
				acoesEstado.put("int", "R(1)");
				acoesEstado.put("string", "R(1)");
				acoesEstado.put("char", "R(1)");
				acoesEstado.put("id", "R(1)");
				acoesEstado.put("fchaves", "R(1)");
				break;
			case 24:
				acoesEstado.put("if", "R(1)");
				acoesEstado.put("switch", "R(1)");
				acoesEstado.put("while", "R(1)");
				acoesEstado.put("break", "R(1)");
				acoesEstado.put("for", "R(1)");
				acoesEstado.put("foreach", "R(1)");
				acoesEstado.put("print", "R(1)");
				acoesEstado.put("int", "R(1)");
				acoesEstado.put("string", "R(1)");
				acoesEstado.put("char", "R(1)");
				acoesEstado.put("id", "R(1)");
				acoesEstado.put("fchaves", "R(1)");
				break;
			case 25:
				acoesEstado.put("if", "R(1)");
				acoesEstado.put("switch", "R(1)");
				acoesEstado.put("while", "R(1)");
				acoesEstado.put("break", "R(1)");
				acoesEstado.put("for", "R(1)");
				acoesEstado.put("foreach", "R(1)");
				acoesEstado.put("print", "R(1)");
				acoesEstado.put("int", "R(1)");
				acoesEstado.put("string", "R(1)");
				acoesEstado.put("char", "R(1)");
				acoesEstado.put("id", "R(1)");
				acoesEstado.put("fchaves", "R(1)");
				break;
			case 26:
				acoesEstado.put("ap", "S(37)");
				break;
			case 27:
				acoesEstado.put("ap", "S(38)");
				break;
			case 28:
				acoesEstado.put("ap", "S(39)");
				break;
			case 29:
				acoesEstado.put("id", "S(40)");
				break;
			case 30:
				acoesEstado.put("igual", "S(41)");
				acoesEstado.put("menosmenos", "S(43)");
				acoesEstado.put("maismais", "S(42)");
				break;
			case 31:
				acoesEstado.put("ap", "S(44)");
				break;
			case 32:
				acoesEstado.put("ap", "S(45)");
				break;
			case 33:
				acoesEstado.put("ap", "S(46)");
				break;
			case 34:
				acoesEstado.put("fp", "R(3)");
				break;
			case 35:
				acoesEstado.put("$", "R(8)");
				break;
			case 36:
				acoesEstado.put("break", "R(2)");
				acoesEstado.put("fchaves", "R(2)");
				break;
			case 37:
				acoesEstado.put("id", "S(49)");
				acoesEstado.put("const", "S(50)");
				break;
			case 38:
				acoesEstado.put("id", "S(51)");
				break;
			case 39:
				acoesEstado.put("int", "S(8)");
				acoesEstado.put("string", "S(9)");
				acoesEstado.put("char", "S(10)");
				break;
			case 40:
				acoesEstado.put("igual", "S(54)");
				acoesEstado.put("pv", "R(0)");
				break;
			case 41:
				acoesEstado.put("id", "S(49)");
				acoesEstado.put("const", "S(50)");
				break;
			case 42:
				acoesEstado.put("pv", "S(56)");
				break;
			case 43:
				acoesEstado.put("pv", "S(57)");
				break;
			case 44:
				acoesEstado.put("id", "S(61)");
				acoesEstado.put("const", "S(60)");
				acoesEstado.put("fp", "R(0)");
				acoesEstado.put("aspas", "S(59)");
				break;
			case 45:
				acoesEstado.put("int", "S(62)");
				break;
			case 46:
				acoesEstado.put("id", "S(49)");
				acoesEstado.put("const", "S(50)");
				break;
			case 47:
				acoesEstado.put("fp", "S(64)");
				break;
			case 48:
				acoesEstado.put("maiorq", "S(66)");
				acoesEstado.put("menorq", "S(67)");
				acoesEstado.put("menorigual", "S(68)");
				acoesEstado.put("maiorigual", "S(69)");
				acoesEstado.put("igualigual", "S(70)");
				break;
			case 49:
				acoesEstado.put("maiorq", "R(1)");
				acoesEstado.put("menorq", "R(1)");
				acoesEstado.put("menorigual", "R(1)");
				acoesEstado.put("maiorigual", "R(1)");
				acoesEstado.put("igualigual", "R(1)");
				acoesEstado.put("fp", "R(1)");
				acoesEstado.put("pv", "R(1)");
				break;
			case 50:
				acoesEstado.put("maiorq", "R(1)");
				acoesEstado.put("menorq", "R(1)");
				acoesEstado.put("menorigual", "R(1)");
				acoesEstado.put("maiorigual", "R(1)");
				acoesEstado.put("igualigual", "R(1)");
				acoesEstado.put("fp", "R(1)");
				acoesEstado.put("pv", "R(1)");
				break;
			case 51:
				acoesEstado.put("fp", "S(71)");
				break;
			case 52:
				acoesEstado.put("id", "S(72)");
				break;
			case 53:
				acoesEstado.put("pv", "S(73)");
				break;
			case 54:
				acoesEstado.put("id", "S(49)");
				acoesEstado.put("const", "S(50)");
				break;
			case 55:
				acoesEstado.put("pv", "S(75)");
				break;
			case 56:
				acoesEstado.put("if", "R(3)");
				acoesEstado.put("switch", "R(3)");
				acoesEstado.put("while", "R(3)");
				acoesEstado.put("break", "R(3)");
				acoesEstado.put("for", "R(3)");
				acoesEstado.put("foreach", "R(3)");
				acoesEstado.put("print", "R(3)");
				acoesEstado.put("int", "R(3)");
				acoesEstado.put("string", "R(3)");
				acoesEstado.put("char", "R(3)");
				acoesEstado.put("id", "R(3)");
				acoesEstado.put("fchaves", "R(3)");
				break;
			case 57:
				acoesEstado.put("if", "R(3)");
				acoesEstado.put("switch", "R(3)");
				acoesEstado.put("while", "R(3)");
				acoesEstado.put("break", "R(3)");
				acoesEstado.put("for", "R(3)");
				acoesEstado.put("foreach", "R(3)");
				acoesEstado.put("print", "R(3)");
				acoesEstado.put("int", "R(3)");
				acoesEstado.put("string", "R(3)");
				acoesEstado.put("char", "R(3)");
				acoesEstado.put("id", "R(3)");
				acoesEstado.put("fchaves", "R(3)");
				break;
			case 58:
				acoesEstado.put("fp", "S(76)");
				break;
			case 59:
				acoesEstado.put("id", "S(79)");
				acoesEstado.put("const", "S(80)");
				acoesEstado.put("aspas", "R(0)");
				acoesEstado.put("espaco", "S(81)");
				break;
			case 60:
				acoesEstado.put("fp", "R(1)");
				break;
			case 61:
				acoesEstado.put("fp", "R(1)");
				break;
			case 62:
				acoesEstado.put("int", "S(8)");
				acoesEstado.put("string", "S(9)");
				acoesEstado.put("char", "S(10)");
				acoesEstado.put("id", "S(86)");
				acoesEstado.put("pv", "R(0)");
				break;
			case 63:
				acoesEstado.put("fp", "S(87)");
				break;
			case 64:
				acoesEstado.put("achaves", "S(89)");
				break;
			case 65:
				acoesEstado.put("id", "S(49)");
				acoesEstado.put("const", "S(50)");
				break;
			case 66:
				acoesEstado.put("id", "R(1)");
				acoesEstado.put("const", "R(1)");
				break;
			case 67:
				acoesEstado.put("id", "R(1)");
				acoesEstado.put("const", "R(1)");
				break;
			case 68:
				acoesEstado.put("id", "R(1)");
				acoesEstado.put("const", "R(1)");
				break;
			case 69:
				acoesEstado.put("id", "R(1)");
				acoesEstado.put("const", "R(1)");
				break;
			case 70:
				acoesEstado.put("id", "R(1)");
				acoesEstado.put("const", "R(1)");
				break;
			case 71:
				acoesEstado.put("achaves", "S(91)");
				break;
			case 72:
				acoesEstado.put("pp", "S(92)");
				break;
			case 73:
				acoesEstado.put("if", "R(4)");
				acoesEstado.put("switch", "R(4)");
				acoesEstado.put("while", "R(4)");
				acoesEstado.put("break", "R(4)");
				acoesEstado.put("for", "R(4)");
				acoesEstado.put("foreach", "R(4)");
				acoesEstado.put("print", "R(4)");
				acoesEstado.put("int", "R(4)");
				acoesEstado.put("string", "R(4)");
				acoesEstado.put("char", "R(4)");
				acoesEstado.put("id", "R(4)");
				acoesEstado.put("fchaves", "R(4)");
				break;
			case 74:
				acoesEstado.put("pv", "R(2)");
				break;
			case 75:
				acoesEstado.put("if", "R(4)");
				acoesEstado.put("switch", "R(4)");
				acoesEstado.put("while", "R(4)");
				acoesEstado.put("break", "R(4)");
				acoesEstado.put("for", "R(4)");
				acoesEstado.put("foreach", "R(4)");
				acoesEstado.put("print", "R(4)");
				acoesEstado.put("int", "R(4)");
				acoesEstado.put("string", "R(4)");
				acoesEstado.put("char", "R(4)");
				acoesEstado.put("id", "R(4)");
				acoesEstado.put("fchaves", "R(4)");
			case 76:
				acoesEstado.put("pv", "S(93)");
				break;
			case 77:
				acoesEstado.put("aspas", "S(94)");
				break;
			case 78:
				acoesEstado.put("id", "S(79)");
				acoesEstado.put("const", "S(80)");
				acoesEstado.put("aspas", "R(0)");
				acoesEstado.put("espaco", "S(81)");
				break;
			case 79:
				acoesEstado.put("id", "R(1)");
				acoesEstado.put("const", "R(1)");
				acoesEstado.put("aspas", "R(1)");
				acoesEstado.put("espaco", "R(1)");
				break;
			case 80:
				acoesEstado.put("id", "R(1)");
				acoesEstado.put("const", "R(1)");
				acoesEstado.put("aspas", "R(1)");
				acoesEstado.put("espaco", "R(1)");
				break;
			case 81:
				acoesEstado.put("id", "R(1)");
				acoesEstado.put("const", "R(1)");
				acoesEstado.put("aspas", "R(1)");
				acoesEstado.put("espaco", "R(1)");
				break;
			case 82:
				acoesEstado.put("pv", "S(96)");
				break;
			case 83:
				acoesEstado.put("pv", "R(1)");
				break;
			case 84:
				acoesEstado.put("pv", "R(1)");
				break;
			case 85:
				acoesEstado.put("id", "S(97)");
				break;
			case 86:
				acoesEstado.put("igual", "S(98)");
				break;
			case 87:
				acoesEstado.put("achaves", "S(89)");
				break;
			case 88:
				acoesEstado.put("if", "R(0)");
				acoesEstado.put("switch", "R(0)");
				acoesEstado.put("while", "R(0)");
				acoesEstado.put("break", "R(0)");
				acoesEstado.put("for", "R(0)");
				acoesEstado.put("foreach", "R(0)");
				acoesEstado.put("print", "R(0)");
				acoesEstado.put("else", "S(101)");
				acoesEstado.put("int", "R(0)");
				acoesEstado.put("string", "R(0)");
				acoesEstado.put("char", "R(0)");
				acoesEstado.put("id", "R(0)");
				acoesEstado.put("fchaves", "R(0)");
				break;
			case 89:
				acoesEstado.put("if", "S(26)");
				acoesEstado.put("switch", "S(27)");
				acoesEstado.put("while", "S(33)");
				acoesEstado.put("break", "R(7)");
				acoesEstado.put("for", "S(32)");
				acoesEstado.put("foreach", "S(28)");
				acoesEstado.put("print", "S(31)");
				acoesEstado.put("int", "S(8)");
				acoesEstado.put("string", "S(9)");
				acoesEstado.put("char", "S(10)");
				acoesEstado.put("id", "S(30)");
				acoesEstado.put("fchaves", "R(0)");
				break;
			case 90:
				acoesEstado.put("fp", "R(3)");
				acoesEstado.put("pv", "R(3)");
				break;
			case 91:
				acoesEstado.put("case", "S(104)");
				acoesEstado.put("default", "S(105)");
				acoesEstado.put("fchaves", "R(0)");
				break;
			case 92:
				acoesEstado.put("id", "S(106)");
				break;
			case 93:
				acoesEstado.put("if", "R(5)");
				acoesEstado.put("switch", "R(5)");
				acoesEstado.put("while", "R(5)");
				acoesEstado.put("break", "R(5)");
				acoesEstado.put("for", "R(5)");
				acoesEstado.put("foreach", "R(5)");
				acoesEstado.put("print", "R(5)");
				acoesEstado.put("int", "R(5)");
				acoesEstado.put("string", "R(5)");
				acoesEstado.put("char", "R(5)");
				acoesEstado.put("id", "R(5)");
				acoesEstado.put("fchaves", "R(5)");
				break;
			case 94:
				acoesEstado.put("fp", "R(3)");
				break;
			case 95:
				acoesEstado.put("aspas", "R(2)");
				break;
			case 96:
				acoesEstado.put("id", "S(49)");
				acoesEstado.put("const", "S(50)");
				break;
			case 97:
				acoesEstado.put("igual", "S(54)");
				acoesEstado.put("pv", "R(0)");
				break;
			case 98:
				acoesEstado.put("id", "S(49)");
				acoesEstado.put("const", "S(50)");
				break;
			case 99:
				acoesEstado.put("if", "R(5)");
				acoesEstado.put("switch", "R(5)");
				acoesEstado.put("while", "R(5)");
				acoesEstado.put("break", "R(5)");
				acoesEstado.put("for", "R(5)");
				acoesEstado.put("foreach", "R(5)");
				acoesEstado.put("print", "R(5)");
				acoesEstado.put("int", "R(5)");
				acoesEstado.put("string", "R(5)");
				acoesEstado.put("char", "R(5)");
				acoesEstado.put("id", "R(5)");
				acoesEstado.put("fchaves", "R(5)");
				break;
			case 100:
				acoesEstado.put("if", "R(6)");
				acoesEstado.put("switch", "R(6)");
				acoesEstado.put("while", "R(6)");
				acoesEstado.put("break", "R(6)");
				acoesEstado.put("for", "R(6)");
				acoesEstado.put("foreach", "R(6)");
				acoesEstado.put("print", "R(6)");
				acoesEstado.put("int", "R(6)");
				acoesEstado.put("string", "R(6)");
				acoesEstado.put("char", "R(6)");
				acoesEstado.put("id", "R(6)");
				acoesEstado.put("fchaves", "R(6)");
				break;
			case 101:
				acoesEstado.put("if", "S(26)");
				acoesEstado.put("switch", "S(27)");
				acoesEstado.put("foreach", "S(28)");
				acoesEstado.put("achaves", "S(89)");
				break;
			case 102:
				acoesEstado.put("fchaves", "S(112)");
				break;
			case 103:
				acoesEstado.put("fchaves", "S(113)");
				break;
			case 104:
				acoesEstado.put("const", "S(114)");
				break;
			case 105:
				acoesEstado.put("pp", "S(115)");
				break;
			case 106:
				acoesEstado.put("fp", "S(116)");
				break;
			case 107:
				acoesEstado.put("pv", "S(117)");
				break;
			case 108:
				acoesEstado.put("pv", "R(3)");
				break;
			case 109:
				acoesEstado.put("pv", "R(3)");
				break;
			case 110:
				acoesEstado.put("if", "R(2)");
				acoesEstado.put("switch", "R(2)");
				acoesEstado.put("while", "R(2)");
				acoesEstado.put("break", "R(2)");
				acoesEstado.put("for", "R(2)");
				acoesEstado.put("foreach", "R(2)");
				acoesEstado.put("print", "R(2)");
				acoesEstado.put("int", "R(2)");
				acoesEstado.put("string", "R(2)");
				acoesEstado.put("char", "R(2)");
				acoesEstado.put("id", "R(2)");
				acoesEstado.put("fchaves", "R(2)");
				break;
			case 111:
				acoesEstado.put("if", "R(2)");
				acoesEstado.put("switch", "R(2)");
				acoesEstado.put("while", "R(2)");
				acoesEstado.put("break", "R(2)");
				acoesEstado.put("for", "R(2)");
				acoesEstado.put("foreach", "R(2)");
				acoesEstado.put("print", "R(2)");
				acoesEstado.put("int", "R(2)");
				acoesEstado.put("string", "R(2)");
				acoesEstado.put("char", "R(2)");
				acoesEstado.put("id", "R(2)");
				acoesEstado.put("fchaves", "R(2)");
				break;
			case 112:
				acoesEstado.put("if", "R(3)");
				acoesEstado.put("switch", "R(3)");
				acoesEstado.put("while", "R(3)");
				acoesEstado.put("break", "R(3)");
				acoesEstado.put("for", "R(3)");
				acoesEstado.put("foreach", "R(3)");
				acoesEstado.put("print", "R(3)");
				acoesEstado.put("else", "R(3)");
				acoesEstado.put("int", "R(3)");
				acoesEstado.put("string", "R(3)");
				acoesEstado.put("char", "R(3)");
				acoesEstado.put("id", "R(3)");
				acoesEstado.put("fchaves", "R(3)");
				break;
			case 113:
				acoesEstado.put("if", "R(7)");
				acoesEstado.put("switch", "R(7)");
				acoesEstado.put("while", "R(7)");
				acoesEstado.put("break", "R(7)");
				acoesEstado.put("for", "R(7)");
				acoesEstado.put("foreach", "R(7)");
				acoesEstado.put("print", "R(7)");
				acoesEstado.put("int", "R(7)");
				acoesEstado.put("string", "R(7)");
				acoesEstado.put("char", "R(7)");
				acoesEstado.put("id", "R(7)");
				acoesEstado.put("fchaves", "R(7)");
				break;
			case 114:
				acoesEstado.put("pp", "S(118)");
				break;
			case 115:
				acoesEstado.put("if", "S(26)");
				acoesEstado.put("switch", "S(27)");
				acoesEstado.put("while", "S(33)");
				acoesEstado.put("break", "R(7)");
				acoesEstado.put("for", "S(32)");
				acoesEstado.put("foreach", "S(28)");
				acoesEstado.put("print", "S(31)");
				acoesEstado.put("int", "S(8)");
				acoesEstado.put("string", "S(9)");
				acoesEstado.put("char", "S(10)");
				acoesEstado.put("id", "S(30)");
				acoesEstado.put("fchaves", "R(0)");
				break;
			case 116:
				acoesEstado.put("achaves", "S(89)");
				break;
			case 117:
				acoesEstado.put("id", "S(122)");
				acoesEstado.put("menosmenos", "S(125)");
				acoesEstado.put("maismais", "S(124)");
				acoesEstado.put("fp", "R(0)");
				break;
			case 118:
				acoesEstado.put("if", "S(26)");
				acoesEstado.put("switch", "S(27)");
				acoesEstado.put("while", "S(33)");
				acoesEstado.put("break", "R(0)");
				acoesEstado.put("for", "S(32)");
				acoesEstado.put("foreach", "S(28)");
				acoesEstado.put("print", "S(31)");
				acoesEstado.put("int", "S(8)");
				acoesEstado.put("string", "S(9)");
				acoesEstado.put("char", "S(10)");
				acoesEstado.put("id", "S(30)");
				acoesEstado.put("fchaves", "R(0)");
				break;
			case 119:
				acoesEstado.put("fchaves", "R(3)");
				break;
			case 120:
				acoesEstado.put("if", "R(8)");
				acoesEstado.put("switch", "R(8)");
				acoesEstado.put("while", "R(8)");
				acoesEstado.put("break", "R(8)");
				acoesEstado.put("for", "R(8)");
				acoesEstado.put("foreach", "R(8)");
				acoesEstado.put("print", "R(8)");
				acoesEstado.put("int", "R(8)");
				acoesEstado.put("string", "R(8)");
				acoesEstado.put("char", "R(8)");
				acoesEstado.put("id", "R(8)");
				acoesEstado.put("fchaves", "R(8)");
				break;
			case 121:
				acoesEstado.put("fp", "S(127)");
				break;
			case 122:
				acoesEstado.put("menosmenos", "S(125)");
				acoesEstado.put("maismais", "S(124)");
				break;
			case 123:
				acoesEstado.put("id", "S(129)");
				break;
			case 124:
				acoesEstado.put("id", "R(1)");
				acoesEstado.put("fp", "R(1)");
				break;
			case 125:
				acoesEstado.put("id", "R(1)");
				acoesEstado.put("fp", "R(1)");
				break;
			case 126:
				acoesEstado.put("break", "S(130)");
				break;
			case 127: 
				acoesEstado.put("achaves", "S(89)");
				break;
			case 128:
				acoesEstado.put("fp", "R(2)");
				break;
			case 129:
				acoesEstado.put("fp", "R(2)");
				break;
			case 130:
				acoesEstado.put("pv", "S(132)");
				break;
			case 131:
				acoesEstado.put("if", "R(10)");
				acoesEstado.put("switch", "R(10)");
				acoesEstado.put("while", "R(10)");
				acoesEstado.put("break", "R(10)");
				acoesEstado.put("for", "R(10)");
				acoesEstado.put("foreach", "R(10)");
				acoesEstado.put("print", "R(10)");
				acoesEstado.put("int", "R(10)");
				acoesEstado.put("string", "R(10)");
				acoesEstado.put("char", "R(10)");
				acoesEstado.put("id", "R(10)");
				acoesEstado.put("fchaves", "R(10)");
				break;
			case 132:
				acoesEstado.put("case", "S(104)");
				acoesEstado.put("default", "S(105)");
				acoesEstado.put("fchaves", "R(0)");
				break;
			case 133:
				acoesEstado.put("fchaves", "R(7)");
				break;
			}

			tabela.put(estado, acoesEstado);
		}
	}

	public String getAcao(int estado, String token) {
		Map<String, String> acoes = tabela.get(estado);
		return (acoes != null) ? acoes.get(token) : null;
	}

	// Métodos adicionais conforme necessário...

}
