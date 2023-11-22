package Model;

public class Clientes {

    private String Nome;
    private String Endereco;
    private int Contato;
    private int CPF;

    public Clientes(String nome, String endereco, int contato, int cPF) {
        Nome = nome;
        Endereco = endereco;
        Contato = contato;
        CPF = cPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public int getContato() {
        return Contato;
    }

    public void setContato(int contato) {
        Contato = contato;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int cPF) {
        CPF = cPF;
    }
}
