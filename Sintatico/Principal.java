package Sintatico;

import java.util.List;

public class Principal {

	
	    public static void main(String[] args) {
	        String entrada = "PROGRAMA aaa() { }";
	       Lexico analisador = new Lexico();
	        List<Token> tokens = analisador.analisar(entrada);
	        for (Token token : tokens) {
	            System.out.println(Lexico.formatarToken(token.getTipo(), token.getLexema(), token.getLinha(), token.getColunaInicial(), token.getColunaFinal()));
	            
	        }
	        sintatico analisadorSintatico = new sintatico(tokens);
            if (analisadorSintatico.prog()) {
                System.out.println("Análise sintática concluída com sucesso!");
            } else {
                System.out.println("Erro na análise sintática.");
            }
	    }
}
