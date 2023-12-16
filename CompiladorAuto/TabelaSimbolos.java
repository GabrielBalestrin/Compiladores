	package CompiladorAuto;
	
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Stack;
	
	public class TabelaSimbolos {
		private static Map<String, InfoVariavel> tabela = new HashMap<>();
	    private static Stack<String> escopo = new Stack<>();
	
	    public TabelaSimbolos() {
	        tabela = new HashMap<>();
	        escopo = new Stack<>();
	    }
	
	    public static void entrarEscopo(String nomeEscopo) {
	        escopo.push(nomeEscopo);
	    }
	
	    public static void sairEscopo() {
	        if (!escopo.isEmpty()) {
	            escopo.pop();
	        }
	    }
	
	    public static void adicionar(String nome, InfoVariavel info) {
	        if (!escopo.isEmpty()) {
	            info.setEscopo(escopo.peek());
	        }
	        tabela.put(nome, info);
	    }
	
	    public static boolean existe(String nome) {
	        return tabela.containsKey(nome);
	    }
	
	    public InfoVariavel buscar(String nome) {
	        return tabela.get(nome);
	    }
	
	 
	}
