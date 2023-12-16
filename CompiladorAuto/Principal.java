package CompiladorAuto;

import java.io.*;

public class Principal {
    public static void main(String[] args) {
        try {
            // Caminho para o arquivo de entrada
            String caminhoArquivo = "C:\\Users\\Gabriel\\OneDrive\\Área de Trabalho\\Geral\\entrada.txt";
            
            // Criar um Reader para ler o conteúdo do arquivo
            Reader reader = new FileReader(caminhoArquivo);

            // Iniciar o lexer e o parser com o reader do arquivo
            MeuLexer lexer = new MeuLexer(reader);

            // Como agora a tabela de símbolos é estática, não precisamos criar uma instância
            MeuParser parser = new MeuParser(lexer);
            parser.parse(); // Inicia a análise sintática e semântica

            System.out.println("Análise concluída com sucesso.");
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
