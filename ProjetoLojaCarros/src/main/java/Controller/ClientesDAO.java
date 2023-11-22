package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Connection.ConnectionFactory;
import Model.Clientes;

public class ClientesDAO {
    // atributo
    private Connection connection;
    private List<Clientes> clientes;

    // construtor
    public ClientesDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    // criar Tabela
    public void criaTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS clientes_lojacarros (NOME VARCHAR(255),ENDERECO VARCHAR(255),CONTATO VARCHAR(255),CPF VARCHAR(255) PRIMARY KEY)";
        try (Statement stmt = this.connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela: " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    // Listar todos os valores cadastrados
    public List<Clientes> listarTodos() {
        PreparedStatement stmt = null;
        // Declaracão do objeto PreparedStatement para executar a consulta
        ResultSet rs = null;
        // Declaracão do objeto ResultSet para armazenar os resultados da consulta
        clientes = new ArrayList<>();
        // Cria uma lista para armazenar os carros recuperados do banco de dados

        try {
            stmt = connection.prepareStatement("SELECT * FROM clientes_lojacarros");
            // Prepara a consulta SQL para selecionar todos os registros da tabela
            rs = stmt.executeQuery();
            // Executa a consulta e armazena os resultados no ResultSet

            while (rs.next()) {
                // Para cada registro no ResultSet, cria um objeto Carros com os valores do
                // registro

                // Carros carro = new Carros(rs.getString("marca"));
                Clientes cliente = new Clientes(rs.getString("Nome"), rs.getString("Endereco"), rs.getInt("Contato"),
                        rs.getInt("CPF"));
                clientes.add(cliente); // Adiciona o objeto Carros à lista de carros
            }
        } catch (SQLException ex) {
            System.out.println(ex); // Em caso de erro durante a consulta, imprime o erro
        } finally {
            ConnectionFactory.closeConnection(connection, stmt, rs);
            // Fecha a conexão, o PreparedStatement e o ResultSet
        }
        return clientes; // Retorna a lista de carros recuperados do banco de dados
    }

    public void cadastrar(String nome, String endereco, int contato, int cPF) {
        PreparedStatement stmt = null;
        // Define a instrucão SQL parametrizada para cadastrar na tabela
        String sql = "INSERT INTO clientes_lojacarros (nome, endereco, contato, CPF) VALUES (?, ?, ?, ?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, endereco);
            stmt.setInt(3, contato);
            stmt.setInt(4, cPF);
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    // Atualizar dados no banco
    public void atualizar(String Nome, String Endereco, int Contato, int CPF) {
        PreparedStatement stmt = null;
        // Define a instrucão SQL parametrizada para atualizar dados pela placa
        String sql = "UPDATE clientes_lojacarros SET Nome = ?, Endereco = ?, Contato = ? WHERE CPF = ?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, Nome);
            stmt.setString(2, Endereco);
            stmt.setInt(3, Contato);
            // CPF é chave primaria não pode ser alterada.
            stmt.setInt(4, CPF);
            stmt.executeUpdate();
            System.out.println("Dados atualizados com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    // Apagar dados do banco
    public void apagar(int cPF) {
        PreparedStatement stmt = null;
        // Define a instrucão SQL parametrizada para apagar dados pela placa
        String sql = "DELETE FROM clientes_lojacarros WHERE comprador = ?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, cPF);
            stmt.executeUpdate(); // Executa a instrucão SQL
            System.out.println("Dado apagado com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao apagar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);

        }
    }
}