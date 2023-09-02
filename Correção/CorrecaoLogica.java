package Correção;

import java.util.Random;
import java.util.Scanner;

public class CorrecaoLogica {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void Correção1() {
        System.out.println("Informe a Qtd de Linhas e Colunas");
        int linha = sc.nextInt();
        int coluna = sc.nextInt();
        int matriz[][] = new int[linha][coluna];
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = rd.nextInt(10);
            }
        }
    }

    public void Correção2() {
        int nSorteado = rd.nextInt(1000);
        int nDigitado = sc.nextInt();
        System.out.println("Digite um nº");
        int contador = 1;
        while (nSorteado != nDigitado) {
            // falar se é ><
            if (nDigitado > nSorteado) {
                System.out.println("Errou!! Numero Digitado é Maior que o Sortado");
            }
            if (nDigitado < nSorteado) {
                System.out.println("Errou!! Numero Digitado é Menor Que o Sorteado");
            } else {
                // vou deixar em branco
            }
            // digiter um numero nº
            System.out.println("Digite um outro nº");
            nDigitado = sc.nextInt();
            contador++;
        }
        System.out.println("Parabens vc Acertou!!!");
        System.out.println("em " + contador + " tentativas");
    }

    private void Correção3() {
        // criar um vetor de tamanho de 100-1000
        int tamanhoVetor = rd.nextInt(900) + 100;
        int vetor[] = new int[tamanhoVetor];
        // preencher o vetor raddom 1-100
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(100) + 1;
        }
        int contImparNoPar;
        int contParNoImpar;
        // Imprimir os nº pares do vetor
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
                if (i % 2 == 0) {
                    contParNoImpar++;
                }
            }
        }
        // Imprimir os nº impares do vetor
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 1) { // resto da divisão
                System.out.println(vetor[i]);
                if (i % 2 == 1) {
                    contImparNoPar++;
                }
            }
        }
    }

    
}
