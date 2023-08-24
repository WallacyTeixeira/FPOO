import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContainerComponentes extends JFrame {
    // atributo
    int clickCount = 0;

    // construtor
    public ContainerComponentes() {
        super("JFrame");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        JButton but = new JButton("I am a Swing button");
        JLabel texto = new JLabel("Number of button clicks: ");
        JPanel painel1 = new JPanel();
        painel1.add(but);
        painel1.add(texto);
        this.setContentPane(painel1);
        but.addActionListener(e -> {
            clickCount++;
            texto.setText("Number of button clicks: " + clickCount);
            this.add(new JButton(""+clickCount));
        });
        
        this.setVisible(true);

    }
}