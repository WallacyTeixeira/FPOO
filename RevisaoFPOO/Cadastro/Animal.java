package RevisaoFPOO.Cadastro;

public class Animal {
    //atributos
    String nome;
    double peso;
    String raca;
    String proprietario;
    boolean carnivoro;
    //métodos
    //cosntrutor cheio
    public Animal(String nome, double peso, String raca, String proprietario) {
        this.nome = nome;
        this.peso = peso;
        this.raca = raca;
        this.proprietario = proprietario;
    }
    //construtor vazio
    public Animal(){}
    //sets and gets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getraca() {
        return raca;
    }
    public void setraca(String raca) {
        this.raca = raca;
    }
    public String getProprietario() {
        return proprietario;
    }
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    public boolean isCarnivoro() {
        return carnivoro;
    }
    public void setCarnivoro(int i) {
        if(i==1){
        this.carnivoro = true;
        }else{
            this.carnivoro = false;
        }
    }
    

    

}
