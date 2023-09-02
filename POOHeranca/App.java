package POOHeranca;

import POOHeranca.Pessoas.Alunos;
import POOHeranca.Pessoas.Funcionarios;
import POOHeranca.Pessoas.Pessoas;
import POOHeranca.Pessoas.Professores;

public class App {
    public static void main(String[] args) {
        Pessoas pessoa01 = new Pessoas();
        Funcionarios func01 = new Funcionarios();
        Professores prof01 = new Professores();
        Alunos aluno01 = new Alunos();

        pessoa01.setNome("Carlos José");
        func01.setSetor("Professor");
        prof01.setDiciplina("Logistica");

        System.out.println("Nome:" + pessoa01.getNome());
        System.out.println("Funçao:" + func01.getSetor());
        System.out.println("Curso:" + prof01.getDiciplina());
    }
}
