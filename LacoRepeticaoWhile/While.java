package LacoRepeticaoWhile;

import java.util.Random;
import java.util.Scanner;

public class While {
    Scanner sc = new Scanner (System.in);
    private int bound;
    public void adivinharNumero() {
    // aqui jasRandom rd = new Random();
    int iteracao = 0;
    while (iteracao<10) {
        System.out.println("O n° da iteracao é" +iteracao);
        iteracao +=1;
    }
 }   
 public void adivinhar() {
    Random rd = new Random();
    int nSorteado = rd.nextInt(bound:10);
    boolean tenteNovamente;
    while (tenteNovamente){
        System.out.println("digite um numero");
        int nDigitado = sc.nextInt();
        if (nDigitado==nSorteado){
            System.out.println("acertou miseravel");
            tenteNovamente = false;
        }
        else{
            System.out.println("errouuuuu");
            tenteNovamente=true;
        }
    }
}

}
