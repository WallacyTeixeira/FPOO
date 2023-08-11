package EstudoArrayList;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class ExemploHashMap {
    // atributos
    HashMap<String, String> capitalEstado = new HashMap<>();
    // metodo
    public void teste() {
        capitalEstado.put("SP", "São Paulo");
        capitalEstado.put("MG", "Belo Horizonte");
        capitalEstado.put("RJ", "Rio de Janeiro");
        capitalEstado.put("ES", "Vitoria");
        boolean jogo = true;
        while (jogo) {
            String estado = JOptionPane.showInputDialog("Digite a Sigla do Estado");
            JOptionPane.showMessageDialog(null, capitalEstado.get(estado));
        }
    }

    HashMap<String, Integer> pessoasIdade = new HashMap<>();

    public void Pessoas() {
        pessoasIdade.put("Leandro", 22);
        pessoasIdade.put("Carvalho", 40);
        pessoasIdade.put("Enzo", 18);
        pessoasIdade.put("Odair", 60);
        boolean banco = true;
        while (banco) {
            String idade = JOptionPane.showInputDialog("Digite o Nome da Pessoa");
            JOptionPane.showMessageDialog(null, pessoasIdade.get(idade));
        }
    }

}
