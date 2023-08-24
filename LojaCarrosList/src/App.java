import java.util.*;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // criar uma classe Carros - atributos e os metodos
        // app
        // List<(Carros)> listaCarros = new ArrayListe<>();
        List<Carros> listaCarros = new ArrayList<>();
        Boolean aberto = true;
        while (aberto) {
            int acao = Integer
                    .parseInt(JOptionPane.showInputDialog("1-cadastro \n 2-consutar \n 3- excluir \n 4- sair"));
            if (acao == 1) {// 1- Cadastra Carros na Lista
                // Criar um objeto
                String marcaCar = JOptionPane.showInputDialog("Informe a marca");
                String modeloCar = JOptionPane.showInputDialog("Informe o modelo");
                String anoCar = JOptionPane.showInputDialog("Informe o ano");
                String corCar = JOptionPane.showInputDialog("Informe a cor");
                Carros car = new Carros(marcaCar, modeloCar, anoCar, corCar);
                listaCarros.add(car);
            } else if (acao == 2) {// 2- Listar Carros Cadastrados
                String listar = "";
                for (Carros carros : listaCarros) {
                    listar += carros.getMarca() + " " + carros.getModelo() + " " + carros.getAno() + " "
                            + carros.getCor() + "\n";
                }
                JOptionPane.showMessageDialog(null, listar);
            } else if (acao == 3) {// 3-Consultar um Carro Cadastrado
                String listar = "";
                int i = 0;
                for (Carros carros : listaCarros) {
                    listar += i + carros.imprimirLN();
                    i++;
                }
                int acao2 = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Escolah o Carro:\n" + listar));
                listaCarros.get(acao2).imprimir();
                listaCarros.remove(acao2);
            } else if (acao == 4) {// 4- sair
                aberto = false;
            }
        }

    }
}
