import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Jframe extends JFrame{
    public Jframe() {
        super("Calculadoras");
        this.add(new Jtabbedpane());
        this.setBounds(1070, 1070, 1070, 1070);
        this.setVisible(true);
        this.setLayout(new BorderLayout());
    }
}
