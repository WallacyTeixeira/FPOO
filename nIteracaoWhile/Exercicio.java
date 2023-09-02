package nIteracaoWhile;

import java.util.Random;
import java.util.Scanner;

public class Exercicio {
    Scanner sc = new Scanner(System.in);

    public void Exercicio1() {
        int iteracao = 0;
        while (iteracao < 1000000000) {
            iteracao += 1;
            System.out.println("essa é a iteracao de nº" + iteracao);
        }
    }

    void Exercicio2() {
        Random rd = new Random();
        int numeroAleatorio = rd.nextInt(10);
        boolean tenteNovamente = true;
        System.out.println("tente adivinhar o numero:");
        int numero = sc.nextInt();
        while (tenteNovamente) {
            System.out.print("Tente adivinhar o número: ");
            numero = numeroAleatorio = rd.nextInt();
            tenteNovamente = numeroAleatorio != numero;
            if (tenteNovamente) {
                System.out.println("Errado!");
            }
        }
        System.out.println("Parabéns! Você adivinhou. Era o número"
                + numeroAleatorio + " mesmo.");
        System.out.println("Fim!");
        System.out.println("============================");
    }

    public void Exercicio3() {
        int vetor[] = new int[5];
        int i = 0;
        while (i < 5) {
            System.out.print("Digite o valor par ao vetor["+i+"]");
            vetor[i] = sc.nextInt();
            i++;
        }
        i=0;
        while (i<5) {
            System.out.print("Digite o valor par ao vetor["+i+"] é" +vetor[i]);
            System.out.println(vetor[i]);
            i++;
        }
    }
}
