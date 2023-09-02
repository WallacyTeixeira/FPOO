package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    private static final int IMC = 0;
    Scanner sc = new Scanner(System.in);

    public void Exercicio1() {


        System.out.println("cacular peso ideal");

        System.out.println("Informe a altura em M");
        double altura = sc.nextDouble();
        altura/=100;

        System.out.println("Informe o sexo: 1- Feminino; 2-Masculino;");
        int genero = sc.nextInt();

        System.out.println("Digite o Peso em Kg");
        double peso = sc.nextDouble();

        if (genero==1){
        altura*=100;
        double pesoIdealF= 52 + (0.75 *(altura - 152.4));
        System.out.println("O seu peso ideal é " + pesoIdealF + "Kg's");
        if( peso<pesoIdealF){
        System.out.println("Voce precisa engordar " + (pesoIdealF-peso)+ "Kg's");}

        else{System.out.println("Voce precisa emagrecer " + (peso-pesoIdealF)+ "Kg's");

        }
        }if(genero==2){
        altura*=100;
        double pesoIdealM= 52 + (0.92 *(altura - 152.4));
        System.out.println("O seu peso ideal é " + pesoIdealM + "Kg's");
        if( peso<pesoIdealM){
        System.out.println("Voce precisa engordar " + (pesoIdealM-peso)+ "Kg's");}
  
        else{System.out.println("Voce precisa emagrecer " + (peso-pesoIdealM)+ "Kg's");
        }

//====================================================================================================
        System.out.println("Calculo de IMC");

        double IMC = peso/(altura*altura);

        System.out.println("seu IMC é " + IMC);
        double tipoPeso;

        if (IMC <= 20) {
            System.out.println("Abaixo do peso");
            tipoPeso = 1;


        } else if (IMC <= 27 && IMC > 20) {
            System.out.println("Peso normal");
            tipoPeso= 2;

        } else {
            System.out.println("Acima do peso ");
            tipoPeso = 3;
        } 
//=====================================================================================================
        System.out.println("faixa etaria");

        System.out.println("Digite a idade");
        double idade = sc.nextDouble();
        double faixaEtaria;

        if (idade >= 16 && idade <= 24) {
            System.out.println("Idade 1");
            faixaEtaria = 1;
        } else if (idade >= 25 && idade <= 35) {
            System.out.println("Idade 2");
            faixaEtaria = 2;

        } else if (idade >= 36 && idade <= 45) {
            System.out.println("Idade 3");
            faixaEtaria = 3;
        }
        else if (idade >= 46 && idade <= 55) {
            System.out.println("Idade 4");
            faixaEtaria = 4;
        }
        else if (idade >= 56 && idade <= 65) {
            System.out.println("idade 5");
            faixaEtaria = 5;
        }
        else if(idade<=60){
            System.out.println("idade 6");
            faixaEtaria = 6;
        }
    }
    }
}