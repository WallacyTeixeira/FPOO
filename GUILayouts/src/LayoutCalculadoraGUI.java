import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutCalculadoraGUI {
    public LayoutCalculadoraGUI() {
        JFrame janelaP = new JFrame("Layout calculadora");
        JPanel painelB = new JPanel();
        janelaP.getContentPane().add(painelB);
        GridLayout grid = new GridLayout(4, 4);
        painelB.setLayout(grid);
        String textBotoes[] = { "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "C", "0", "=", "/", };
        for (int i = 0; i < textBotoes.length; i++) {
            painelB.add(new JButton(textBotoes[i]));
        }
        janelaP.setDefaultCloseOperation(2);
        janelaP.pack();
        janelaP.setVisible(true);

    }
}
