package AtividadeRevisao1;

import java.util.Scanner;

public class ExemploRevisao {
    Scanner sc = new Scanner(System.in);

    void exemplo1() {
        //1° passo
        System.out.println("digite um nº");
        double nDigitado = sc.nextDouble();
        //2. se nº>10
        if (nDigitado>10) {
            System.out.println("É maior que 10"); 

        }else{ //3. se não
        System.out.println("Nao é maior que 10");
        }
        if (nDigitado==10) {
            System.out.println("PARA DE FAZER MERDA SEU ANTA");
            
        }
    }
    void exemplo2() {
        //1. ler a quantidade de horas trabalhadas
        System.out.println("o!!!!! vaganbundo fala quantas horas vc vendeu sua alma ?");
        double hTrabalhadas = sc.nextDouble();
        //2. ler valor das horas
        System.out.println("por quantas miseras modeas por hora, vc vendeu sua vida desgraçada ?");
        double valorHora = sc.nextDouble();
        //3. calcular a quantidade de horas extras
        // double SalarioBase = ValorHora * hTrabalhadas;
        //double nHoras = 200;
        //double ValorHoraExtra = 0.5;
        double horasExtras = hTrabalhadas-200;
        //4. calcular o salario
        //double nHoraExtra = nHoras-nHorasBase;//
        //double SalarioExtra = ValorHoraExtra * nHoraExtra;//
        //double SalarioTotal = SalarioExtra + SalarioBase ;//
        double salarioTotal = hTrabalhadas*valorHora + horasExtras *valorHora*50/100;
        //5. mostrar o salario total
        System.out.println("sinto pena de voce sua misera existencia possui penas esse valor" + salarioTotal);
        System.out.println("continuara a seguir esse caminho ?");
        }
    }