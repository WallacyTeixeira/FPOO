package CalculadoraCustoViagem;

/**
 * CalculadoraCustoViagem
 */
public class CalculadoraCustoViagem {

    public static void main(String[] args) {
        double DistanciaPercorrida = 4169000 / 1000;
        double PreçoDaGasolina = 260.50;
        double distanciaPercorrida = 60;
        double QuilometroPorLitro = 3.9;
        double ValorEstimadoDaViagem = DistanciaPercorrida * PreçoDaGasolina / QuilometroPorLitro;
        System.out.println("O Custo Medio Da Viagem É"
                + ValorEstimadoDaViagem*2 + "R$");
    }
}