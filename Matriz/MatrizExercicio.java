package Matriz;

import java.util.Random;
import java.util.Scanner;

public class MatrizExercicio {

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exercicio1() {
        int matriz[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i==1) {
                    matriz[i][j]=1;
                } else {
                    matriz[i][j]=0;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("matriz[" + i + "][" + j + "]="
                        + matriz[i][j]);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
        
    }

    public void exercicio2() {
        int matriz[][]=new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]= rd.nextInt(10);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("|");
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println("|");
        }
System.out.println("+++++++++++++++++++++");
        //b. somar todos os itens da diagonal principal
        int soma=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //somar os iten somente da diagonal pricipal
                if (i==j) {
                    soma+=matriz[i][j];
                }
            }
        }
        System.out.println("a soma da diagonal é"+soma);
    }        
}
