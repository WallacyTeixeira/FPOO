package EstudoArrayList;

import java.util.ArrayList;

import java.util.Collection;

import java.util.Collections;

import javax.swing.JOptionPane;

public class ExemploArrayList {
    // atributos
    ArrayList<String> carros = new ArrayList<>();
    ArrayList<Integer> num = new ArrayList<>();

    // metodos
    public void teste() {
        // adicionar Valores ao ArrayList
        carros.add(JOptionPane.showInputDialog("uno"));
        carros.add("Chevette");
        carros.add("Celta");
        carros.add("Monza");
        carros.add("Gol");
        // primir toda a lista
        System.out.println(carros);
        //ordenando a lista
        Collections.sort(carros);
        // pegando o valor correspondete a 5 posiçao(index 4)
        System.out.println(carros.get(4));
        // percorrendo a lista com FOR
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }
        //collections.reverse(invertendo a lista)
        Collections.reverse(carros);
        // percorrer a lista com o FOR-EACH
        for (String i : carros) {
            System.out.println(i);
        }
        /// apagar toda a lista
        carros.clear();
        System.out.println(carros);
    }

    public void Exercicio() {
        // criar um array list (Integer) + 5 valores
        // preencher 5 n° int
        for (int i = 0; i < 5; i++) {
            num.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um n°")));
        }
        for (int i : num) {
            System.out.println(i);
        }
    }
}
