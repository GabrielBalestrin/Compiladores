package CompiladorAuto;

import java.io.*;

public class Principal {
    public static void main(String[] args) {
        try {
            // Caminho para o arquivo de entrada
            String caminhoArquivo = "C:\\Users\\Gabriel\\OneDrive\\�rea de Trabalho\\Geral\\entrada.txt";
            
            // Criar um Reader para ler o conte�do do arquivo
            Reader reader = new FileReader(caminhoArquivo);

            // Iniciar o lexer e o parser com o reader do arquivo
            MeuLexer lexer = new MeuLexer(reader);

            // Como agora a tabela de s�mbolos � est�tica, n�o precisamos criar uma inst�ncia
            MeuParser parser = new MeuParser(lexer);
            parser.parse(); // Inicia a an�lise sint�tica e sem�ntica

            System.out.println("An�lise conclu�da com sucesso.");
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo n�o encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
