import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExemploGridLayout {
    public ExemploGridLayout() {
        JFrame janela1 = new JFrame("Exemplo GridLayout");
        JPanel painel1 = new JPanel();
        GridLayout grid = new GridLayout(2, 2);
        painel1.setLayout(grid);
        //adicionar Jpanel ao Jframe
        janela1.getContentPane().add(painel1);
        //add componentes ao painel
        painel1.add(new JButton("1"));
        painel1.add(new JButton("2"));
        painel1.add(new JButton("3"));
        painel1.add(new JButton("4"));
        painel1.add(new JButton("5"));
        painel1.add(new JButton("6"));
        painel1.add(new JButton("7"));
        painel1.add(new JButton("8"));
        painel1.add(new JButton("9"));
        painel1.add(new JButton("10"));
        painel1.add(new JButton("11"));
        painel1.add(new JButton("12"));
        painel1.add(new JButton("13"));
        painel1.add(new JButton("14"));
        painel1.add(new JButton("15"));
        painel1.add(new JButton("16"));
        //config janela1
        janela1.setBounds(500, 500, 500, 500);
        janela1.setDefaultCloseOperation(2);
        janela1.setVisible(true);
    }
}
