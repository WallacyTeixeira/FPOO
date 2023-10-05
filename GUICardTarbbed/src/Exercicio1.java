import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio1 extends JFrame {
    private JFrame frame;
    private JPanel cardPanel;
    private CardLayout cardLayout;

    public Exercicio1() {
        // Cria uma janela principal
        frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Cria um CardLayout para gerenciar os painéis
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Cria três painéis com cores diferentes
        JPanel panel1 = createPanel("Painel 1", Color.RED);
        JPanel panel2 = createPanel("Painel 2", Color.GREEN);
        JPanel panel3 = createPanel("Painel 3", Color.BLUE);

        // Adiciona os painéis ao painel gerenciado pelo CardLayout
        cardPanel.add(panel1, "Painel 1");
        cardPanel.add(panel2, "Painel 2");
        cardPanel.add(panel3, "Painel 3");

        // Adiciona o painel gerenciado pelo CardLayout à janela principal
        frame.add(cardPanel, BorderLayout.CENTER);

        // Cria um botão "Próximo" que permite alternar para o próximo painel
        JButton nextButton = new JButton("Próximo");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Utiliza o CardLayout para exibir o próximo painel
                cardLayout.next(cardPanel);
            }
        });

        // Adiciona o botão à parte inferior da janela
        frame.add(nextButton, BorderLayout.SOUTH);

        // Torna a janela visível
        frame.setVisible(true);
    }

    private JPanel createPanel(String name, Color color) {
        // Cria um painel com um rótulo e um botão "Próximo"
        JPanel panel = new JPanel();
        panel.setBackground(color);
        JButton button = new JButton("Próximo");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Utiliza o CardLayout para exibir o próximo painel
                cardLayout.next(cardPanel);
            }
        });
        panel.add(new JLabel(name));
        panel.add(button);
        return panel;
    }

    public static void main(String[] args) {
        // Cria a aplicação Swing na thread de despacho de eventos
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Exercicio1();
            }
        });
    }
}
