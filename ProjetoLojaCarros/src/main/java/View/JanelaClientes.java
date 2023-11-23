package View;

import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Controller.ClientesControl;
import Controller.ClientesDAO;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

import Model.Clientes;

public class JanelaClientes extends JPanel {
    private JButton cadastrar, apagar, editar;
    private JTextField clintNome, clintEndereço, clintContato, clintCPF;
    private List<Clientes> clientes;
    private JTable table;
    private DefaultTableModel tableModel;
    private int linhaSelecionada = -1;

    public JanelaClientes() {
        super();
        // entrada de dados
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel("Histórico de Clientes"));
        JPanel inputPanel = new JPanel();

        inputPanel.setLayout(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Nome"));
        clintNome = new JTextField(20);
        inputPanel.add(clintNome);

        inputPanel.add(new JLabel("Endereço"));
        clintEndereço = new JTextField(20);
        inputPanel.add(clintEndereço);

        inputPanel.add(new JLabel("Contato"));
        clintContato = new JTextField(20);
        inputPanel.add(clintContato);

        inputPanel.add(new JLabel("CPF"));
        clintCPF = new JTextField(20);
        inputPanel.add(clintCPF);

        add(inputPanel);
        JPanel botoes = new JPanel();
        botoes.add(cadastrar = new JButton("Cadastrar"));
        botoes.add(editar = new JButton("Editar"));
        botoes.add(apagar = new JButton("Apagar"));
        add(botoes);
        // tabela de clientes
        JScrollPane jSPane = new JScrollPane();
        add(jSPane);
        tableModel = new DefaultTableModel(new Object[][] {},
                new String[] { "Nome", "Endereço", "Contato", "CPF" });
        table = new JTable(tableModel);
        jSPane.setViewportView(table);
        // Cria o banco de dados caso não tenha sido criado
        new ClientesDAO().criaTabela();

        // incluindo elementos do banco na criação do painel
        atualizar();

        // tratamento de Eventos
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    clintNome.setText((String) table.getValueAt(linhaSelecionada, 0));
                    clintEndereço.setText((String) table.getValueAt(linhaSelecionada, 1));
                    clintContato.setText((String) table.getValueAt(linhaSelecionada, 2));
                    clintCPF.setText((String) table.getValueAt(linhaSelecionada, 3));
                }
            }
        });

        // Cria um objeto operacoes da classe ClientesControl para executar operações no
        // banco de dados
        ClientesControl operacoes = new ClientesControl(clientes, tableModel, table);

        // Configura a ação do botão "cadastrar" para adicionar um novo registro no
        // banco de dados
        cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Chama o método "cadastrar" do objeto operacoes com os valores dos campos de
                // entrada
                operacoes.cadastrar(clintNome.getText(), clintEndereço.getText(),
                        Integer.parseInt(clintContato.getText()), Integer.parseInt(clintCPF.getText()));

                // Limpa os campos de entrada após a operação de cadastro
                clintNome.setText("");
                clintEndereço.setText("");
                clintContato.setText("");
                clintCPF.setText("");
            }
        });

        // Configura a ação do botão "editar" para atualizar um registro no banco de
        // dados
        editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                operacoes.atualizar(clintNome.getText(), clintEndereço.getText(),
                        Integer.parseInt(clintContato.getText()), Integer.parseInt(clintCPF.getText()));
                // Limpa os campos de entrada após a operação de atualização
                clintNome.setText("");
                clintEndereço.setText("");
                clintContato.setText("");
                clintCPF.setText("");
            }
        });

        // Configura a ação do botão "apagar" para excluir um registro no banco de dados
        apagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Chama o método "apagar" do objeto operacoes com o valor do campo de entrada
                // "CPF"
                operacoes.apagar(Integer.parseInt(clintCPF.getText()));

                // Limpa os campos de entrada após a operação de exclusão
                clintNome.setText("");
                clintEndereço.setText("");
                clintContato.setText("");
                clintCPF.setText("");
            }
        });

    }

    // atualizar Tabela de Clientes com o Banco de Dados
    private void atualizar() {
        // atualizar tabela pelo banco de dados
        tableModel.setRowCount(0);
        clientes = new ClientesDAO().listarTodos();
        for (Clientes cliente : clientes) {
            tableModel.addRow(new Object[] { cliente.getNome(), cliente.getEndereco(), cliente.getContato(),
                    cliente.getCPF() });
        }
    }
}
