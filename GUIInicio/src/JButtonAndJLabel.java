import javax.imageio.plugins.tiff.ExifGPSTagSet;
import javax.imageio.plugins.tiff.ExifTIFFTagSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JButtonAndJLabel {
     int cont;

    public JButtonAndJLabel() {
        JFrame janela = new JFrame("Janela Principal");
        JPanel painel = new JPanel();// painel(container)
        // adicional pinel ao frame
        janela.getContentPane().add(painel);
        // criar componentes
        JButton button = new JButton("Clique Aqui");
        JLabel text = new JLabel("Nº de Cliques");
        // Adicionar os componentes ao paneil
        painel.add(button);
        painel.add(button);
        // configurações da janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();// organiza o tamanho da janela
        janela.setVisible(true);
        //action Listener(ação para o botão)
        button.addActionListener(e -> {
            cont++;
            text.setText("Number of button clicks: " + cont);
            painel.add(new JButton(""+cont));
            janela.pack();
        });
    }
}
