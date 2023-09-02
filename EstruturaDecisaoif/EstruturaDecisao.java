package EstruturaDecisaoif;

import java.math.MathContext;
import java.util.Scanner;

public class EstruturaDecisao {
    Scanner sc = new Scanner(System.in);
    private int precoProduto;
    private int percentualDesconto;
    public void decisaoIf() {
        System.out.println("Qual é o Preço de Produto?");
        double precoProduto = sc.nextDouble();
        boolean produtoAltoValor = precoProduto >= 100;
        boolean produtoGrandeValor = precoProduto >= 200;
        boolean produtoLuxo = precoProduto >= 300;
        double percentualDesconto = 0.0;
        if (precoProduto>=300) {// desconto para Produto Luxo
            percentualDesconto = 15.0;
        }

        if (precoProduto>=200 && precoProduto<300) {//desconto para  produtos de Grande Valor
            percentualDesconto = 10.0;            
        }

        if (precoProduto>=100 && precoProduto<200) { // Estrutura da desisão if
            // Desconto para produtos de Alto Valor.
            percentualDesconto = 5.0;
        }
    
        //Regra de três
        double Desconto = (precoProduto * percentualDesconto) / 100;
        double precoComDesconto = precoProduto - Desconto;
        System.out.println("O produto sairá por R$" + precoComDesconto);
        
    }
    public void desisaoIfElse (){
        System.out.println("Digite o Preço do Produto");
        double precoProduto = sc.nextDouble();
        double percentualDesconto = 0.0;
        if(precoProduto<=100){
            percentualDesconto = 0.0;
        } else if (precoProduto >= 100 && precoProduto < 200) {
            percentualDesconto = 5.0;

        } else if (precoProduto>=200 && precoProduto < 300){
            percentualDesconto = 10.0;
        } else{
            percentualDesconto = 15.0;
        }
        //Regra de três
        double Desconto = (precoProduto * percentualDesconto) / 100;
        double precoComDesconto = precoProduto - Desconto;
        System.out.println("O produto sairá por R$" + precoComDesconto);
    }
        
    }