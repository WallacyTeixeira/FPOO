import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculadora1 extends JPanel {
    public Calculadora1() {
        super();
        this.add(new JLabel("Calculadora 1 "));
        BorderLayout border = new BorderLayout();
        this.setLayout(border);
        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();
        JPanel painel3 = new JPanel();
        // visor geral
        JPanel painel4 = new JPanel();
        // visor 1
        JPanel painel5 = new JPanel();
        // visor 2
        JPanel painel6 = new JPanel();
        // visor 3
        JPanel painel7 = new JPanel();
        // visor 3
        JPanel painel8 = new JPanel();

        painel1.setBackground(Color.RED);
        painel2.setBackground(Color.RED);
        painel3.setBackground(Color.RED);
        // visor geral
        painel4.setBackground(Color.GREEN);
        // visor 1
        painel5.setBackground(Color.BLACK);
        // visor 2
        painel6.setBackground(Color.BLUE);
        // visor 3
        painel7.setBackground(Color.YELLOW);
        // visor 4
        painel8.setBackground(Color.PINK);

        painel1.setPreferredSize(new Dimension(50, 100));
        painel2.setPreferredSize(new Dimension(50, 50));
        painel3.setPreferredSize(new Dimension(50, 100));
        // visor geral
        painel4.setPreferredSize(new Dimension(300, 200));
        // visor 1
        painel5.setPreferredSize(new Dimension(800, 400));
        // visor 2
        painel6.setPreferredSize(new Dimension(800, 150));
        // visor 3
        painel7.setPreferredSize(new Dimension(800, 150));
        // visor 4
        painel8.setPreferredSize(new Dimension(800, 150));

        this.add(painel1, BorderLayout.WEST);
        this.add(painel2, BorderLayout.SOUTH);
        this.add(painel3, BorderLayout.EAST);
        this.add(painel4, BorderLayout.CENTER);
        painel4.add(painel5);
        painel4.add(painel6);
        painel4.add(painel7);
        painel4.add(painel8);

        for (int i = 0; i < 34; i++) {
        painel1.add(new JButton(""+i));
        }
        for (int i = 0; i < 16; i++) {
        painel2.add(new JButton(""+i + 10));
        }
        for (int i = 0; i < 34; i++) {
        painel3.add(new JButton(""+i+5));
        }
    }
}