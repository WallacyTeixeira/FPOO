package Matriz;

import java.util.Random;
import java.util.Scanner;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo1() {
        int matriz[][] = new int[10][9];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                matriz[i][j]=rd.nextInt(10);          
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("matriz["+i+"]["+j+"]="
                        +matriz[i][j]);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("|");
        }
        int somaLinha = 0;
        for (int i = 0; i < 9; i++) {
            somaLinha += matriz[3][i];
        }
        System.out.println("++++++++++++++++");
        System.out.println(" A soma da Linha 4 é "+somaLinha);

        int somaColuna = 0;
        for (int i = 0; i < 10; i++) {
            somaColuna += matriz[i][3];
        }
        System.out.println("++++++++++++++++");
        System.out.println(" A soma da coluna 4 é "+somaColuna);

    }

    public void exercicio1() {
    }

    public void correção1() {
    }
}


