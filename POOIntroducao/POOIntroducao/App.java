package POOIntroducao;

public class App {
private static String temp;

public static void main(String[] args) {
    //criar objeto
    RegistraAluno aluno1= new RegistraAluno();//obj
    RegistraAluno aluno2= new RegistraAluno();//obj

    //modificar osz atributos(set)
    aluno1.setNome("Ana Clara Pereira");
    aluno1.setEndereco("Rua Dr. Bala no Alvo");
    aluno1.setIdade(12);
    aluno1.setNotaCiencias(3.6);
    aluno1.setNotaMatematica(10);
    aluno1.setNotaPortugues(4.5);
    
    //acessar os atributos(set)
    System.out.println("Nome:"+aluno1.getNome());
    System.out.println("endereço:"+aluno1.getEndereco());
    System.out.println("Idade:"+aluno1.getIdade());
    System.out.println("Média:"+aluno1.getMedia());
}
    
}