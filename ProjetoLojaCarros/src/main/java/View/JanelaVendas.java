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

import Controller.VendasControl;
import Controller.VendasDAO;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

import Model.Vendas;

public class JanelaVendas extends JPanel {
    private JButton cadastrar, apagar, editar;
    private JTextField vendaComprador, vendaModelo, vendaData, vendaValor;
    private List<Vendas> vendas;
    private JTable table;
    private DefaultTableModel tableModel;
    private int linhaSelecionada = -1;

    public JanelaVendas() {
        super();
        // entrada de dados
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel("Historico de vendas"));
        JPanel inputPanel = new JPanel();

        inputPanel.setLayout(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Comprador"));
        vendaComprador = new JTextField(20);
        inputPanel.add(vendaComprador);

        inputPanel.add(new JLabel("Modelo"));
        vendaModelo = new JTextField(20);
        inputPanel.add(vendaModelo);

        inputPanel.add(new JLabel("Data"));
        vendaData = new JTextField(20);
        inputPanel.add(vendaData);

        inputPanel.add(new JLabel("Valor"));
        vendaValor = new JTextField(20);
        inputPanel.add(vendaValor);

        add(inputPanel);
        JPanel botoes = new JPanel();
        botoes.add(cadastrar = new JButton("Cadastrar"));
        botoes.add(editar = new JButton("Editar"));
        botoes.add(apagar = new JButton("Apagar"));
        add(botoes);
        // tabela de carros
        JScrollPane jSPane = new JScrollPane();
        add(jSPane);
        tableModel = new DefaultTableModel(new Object[][] {},
                new String[] { "Comprador", "Modelo", "Data", "Valor" });
        table = new JTable(tableModel);
        jSPane.setViewportView(table);

        // Cria o banco de dados caso não tenha sido criado
        new VendasDAO().criaTabela();

        // incluindo elementos do banco na criação do painel
        atualizar();

        // tratamento de Eventos
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    vendaComprador.setText((String) table.getValueAt(linhaSelecionada, 0));
                    vendaModelo.setText((String) table.getValueAt(linhaSelecionada, 2));
                    vendaData.setText((String) table.getValueAt(linhaSelecionada, 3));
                    vendaValor.setText((String) table.getValueAt(linhaSelecionada, 4));
                }
            }
        });

        // Cria um objeto operacoes da classe CarrosControl para executar operações no
        // banco de dados
        VendasControl operacoes = new VendasControl(vendas, tableModel, table);

        // Configura a ação do botão "cadastrar" para adicionar um novo registro no
        // banco de dados
        cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Chama o método "cadastrar" do objeto operacoes com os valores dos campos de
                // entrada
                operacoes.cadastrar(vendaComprador.getText(), vendaModelo.getText(), Integer.parseInt(vendaData.getText()),
                        Integer.parseInt(vendaValor.getText()));

                // Limpa os campos de entrada após a operação de cadastro
                vendaComprador.setText("");
                vendaModelo.setText("");
                vendaData.setText("");
                vendaValor.setText("");
            }
        });

        // Configura a ação do botão "editar" para atualizar um registro no banco de
        // dados
        editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                operacoes.atualizar(vendaComprador.getText(), vendaModelo.getText(), Integer.parseInt(vendaData.getText()),
                        Integer.parseInt(vendaValor.getText()));
                // Limpa os campos de entrada após a operação de atualização
                 vendaComprador.setText("");
                vendaModelo.setText("");
                vendaData.setText("");
                vendaValor.setText("");
            }
        });

        // Configura a ação do botão "apagar" para excluir um registro no banco de dados
        apagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Chama o método "apagar" do objeto operacoes com o valor do campo de entrada
                // "placa"
                operacoes.apagar(vendaComprador.getText());

                // Limpa os campos de entrada após a operação de exclusão
                vendaComprador.setText("");
                vendaModelo.setText("");
                vendaData.setText("");
                vendaValor.setText("");
            }
        });

    }

    // atualizar Tabela de Carros com o Banco de Dados
    private void atualizar() {
        // atualizar tabela pelo banco de dados
        tableModel.setRowCount(0);
        vendas = new VendasDAO().listarTodos();
        for (Vendas vendas : vendas) {
            tableModel.addRow(new Object[] { vendas.getComprador(), vendas.getModelo(), vendas.getData(),
                    vendas.getValor() });
        }

    }
}