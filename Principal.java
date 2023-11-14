package slr;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        String entrada = "PROGRAMA aaa (){}";
        Lexico analisadorLexico = new Lexico();
        List<Token> tokens = analisadorLexico.analisar(entrada);

        // Imprime os tokens gerados pelo analisador léxico
        for (Token token : tokens) {
            System.out.println(Lexico.formatarToken(token.getTipo(), token.getLexema(), token.getLinha(),
                    token.getColunaInicial(), token.getColunaFinal()));
        }

        // Prepara a entrada para o analisador sintático SLR
        String[] entradaSLR = tokens.stream().map(Token::getTipo).toArray(String[]::new);
     // Supondo que getTipo retorna uma String representando o tipo do token.

        // Cria e executa o analisador sintático SLR
        SLR analisadorSLR = new SLR();
        boolean resultado = analisadorSLR.analisar(entradaSLR);

        // Imprime o resultado da análise sintática
        if (resultado) {
            System.out.println("Análise sintática concluída com sucesso. A entrada segue a gramática.");
        } else {
            System.out.println("Erro na análise sintática. A entrada não segue a gramática.");
        }
    }
}
