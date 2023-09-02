package FormativaS;

import java.security.DrbgParameters.NextBytes;
import java.util.Random;
import java.util.Scanner;

public class FormativaLG {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    // Crie uma Classe que crie uma Matriz de Linha determinada pelo Usuário e
    // Coluna determinadas pelo Usuário
    public void exercicio1() {
        System.out.println("digite valor linha");
        int linha = sc.nextInt();
        System.out.println("digite valor coluna");
        int coluna = sc.nextInt();
        int matriz[][] = new int[linha][coluna];

        // Preencha a Matriz com valores aleatórios entre 0 e 9 e imprimia a matriz

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = rd.nextInt(10);
            }
        }
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (i > j) {
                    matriz[i][j] = 1;
                }
                if (i == j) {
                    matriz[i][j] = 0;
                }
                if (j > i) {
                    matriz[i][j] = 2;
                }
            }
        }
        System.out.println("++++++++++++++++++++++++++++");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void exercicio2() {
        // Sortear um número de 0 a 1000 (dica: usar Math.random())
        int sorteado = rd.nextInt(1000);
        System.out.println("valor " + sorteado);
        int palpite;
        System.out.println("de um palpite");
        palpite = sc.nextInt();
        int tentativa = 1;
        while (palpite != sorteado) {

            if (palpite > sorteado) {
                System.out.println("Seu palpite é maior que o número sorteado.");
            }
            if (palpite < sorteado) {
                System.out.println("Seu palpite é menor que o número sorteado.");
            }
            System.out.println("de outro palpite");
            palpite = sc.nextInt();
            tentativa++;

            if (palpite == sorteado) {
                System.out.println("Parabéns, você acertou! O número era " + sorteado);
                System.out.println("Você tentou " + tentativa + " vezes antes de acertar!");
            }
        }
    }

    void exercicio3() {
        int sorteado = rd.nextInt(900) + 100;
        int contPar = 0;
        int contImpar = 0;
        int vetor[] = new int[sorteado];
        // preencher o vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(100);
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i] + "pares");
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 1) {
                System.out.println(vetor[i] + "impares");
            }
        }
    }
}
