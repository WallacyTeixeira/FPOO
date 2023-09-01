import javax.swing.*;

import java.awt.BorderLayout;

public class BoxLayoutExemplo extends JFrame{
    public BoxLayoutExemplo() {
        super("exemplo Box Layout");
        BorderLayout border = new BorderLayout();
        this.setLayout(border);
        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();
        this.add(painel1, BorderLayout. WEST);
        this.add(painel2, BorderLayout. SOUTH);
        painel1.setLayout(new BoxLayout(painel1, BoxLayout.Y_AXIS));
        painel2.setLayout(new BoxLayout(painel2, BoxLayout.X_AXIS));
        for (int i = 0; i < 5; i++) {
            painel1.add(new JButton(""+i+1));
            painel2.add(new JButton(""+i+1));
        }

        this.setDefaultCloseOperation(1);
        this.pack();
        this.setVisible(true);
    }
}
