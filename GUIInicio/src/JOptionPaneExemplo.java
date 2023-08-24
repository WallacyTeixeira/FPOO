import javax.swing.JOptionPane;

public class JOptionPaneExemplo extends JOptionPane {
    public JOptionPaneExemplo() {
        String infomacao = "Minha janela Dialog";
        this.showMessageDialog(
                getComponentPopupMenu(),
                infomacao,
                infomacao,
                messageType,
                icon);
    }

}
