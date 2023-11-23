package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Connection.ConnectionFactory;
import Model.Vendas;

public class VendasDAO {
    // atributo
    private Connection connection;  // Objeto para gerenciar a conexão com o banco de dados
    private List<Vendas> vendas;    // Lista para armazenar objetos do tipo Vendas

    // construtor
    public VendasDAO() {
        this.connection = ConnectionFactory.getConnection();  // Inicializa a conexão ao criar um objeto VendasDAO
    }

    // criar Tabela
    public void criaTabela() {
        // Define a SQL para criar a tabela se ela não existir
        String sql = "CREATE TABLE IF NOT EXISTS vendas_lojacarros (COMPRADOR VARCHAR(255), MODELO VARCHAR(255), DATA VARCHAR(255), VALOR VARCHAR(255))";
        try (Statement stmt = this.connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso.");  // Mensagem de sucesso
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela: " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);  // Fecha a conexão
        }
    }

    // Listar todos os valores cadastrados
    public List<Vendas> listarTodos() {
        PreparedStatement stmt = null;  // Objeto PreparedStatement para executar a consulta
        ResultSet rs = null;           // Objeto ResultSet para armazenar os resultados da consulta
        vendas = new ArrayList<>();    // Inicializa a lista de vendas

        try {
            stmt = connection.prepareStatement("SELECT * FROM vendas_lojacarros");
            rs = stmt.executeQuery();   // Executa a consulta e armazena os resultados no ResultSet

            while (rs.next()) {
                // Para cada registro no ResultSet, cria um objeto Vendas com os valores do registro
                Vendas venda = new Vendas(rs.getString("Comprador"), rs.getString("Modelo"), rs.getString("Data"),
                        rs.getInt("Valor"));
                vendas.add(venda);  // Adiciona o objeto Vendas à lista de vendas
            }
        } catch (SQLException ex) {
            System.out.println(ex);  // Em caso de erro durante a consulta, imprime o erro
        } finally {
            ConnectionFactory.closeConnection(connection, stmt, rs);  // Fecha a conexão, o PreparedStatement e o ResultSet
        }
        return vendas;  // Retorna a lista de vendas recuperados do banco de dados
    }

    // Método para cadastrar uma nova venda
    public void cadastrar(String comprador, String modelo, String data, int valor) {
        PreparedStatement stmt = null;  // Objeto PreparedStatement para executar a instrução SQL parametrizada

        // Define a instrução SQL parametrizada para cadastrar na tabela
        String sql = "INSERT INTO vendas_lojacarros (comprador, modelo, data, valor) VALUES (?, ?, ?, ?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, comprador);
            stmt.setString(2, modelo);
            stmt.setString(3, data);
            stmt.setInt(4, valor);
            stmt.executeUpdate();  // Executa a instrução SQL
            System.out.println("Dados inseridos com sucesso");  // Mensagem de sucesso
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);  // Fecha a conexão e o PreparedStatement
        }
    }

    // Atualizar dados no banco
    public void atualizar(String comprador, String modelo, String data, int valor) {
        PreparedStatement stmt = null;  // Objeto PreparedStatement para executar a instrução SQL parametrizada

        // Define a instrução SQL parametrizada para atualizar dados pela comprador
        String sql = "UPDATE vendas_lojacarros SET comprador = ?, modelo = ?, data = ?, valor = ?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, comprador);
            stmt.setString(2, modelo);
            stmt.setString(3, data);
            stmt.setInt(4, valor);
            // comprador é chave primaria não pode ser alterada.
            stmt.executeUpdate();
            System.out.println("Dados atualizados com sucesso");  // Mensagem de sucesso
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);  // Fecha a conexão e o PreparedStatement
        }
    }

    // Apagar dados do banco
    public void apagar(String comprador) {
        PreparedStatement stmt = null;  // Objeto PreparedStatement para executar a instrução SQL parametrizada

        // Define a instrução SQL parametrizada para apagar dados pela comprador
        String sql = "DELETE FROM vendas_lojacarros WHERE Comprador = ?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, comprador);
            stmt.executeUpdate();  // Executa a instrução SQL
            System.out.println("Dado apagado com sucesso");  // Mensagem de sucesso
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao apagar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);  // Fecha a conexão e o PreparedStatement
        }
    }
}
