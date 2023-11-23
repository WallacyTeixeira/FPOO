package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Connection.ConnectionFactory;
import Model.Carros;

public class CarrosDAO {
    // atributo
    private Connection connection;  // Objeto para gerenciar a conexão com o banco de dados
    private List<Carros> carros;   // Lista para armazenar objetos do tipo Carros

    // construtor
    public CarrosDAO() {
        this.connection = ConnectionFactory.getConnection();  // Inicializa a conexão ao criar um objeto CarrosDAO
    }

    // criar Tabela
    public void criaTabela() {
        // Define a SQL para criar a tabela se ela não existir
        String sql = "CREATE TABLE IF NOT EXISTS carros_lojacarros (MARCA VARCHAR(255),MODELO VARCHAR(255),ANO VARCHAR(255),PLACA VARCHAR(255) PRIMARY KEY, VALOR VARCHAR(255));";
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
    public List<Carros> listarTodos() {
        PreparedStatement stmt = null;  // Objeto PreparedStatement para executar a consulta
        ResultSet rs = null;           // Objeto ResultSet para armazenar os resultados da consulta
        carros = new ArrayList<>();    // Inicializa a lista de carros

        try {
            stmt = connection.prepareStatement("SELECT * FROM carros_lojacarros");
            rs = stmt.executeQuery();   // Executa a consulta e armazena os resultados no ResultSet

            while (rs.next()) {
                // Cria um objeto Carros para cada registro no ResultSet
                Carros carro = new Carros(rs.getString("marca"), rs.getString("modelo"), rs.getString("ano"),
                        rs.getString("placa"), rs.getString("valor"));
                carros.add(carro);  // Adiciona o objeto Carros à lista de carros
            }
        } catch (SQLException ex) {
            System.out.println(ex);  // Em caso de erro durante a consulta, imprime o erro
        } finally {
            ConnectionFactory.closeConnection(connection, stmt, rs);  // Fecha a conexão, o PreparedStatement e o ResultSet
        }
        return carros;  // Retorna a lista de carros recuperados do banco de dados
    }

    // Método para cadastrar um novo carro
    public void cadastrar(String marca, String modelo, String ano, String placa, String valor) {
        PreparedStatement stmt = null;  // Objeto PreparedStatement para executar a instrução SQL parametrizada

        // Define a instrução SQL parametrizada para cadastrar na tabela
        String sql = "INSERT INTO carros_lojacarros (marca, modelo, ano, placa, valor) VALUES (?, ?, ?, ?, ?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, marca);
            stmt.setString(2, modelo);
            stmt.setString(3, ano);
            stmt.setString(4, placa);
            stmt.setString(5, valor);
            stmt.executeUpdate();  // Executa a instrução SQL
            System.out.println("Dados inseridos com sucesso");  // Mensagem de sucesso
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);  // Fecha a conexão e o PreparedStatement
        }
    }

    // Atualizar dados no banco
    public void atualizar(String marca, String modelo, String ano, String placa, String valor) {
        PreparedStatement stmt = null;  // Objeto PreparedStatement para executar a instrução SQL parametrizada

        // Define a instrução SQL parametrizada para atualizar dados pela placa
        String sql = "UPDATE carros_lojacarros SET marca = ?, modelo = ?, ano = ?, valor = ? WHERE placa = ?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, marca);
            stmt.setString(2, modelo);
            stmt.setString(3, ano);
            stmt.setString(4, valor);
            stmt.setString(5, placa);
            stmt.executeUpdate();  // Executa a instrução SQL
            System.out.println("Dados atualizados com sucesso");  // Mensagem de sucesso
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);  // Fecha a conexão e o PreparedStatement
        }
    }

    // Apagar dados do banco
    public void apagar(String placa) {
        PreparedStatement stmt = null;  // Objeto PreparedStatement para executar a instrução SQL parametrizada

        // Define a instrução SQL parametrizada para apagar dados pela placa
        String sql = "DELETE FROM carros_lojacarros WHERE placa = ?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, placa);
            stmt.executeUpdate();  // Executa a instrução SQL
            System.out.println("Dado apagado com sucesso");  // Mensagem de sucesso
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao apagar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);  // Fecha a conexão e o PreparedStatement
        }
    }
}
