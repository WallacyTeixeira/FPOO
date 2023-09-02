package POOExercicio1;

public class Pessoas {
    //Atributos(nome,altura,dataNascimento,mesNascimento,anoNascimento)
    String nome;
    double altura;
    int dataNascimento;
    int mesNascimento;
    int anoNascimento;
    //construtores
    public Pessoas(String nome, double altura, int dataNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.altura = altura;
        this.dataNascimento = dataNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }
    public Pessoas() {
    }
    //get and sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public int getMesNascimento() {
        return mesNascimento;
    }
    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    //outros métodos
    //2 tipos de métodos void // return
    public void imprimir() {
        System.out.println("Nome"+nome);
        System.out.println("Altura"+altura);
        System.out.println("Data Nascimento "
        +dataNascimento+"/"+mesNascimento+"/"+anoNascimento);
    }
    public int getIdade() {
        int idade;
        if(dataNascimento<=30 && mesNascimento<=5){
            idade = 2023 - anoNascimento;
            }else{
                idade = 2023 - anoNascimento -1;
            }
            return idade;
    }
}
