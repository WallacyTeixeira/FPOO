package calculadoraDescontos;

import java.util.Scanner;

public class calculadoraDescontos {
    Scanner sc = new Scanner(System.in);
    public void calcular20(){
        
        System.out.println("Informe o Preço do Produto");
        double precoProduto = sc.nextDouble();
        final int desconto20 = 20;
        double precoComDesconto = precoProduto
        -(precoProduto*desconto20/100);
        System.out.println("O Preço com Desconto é "
        + precoComDesconto + " reais");
        

    }
    public void calcular30(){
        
        System.out.println("Informe o Preço do Produto");
        double precoProduto = sc.nextDouble();
        final int desconto30 = 30;
        double precoComDesconto = precoProduto
        -(precoProduto*desconto30/100);
        System.out.println("O Preço com Desconto é "
        + precoComDesconto + " reais");
        
    }
}
