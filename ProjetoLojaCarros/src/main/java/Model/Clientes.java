package Model;

public class Clientes {

    private String Nome;        // Nome do cliente
    private String Endereco;    // Endereço do cliente
    private int Contato;        // Número de contato do cliente
    private int CPF;            // CPF do cliente

    // Construtor para inicializar o objeto Clientes com valores fornecidos
    public Clientes(String nome, String endereco, int contato, int cPF) {
        Nome = nome;
        Endereco = endereco;
        Contato = contato;
        CPF = cPF;
    }

    // Método de obtenção para recuperar o nome do cliente
    public String getNome() {
        return Nome;
    }

    // Método de configuração para definir o nome do cliente
    public void setNome(String nome) {
        Nome = nome;
    }

    // Método de obtenção para recuperar o endereço do cliente
    public String getEndereco() {
        return Endereco;
    }

    // Método de configuração para definir o endereço do cliente
    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    // Método de obtenção para recuperar o número de contato do cliente
    public int getContato() {
        return Contato;
    }

    // Método de configuração para definir o número de contato do cliente
    public void setContato(int contato) {
        Contato = contato;
    }

    // Método de obtenção para recuperar o CPF do cliente
    public int getCPF() {
        return CPF;
    }

    // Método de configuração para definir o CPF do cliente
    public void setCPF(int cPF) {
        CPF = cPF;
    }
}
