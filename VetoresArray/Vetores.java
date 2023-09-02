package VetoresArray;

import java.util.Scanner;

//exemplo 1
public class Vetores {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // criando um vetor
        double[] valores = new double[] { 10.5, 20.7, 30.6, 40.4 };
        System.out.println("1° posição- índice{0}:" + valores[0]);
        System.out.println("2° posição- índice{1}:" + valores[1]);
        System.out.println("3° posição- índice{2}:" + valores[2]);
        System.out.println("4° posição- índice{3}:" + valores[3]);
        // mudando valores de uma posição definida
        valores[0] = 15.6; // mudando valores di índice
        System.out.println("1° posição- índice{0}:" + valores[0]);
    }

    // exemplo 2
    public void exemplo2() {
        // criando um vetor
        int valoresInt[] = new int[5];
        System.out.println("Digite 5 N° inteiros EX:A B C D E");
        valoresInt[0] = sc.nextInt();
        valoresInt[1] = sc.nextInt();
        valoresInt[2] = sc.nextInt();
        valoresInt[3] = sc.nextInt();
        valoresInt[4] = sc.nextInt();
        System.out.println("1° posição- índice{0}:" + valoresInt[0]);
        System.out.println("2° posição- índice{1}:" + valoresInt[1]);
        System.out.println("3° posição- índice{2}:" + valoresInt[2]);
        System.out.println("4° posição- índice{3}:" + valoresInt[3]);
        System.out.println("5° posição- índice{4}:" + valoresInt[4]);
    }

    // Exercicio 1
    public void Exercicio1() {
        double[] valoresReais = new double[10];
        System.out.println("Digite 10 N° Reais EX:A B C D E F G H I J");
        valoresReais[0] = sc.nextInt();
        valoresReais[1] = sc.nextInt();
        valoresReais[2] = sc.nextInt();
        valoresReais[3] = sc.nextInt();
        valoresReais[4] = sc.nextInt();
        valoresReais[5] = sc.nextInt();
        valoresReais[6] = sc.nextInt();
        valoresReais[7] = sc.nextInt();
        valoresReais[8] = sc.nextInt();
        valoresReais[9] = sc.nextInt();
        System.out.println("1° posição- índice{0}:" + valoresReais[9]);
        System.out.println("2° posição- índice{1}:" + valoresReais[8]);
        System.out.println("3° posição- índice{2}:" + valoresReais[7]);
        System.out.println("4° posição- índice{3}:" + valoresReais[6]);
        System.out.println("5° posição- índice{4}:" + valoresReais[5]);
        System.out.println("6° posição- índice{5}:" + valoresReais[4]);
        System.out.println("7° posição- índice{6}:" + valoresReais[3]);
        System.out.println("8° posição- índice{7}:" + valoresReais[2]);
        System.out.println("9° posição- índice{8}:" + valoresReais[1]);
        System.out.println("10° posição- índice{9}:" + valoresReais[0]);
    }

    // Exercicio 2
    public void Exercicio2() {
        double[] notas = new double[4];
        System.out.println("Digite 4 N° Reais EX:A B C D ");
        notas[0] = sc.nextInt();
        notas[1] = sc.nextInt();
        notas[2] = sc.nextInt();
        notas[3] = sc.nextInt();
        System.out.println("1° posição- índice{0}:" + notas[0]);
        System.out.println("2° posição- índice{1}:" + notas[1]);
        System.out.println("3° posição- índice{2}:" + notas[2]);
        System.out.println("4° posição- índice{3}:" + notas[3]);
        double media =(notas[0]+notas[1]+notas[2]+notas[3]/4);
        System.out.println("A meida é"+media);
    }

}
