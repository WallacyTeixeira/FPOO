package Operacoes.ExerciciosOperadores;

import java.util.Scanner;

public class NotaAlunos {
    Scanner sc = new Scanner(System.in);
    public void notaFrequencia() {
        System.out.println("informe a nota 1 do aluno");
        int nota1 = sc.nextInt();
        System.out.println("informe a nota 2 do aluno");
        int nota2 = sc.nextInt();
        // double mediaAluno = nota1
        // mediaAluno += nota2
        //mediaAluno /= 2
        double mediaAluno = (nota1 + nota2)/2;
        System.out.println("a média do aluno é" +mediaAluno);
        boolean mediaAprovado = mediaAluno >= 50;
        System.out.println("O aluno Está Aprovado por nota?" +mediaAprovado);
        System.out.println("Informe a Frequencia do Aluno:");
        int FrequenciaAluno = sc.nextInt();
        boolean FrequenciaAprovado = FrequenciaAluno >= 75;
        System.out.println("O Aluno Esta Aprovado por Frequencia?"+FrequenciaAprovado);
        boolean aprovacaFinal = (mediaAprovado==true) && (FrequenciaAprovado==true);
        System.out.println("O Aluno Esta Aprovado no Curso?"+aprovacaFinal);
            
        }
    }

