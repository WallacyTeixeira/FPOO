package IteracaoFor;

import java.util.Scanner;

import javax.swing.text.html.FormView;

public class ExemploFor {
    Scanner sc = new Scanner(System.in);
    private int i;

    public void Exemplo1() {
        for (int i = 0; i <10; i++) {
            System.out.println("o nº da iteração é "+i);
        }
    }
    public void Exemplo2() {
        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor["+1+"]=");
            vetor[i]=sc.nextInt();
        }
        //imprimir vetor ordem inversa
        for (int i=9; i>=0; i--){
            System.out.println("vetor["+i+"]=" +vetor[i]);
        }
    }
    public void Exemplo3() {
        double carrinhoCompra[]= new double[]{19.90,35.70,56.80,97.50};
        double valorFinal=0;
        for (int i = 0; i < carrinhoCompra.length; i++) {
            valorFinal += carrinhoCompra[i];
        }
        System.out.println("o valor da compra é R$"+valorFinal);
    }
    public void Exemplo4() {
        double vetorNotas[]=new double[4];
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Digite a Nota"+(i+1)+":");
            vetorNotas[i]=sc.nextDouble();
        }
        double mediaNotas=0;
        for (int i = 0; i < vetorNotas.length; i++) {
            mediaNotas+=vetorNotas[i];
        System.out.println("a "+(i+1)+"a nota é"+vetorNotas[i]);
        }
        mediaNotas/=vetorNotas.length;
        System.out.println("a media do alimo é"+mediaNotas);
    }
    public void Exemplo5() {
        double vetorMedia[]=new double[10];
        for (int i = 0; i < vetorMedia.length; i++) {
            int notas=0;
            for (int j = 0; j < vetorMedia.length; j++) {
                System.out.println("nota"+(j+1)+"aluno"+(i+1));
                notas+=sc.nextDouble();
            }
            notas/=4;
            vetorMedia[i]=notas;
        }  
        for (int i = 0; i < vetorMedia.length; i++) {
            if (vetorMedia[i]>=7) {
                System.out.println("a media do aluno"+(i+1)+"é"+vetorMedia[i]);
            }
            
        }
    }
}