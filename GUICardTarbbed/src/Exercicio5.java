import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.*;

public class Exercicio5 extends JFrame {

    int pontuacao = 0;

    public Exercicio5() {
        super("Exercicio 3 - HLC");
        // criar um Painel Principal -> CardLayout
        JPanel mainPanel = new JPanel();
        CardLayout cl = new CardLayout();
        mainPanel.setLayout(cl);

        // add painel principal ao frame
        this.add(mainPanel);

        // criar os cards da aplicação
        // card1- tela Início
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Tela 1 - Seja Bem Vindo"));
        JButton but1 = new JButton("Inicio");
        card1.add(but1);
        mainPanel.add(card1, "Inicio");

        // card2- primeiro Quiz
        JPanel card2 = new JPanel();
        card2.add(new JLabel("Tela 2 - primeiro Quiz"));
        JButton but2 = new JButton("Next");
        card2.add(but2);
        mainPanel.add(card2, "1");

        // card3- segundo Quiz
        JPanel card3 = new JPanel();
        card3.add(new JLabel("Tela 3 - segundo Quiz"));
        JButton but3 = new JButton("Next");
        card3.add(but3);
        mainPanel.add(card3, "2");

        // card4- terceiro Quiz
        JPanel card4 = new JPanel();
        card4.add(new JLabel("Tela 4 - terceiro Quiz"));
        JButton but4 = new JButton("Next");
        card4.add(but4);
        mainPanel.add(card4, "3");

        // card5- final
        JPanel card5 = new JPanel();
        card5.add(new JLabel("Obrigado por Jogar"));
        JLabel pontucaoaFinal = new JLabel(" Sua pontuação Foi de " + pontuacao);
        card5.add(pontucaoaFinal);
        JButton but5 = new JButton("Jogar Novamente");
        card5.add(but5);// criei o botão e coloquei a ação
        but5.addActionListener(e -> {
            cl.first(mainPanel);
            pontuacao = 0;
        });
        card5.add(but5);
        mainPanel.add(card5, "4");

        // Quiz do card2
        JLabel perguntaCard2 = new JLabel("Qual é a capital da França?");
        JRadioButton alternativa1 = new JRadioButton("Londres");
        JRadioButton alternativa2 = new JRadioButton("Berlim");
        JRadioButton alternativa3 = new JRadioButton("Paris");

        // Crie um grupo de botões de opção para garantir que apenas uma opção seja
        // selecionada
        ButtonGroup grupoAlternativas = new ButtonGroup();
        grupoAlternativas.add(alternativa1);
        grupoAlternativas.add(alternativa2);
        grupoAlternativas.add(alternativa3);

        // Adicione os componentes ao card2
        card2.add(perguntaCard2);
        card2.add(alternativa1);
        card2.add(alternativa2);
        card2.add(alternativa3);

        // Adicione um botão para verificar a resposta
        JButton verificarRespostaButton = new JButton("Verificar Resposta");
        card2.add(verificarRespostaButton);

        // Adicione um ActionListener para verificar a resposta quando o botão for
        // clicado
        verificarRespostaButton.addActionListener(e -> {
            if (alternativa3.isSelected()) {
                // Resposta correta
                JLabel resultadoLabel = new JLabel("Resposta correta! Paris é a capital da França.");
                card2.add(resultadoLabel);

                pontuacao++;
            } else {
                // Resposta incorreta
                JLabel resultadoLabel = new JLabel("Resposta incorreta. Tente novamente.");
                card2.add(resultadoLabel);
            }
            revalidate(); // Atualiza o painel para exibir a mensagem de resultado
        });

        // Quiz do card3
        JLabel perguntaCard3 = new JLabel("Qual é o maior planeta?");
        JRadioButton opção1 = new JRadioButton("Júpiter");
        JRadioButton opção2 = new JRadioButton("Vênus");
        JRadioButton opção3 = new JRadioButton("Terra");

        // Crie um novo grupo de botões de opção para esta pergunta
        ButtonGroup grupoCard3 = new ButtonGroup();
        grupoCard3.add(opção1);
        grupoCard3.add(opção2);
        grupoCard3.add(opção3);

        // Adicione os componentes ao card3
        card3.add(perguntaCard3);
        card3.add(opção1);
        card3.add(opção2);
        card3.add(opção3);

        // Adicione um botão para verificar a resposta no card3
        JButton verificarRespostaCard3 = new JButton("Verificar Resposta");
        card3.add(verificarRespostaCard3);

        // Adicione um ActionListener para verificar a resposta quando o botão for
        // clicado
        verificarRespostaCard3.addActionListener(e -> {
            if (opção1.isSelected()) {
                // Resposta correta
                JLabel resultado = new JLabel("Resposta correta! Júpiter é o maior planeta do nosso sistema solar.");
                card3.add(resultado);

                pontuacao++;
            } else {
                // Resposta incorreta
                JLabel resultado = new JLabel("Resposta incorreta. Tente novamente.");
                card3.add(resultado);
            }
            revalidate(); // Atualiza o painel para exibir a mensagem de resultado
        });

        // Quiz do card4
        JLabel perguntaCard4 = new JLabel("Qual é a capital do Brasil em 1763?");
        JRadioButton opçãoA = new JRadioButton("Rio de Janeiro");
        JRadioButton opçãoB = new JRadioButton("Salvador");
        JRadioButton opçãoC = new JRadioButton("Brasília");

        // Crie um novo grupo de botões de opção para esta pergunta
        ButtonGroup grupoCard4 = new ButtonGroup();
        grupoCard4.add(opçãoA);
        grupoCard4.add(opçãoB);
        grupoCard4.add(opçãoC);

        // Adicione os componentes ao card4
        card4.add(perguntaCard4);
        card4.add(opçãoA);
        card4.add(opçãoB);
        card4.add(opçãoC);

        // Adicione um botão para verificar a resposta no card4
        JButton verificarRespostaCard4 = new JButton("Verificar Resposta");
        card4.add(verificarRespostaCard4);

        // Adicione um ActionListener para verificar a resposta quando o botão for
        // clicado
        verificarRespostaCard4.addActionListener(e -> {
            if (opçãoA.isSelected()) {
                // Resposta correta
                JLabel respostaCard4 = new JLabel("Resposta correta! A capital do Brasil em 1763 era Rio de Janeiro.");
                card4.add(respostaCard4);

                pontuacao++;
            } else {
                // Resposta incorreta
                JLabel respostaCard4 = new JLabel("Resposta incorreta. Tente novamente.");
                card4.add(respostaCard4);
            }
            revalidate(); // Atualiza o painel para exibir a mensagem de resultado
        });
        // Resultado no card5

        // set do Frame
        this.setDefaultCloseOperation(2);// definindo a função do X do Frame
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);

        // criar as ações para os botões
        but1.addActionListener(e -> {
            cl.show(mainPanel, "1");
        });
        but2.addActionListener(e -> {
            cl.show(mainPanel, "2");
        });
        but3.addActionListener(e -> {
            cl.show(mainPanel, "3");
        });
        but4.addActionListener(e -> {
            cl.show(mainPanel, "4");
        });
        but5.addActionListener(e -> {
            cl.show(mainPanel, "Inicio");
        });

    }
}