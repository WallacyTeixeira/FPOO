import java.io.Serializable;

public class Usuario implements Serializable {
    // Classe Usuario implementa a interface Serializable, permitindo a serialização

    // Atributos da classe Usuario
    String nome; // Nome do usuário
    int idade; // Idade do usuário
    
    // Construtor da classe Usuario
    public Usuario(String nome, int idade) {
        this.nome = nome; // Inicializa o atributo nome com o valor fornecido
        this.idade = idade; // Inicializa o atributo idade com o valor fornecido
    }
    
    // Método para obter o nome do usuário
    public String getNome() {
        return nome; // Retorna o valor do atributo nome
    }

    // Método para definir o nome do usuário
    public void setNome(String nome) {
        this.nome = nome; // Define o valor do atributo nome com o valor fornecido
    }

    // Método para obter a idade do usuário
    public int getIdade() {
        return idade; // Retorna o valor do atributo idade
    }

    // Método para definir a idade do usuário
    public void setIdade(int idade) {
        this.idade = idade; // Define o valor do atributo idade com o valor fornecido
    }
}
