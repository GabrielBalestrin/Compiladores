package CompiladorAuto;

import javax.management.remote.JMXServerErrorException;
import javax.sql.rowset.serial.SerialException;
import javax.swing.*;

import java_cup.runtime.Symbol;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.StringReader;

public class CompiladorGUI {
    private JFrame frame;
    private JTextArea textAreaInput;
    private JTextArea textAreaLexical;
    private JTextArea textAreaSyntax;
    private JTextArea textAreaSemantic;
    private JButton btnAnalyze;

    public CompiladorGUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Compilador");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1, 2));

        // Painel de entrada
        JPanel inputPanel = new JPanel(new BorderLayout());
        JLabel labelInput = new JLabel("Entrada do Programa");
        textAreaInput = new JTextArea();
        inputPanel.add(labelInput, BorderLayout.NORTH);
        inputPanel.add(new JScrollPane(textAreaInput), BorderLayout.CENTER);

        // Painel de resultados
        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new BoxLayout(resultPanel, BoxLayout.Y_AXIS));

        // R�tulos e �reas de texto para cada resultado
        JLabel labelLexical = new JLabel("Resultados L�xicos");
        textAreaLexical = new JTextArea();
        JLabel labelSyntax = new JLabel("Resultados Sint�ticos");
        textAreaSyntax = new JTextArea();
        JLabel labelSemantic = new JLabel("Resultados Sem�nticos");
        textAreaSemantic = new JTextArea();

        // Adicionar bot�o de an�lise
        btnAnalyze = new JButton("Analisar");
        btnAnalyze.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnAnalyze.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                runAnalysis();
            }
        });

        // Adicionando componentes ao painel de resultados
        resultPanel.add(labelLexical);
        resultPanel.add(new JScrollPane(textAreaLexical));
        resultPanel.add(labelSyntax);
        resultPanel.add(new JScrollPane(textAreaSyntax));
        resultPanel.add(labelSemantic);
        resultPanel.add(new JScrollPane(textAreaSemantic));
        resultPanel.add(btnAnalyze);

        frame.add(inputPanel);
        frame.add(resultPanel);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
    }

    private void runAnalysis() {
        String sourceCode = textAreaInput.getText();
        StringReader reader = new StringReader(sourceCode);

        MeuLexer lexer = new MeuLexer(reader);
        MeuParser parser = new MeuParser(lexer);

        textAreaLexical.setText("");
        textAreaSyntax.setText("");
        textAreaSemantic.setText("");

        try {
            // An�lise L�xica
            while (true) {
                Symbol token = lexer.next_token();
                if (token.sym == Sym.EOF) {
                    break;
                }
                textAreaLexical.append("Token: " + Sym.terminalNames[token.sym] + ", Lexema: " + token.value + "\n");
            }

            // Resetando o lexer para a an�lise sint�tica
            lexer.yyreset(new StringReader(sourceCode));

            // An�lise Sint�tica e Sem�ntica
            parser.parse();
            textAreaSyntax.append("An�lise Sint�tica bem-sucedida.\n");
            textAreaSemantic.append("An�lise Sem�ntica bem-sucedida.\n");
        } catch (Exception e) {
            if (e instanceof JMXServerErrorException) {
                textAreaSyntax.append("Erro Sint�tico: " + e.getMessage() + "\n");
            } else if (e instanceof SerialException) {
                textAreaSemantic.append("Erro Sem�ntico: " + e.getMessage() + "\n");
            } else {
                textAreaSyntax.append("Erro: " + e.getMessage() + "\n");
            }
        }
    }


    public void show() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                CompiladorGUI window = new CompiladorGUI();
                window.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
