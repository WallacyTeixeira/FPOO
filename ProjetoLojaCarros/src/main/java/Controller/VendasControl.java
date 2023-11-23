package Controller;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Vendas;

public class VendasControl {
    // atributos
    private List<Vendas> vendas; // Lista para armazenar objetos de vendas
    private DefaultTableModel tableModel; // Modelo de tabela para a interface gráfica
    private JTable table; // Tabela Swing para exibir os dados

    // construtor
    public VendasControl(List<Vendas> vendas, DefaultTableModel tableModel, JTable table) {
        this.vendas = vendas;
        this.tableModel = tableModel;
        this.table = table;
    }

    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        vendas = new VendasDAO().listarTodos();
        // Obtém as vendas atualizadas do banco de dados
        for (Vendas venda : vendas) {
            // Adiciona os dados de cada venda como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { venda.getComprador(), venda.getModelo(),
                    venda.getData(), venda.getValor() });
        }
    }

    // Método para cadastrar uma nova venda no banco de dados
    public void cadastrar(String Comprador, String Modelo, String Data, int Valor) {
        new VendasDAO().cadastrar(Comprador, Modelo, Data, Valor);
        // Chama o método de cadastro no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após o cadastro
    }

    // Método para atualizar os dados de uma venda no banco de dados
    public void atualizar(String Comprador, String Modelo, String Data, int Valor) {
        new VendasDAO().atualizar(Comprador, Modelo, Data, Valor);
        // Chama o método de atualização no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a atualização
    }

    // Método para apagar uma venda do banco de dados
    public void apagar(String comprador) {
        new VendasDAO().apagar(comprador);
        // Chama o método de exclusão no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a exclusão
    }
}
