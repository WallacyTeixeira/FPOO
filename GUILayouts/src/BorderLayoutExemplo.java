import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BorderLayoutExemplo {
    public BorderLayoutExemplo() {
        super();
        JFrame janelaP = new JFrame("janela principal");
        BorderLayout border = new BorderLayout();
        janelaP.add(new JButton("WEST"), BorderLayout.WEST);
        janelaP.add(new JButton("EAST"), BorderLayout.EAST);
        janelaP.add(new JButton("CENTER"), BorderLayout.CENTER);
        janelaP.add(new JButton("NORTH"), BorderLayout.NORTH);
        janelaP.add(new JButton("SOUTH"), BorderLayout.SOUTH);

        JTextField caixa1 = new JTextField(25);
        janelaP.setDefaultCloseOperation(2);
        janelaP.pack();
        janelaP.setVisible(true);
    }
}
