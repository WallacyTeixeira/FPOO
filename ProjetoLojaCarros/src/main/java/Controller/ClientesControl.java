package Controller;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Clientes;

public class ClientesControl {
    // atributos
    private List<Clientes> clientes; // Lista para armazenar objetos de clientes
    private DefaultTableModel tableModel; // Modelo de tabela para a interface gráfica
    private JTable table; // Tabela Swing para exibir os dados

    public ClientesControl(List<Clientes> clientes, DefaultTableModel tableModel, JTable table) {
        this.clientes = clientes;
        this.tableModel = tableModel;
        this.table = table;
    }

    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        clientes = new ClientesDAO().listarTodos();
        // Obtém os clientes atualizados do banco de dados
        for (Clientes cliente : clientes) {
            // Adiciona os dados de cada cliente como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { cliente.getNome(), cliente.getEndereco(),
                    cliente.getContato(), cliente.getCPF() });
        }
    }

    // Método para cadastrar um novo cliente no banco de dados
    public void cadastrar(String nome, String endereco, int contato, int cPF) {
        new ClientesDAO().cadastrar(nome, endereco, contato, cPF);
        // Chama o método de cadastro no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após o cadastro
    }

    // Método para atualizar os dados de um cliente no banco de dados
    public void atualizar(String nome, String endereco, int contato, int cPF) {
        new ClientesDAO().atualizar(nome, endereco, contato, cPF);
        // Chama o método de atualização no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a atualização
    }

    // Método para apagar um cliente do banco de dados
    public void apagar(int cPF) {
        new ClientesDAO().apagar(cPF);
        // Chama o método de exclusão no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a exclusão
    }
}
