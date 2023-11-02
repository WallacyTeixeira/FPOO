import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;

public class CadastroAgendas extends JPanel{
    //atributos
    private JTextField inputData;
    private JTextField inputHora;
    private JTextField inputUsuario;
    private JTextField inputDescricao;
    private DefaultTableModel tableModel;
    private JTable table;
    private List<Agenda> agendas = new ArrayList<>();
    private int linhaSelecionada = -1;
    //construtor
    public CadastroAgendas() {

        //Construção da Tabelas de Agendas
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Data");
        tableModel.addColumn("Hora");
        tableModel.addColumn("Usuário");
        tableModel.addColumn("Descrição");
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        //add componentes
        inputData = new JTextField(8);
        inputHora = new JTextField(5);
        inputUsuario = new JTextField(10);
        inputDescricao = new JTextField(20);
        JButton cadastrarButton = new JButton("Cadastrar");
        JButton atualizarButton = new JButton("Atualizar");
        JButton apagarButton = new JButton("Apagar");
        JButton salvarButton = new JButton("Salvar");
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Data:"));
        inputPanel.add(inputData);
        inputPanel.add(new JLabel("Hora:"));
        inputPanel.add(inputHora);
        inputPanel.add(new JLabel("Usuário:"));
        inputPanel.add(inputUsuario);
        inputPanel.add(new JLabel("Descrição:"));
        inputPanel.add(inputDescricao);
        inputPanel.add(cadastrarButton);
        inputPanel.add(atualizarButton);
        inputPanel.add(apagarButton);
        inputPanel.add(salvarButton);

        //set do Layout
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

    }
}
