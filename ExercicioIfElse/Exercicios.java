package ExercicioIfElse;

import java.util.Scanner;

public class Exercicios{
    // exercicio 1
    Scanner sc = new Scanner(System.in);

    public void Exercicio1() {
        System.out.println("Informe o valor1");
        int valor1 = sc.nextInt();
        System.out.println("Informe o valor2");
        int valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.println("O Maior Valor é " + valor1);
        } else if (valor2 > valor1) {
            System.out.println("O Maior Valor é " + valor2);
        } else {
            System.out.println("Os Valores São Iguais");
        }

    }

    // exercicio 2
    public void Exercicio2() {
        System.out.println("Informe ano de nascimento");
        int AnoNascido = sc.nextInt();

        double Idade = (2023 - AnoNascido);

        if (Idade >= 16) {
            System.out.println("Podera votar");
        }
        if (Idade < 16) {
            System.out.println("Não Podera votar");
        }
    }

    // exercicio 3
    public void Exercicio3() {
        System.out.println("DIgite a Senha");
        int Senha = sc.nextInt();
        if (Senha == 1234) {
            System.out.println("ACESSO PERMITIDO");
        }
        if (Senha != 1234) {
            System.out.println("ACESSO NEGADO");
        }
    }

    // exercicio 4
    public void Exercicio4() {
        System.out.println("Digite a Quantia de Maçans Que Vai Querer");
        int QuantiaMaçans = sc.nextInt();
        double ValorUnidade = 0.00;

        if (QuantiaMaçans >= 12) {
            ValorUnidade = 0.25;
        }
        if (QuantiaMaçans < 12) {
            ValorUnidade = 0.30;
        }
        double Preço = (QuantiaMaçans * ValorUnidade);
        System.out.println("O produto sairá por R$" + Preço);
    }

    //exercicio 5
    public void Exercicio5() {
        System.out.println("digite o Primeiro numero");
        int n1 = sc.nextInt();
        System.out.println("digite o segundo numero");
        int n2 = sc.nextInt();
        System.out.println("digite o terceiro numero");
        int n3 = sc.nextInt();

        if(n1<n2 & n2<n3){
            System.out.println("a ordem é"+n1+n2+n3);
        } 
        if(n1<n3 && n3<n2){
            System.out.println("a ordem é"+n1+n3+n2);
        }
        if(n2<n1 && n1<n3){
            System.out.println("a ordem é"+n2+n1+n3);
        }
        if(n2<n3 && n3<n1){
            System.out.println("a ordem é"+n2+n3+n2);
        }
        if(n3<n1 && n1<n2){
            System.out.println("a ordem é"+n3+n1+n2);
        }
        if(n3<n2 && n2<n1){
            System.out.println("a ordem é"+n3+n2+n1);
        }

    }
    //exercicio 6
    public void Exercicio6() {
        System.out.println("informe: 1 para feminino ou 2 para masculino");
        int feminino = sc.nextInt();
    }
}
