package ExercicoExtreWhile;

import java.util.Scanner;

public class ExtraWhile {
    Scanner sc = new Scanner(System.in);

    void Exercicio4(){
        //lendo um vetor de stringh com laço while
    //criar um vetor de 10 letras
        String letras[] = new String[]{"a","b","c","d","e","f","g","h","i","j"};
        int i=0;
        int cont = 0;
        while (i<letras.length){
            if (letras[i]=="a"||letras[i]=="e"||letras[i]=="i"||letras[i]=="o"||letras[i]=="u") {
            }else{
            cont++;
            System.out.println(letras[i]+" é consoante");
            }
            i++;
        }
        System.out.println(cont++);
    }

    void Exercicio5() {
        int vetor[]=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int i=0;
        int contPar=0;
        int contImpar=0;
        while (i<vetor.length) {
            if (vetor[i]%2==0) {
                contPar++;
            }else{
                contImpar++;
            }
            int vetorPar[]=new int[contPar];
            int vetorImpar[]=new int[contImpar];
            i=0;
            contPar=0;
            contImpar=0;
            while (i<vetor.length) {
                if (vetor[i]%2==0) {
                    vetorPar[contPar]=vetor[1];
                    contPar++;
                }else{
                    vetorImpar[contImpar]=vetor[i];
                    contImpar++;
                }
                i++;
            }
            i=0;
            while (i<vetorPar.length) {
                System.out.println("vetorPar["+i+"]"+vetorPar[i]);

                
            }

        }
    }
}