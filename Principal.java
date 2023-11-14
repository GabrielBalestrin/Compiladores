package slr;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        String entrada = "PROGRAMA aaa (){}";
        Lexico analisadorLexico = new Lexico();
        List<Token> tokens = analisadorLexico.analisar(entrada);

        // Imprime os tokens gerados pelo analisador l�xico
        for (Token token : tokens) {
            System.out.println(Lexico.formatarToken(token.getTipo(), token.getLexema(), token.getLinha(),
                    token.getColunaInicial(), token.getColunaFinal()));
        }

        // Prepara a entrada para o analisador sint�tico SLR
        String[] entradaSLR = tokens.stream().map(Token::getTipo).toArray(String[]::new);
     // Supondo que getTipo retorna uma String representando o tipo do token.

        // Cria e executa o analisador sint�tico SLR
        SLR analisadorSLR = new SLR();
        boolean resultado = analisadorSLR.analisar(entradaSLR);

        // Imprime o resultado da an�lise sint�tica
        if (resultado) {
            System.out.println("An�lise sint�tica conclu�da com sucesso. A entrada segue a gram�tica.");
        } else {
            System.out.println("Erro na an�lise sint�tica. A entrada n�o segue a gram�tica.");
        }
    }
}
