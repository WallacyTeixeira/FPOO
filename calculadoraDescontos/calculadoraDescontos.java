package calculadoraDescontos;

import java.util.Scanner;

public class calculadoraDescontos {
    private int desconto20;

    public void calcular20(){
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o Preço do produto"+200/desconto20);
        double precoProduto = sc.nextDouble();
        final int desconto20 = 20;
        double precoComDesconto = precoProduto
        -(precoProduto*desconto20/100);
        System.out.println("O Preço com Desconto é"
        +precoComDesconto+"reais");
        sc.close();
    }


    public void calcular30(){
        double precoProduto;
        precoProduto = 3000;
        final int desconto30 = 30;
        double precoComDesconto = precoProduto
        -(precoProduto*desconto30/100);
        System.out.println("O Preço com Desconto é"
        +precoComDesconto+"reais");
    }

        public void calcular40(){
        double precoProduto;
        precoProduto = 40000;
        final int desconto40 = 40;
        double precoComDesconto = precoProduto
        -(precoProduto*desconto40/100);
        System.out.println("O Preço com Desconto é"
        +precoComDesconto+"reais");
    }
}
