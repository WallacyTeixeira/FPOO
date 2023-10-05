import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                criarGUI();
            }
        });
    }

    public static void criarGUI() {
        // Criar a janela principal
        JFrame janela = new JFrame("Aplicativo com JTabbedPane");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 300);

        // Criar o JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Aba 1: Calculadora
        JPanel abaCalculadora = criarAbaCalculadora();
        tabbedPane.addTab("Calculadora", abaCalculadora);

        // Aba 2: Conversão de Unidades
        JPanel abaConversao = criarAbaConversaoUnidades();
        tabbedPane.addTab("Conversão de Unidades", abaConversao);

        // Aba 3: Lista de Tarefas
        JPanel abaListaTarefas = criarAbaListaTarefas();
        tabbedPane.addTab("Lista de Tarefas", abaListaTarefas);

        // Adicionar o JTabbedPane à janela
        janela.add(tabbedPane);

        // Exibir a janela
        janela.setVisible(true);
    }

    public static JPanel criarAbaCalculadora() {
        JPanel abaCalculadora = new JPanel();
        abaCalculadora.setLayout(new BorderLayout());

        JTextField campoTexto = new JTextField(10);
        JButton botaoCalcular = new JButton("Calcular");
        JLabel resultadoCalculo = new JLabel("Resultado:");

        botaoCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor = Double.parseDouble(campoTexto.getText());
                    double resultado = valor * 2; // Exemplo de cálculo
                    resultadoCalculo.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    resultadoCalculo.setText("Resultado: Erro");
                }
            }
        });

        abaCalculadora.add(campoTexto, BorderLayout.NORTH);
        abaCalculadora.add(botaoCalcular, BorderLayout.CENTER);
        abaCalculadora.add(resultadoCalculo, BorderLayout.SOUTH);

        return abaCalculadora;
    }

    public static JPanel criarAbaConversaoUnidades() {
        JPanel abaConversao = new JPanel();
        abaConversao.setLayout(new FlowLayout());

        JComboBox<String> unidades = new JComboBox<>(new String[]{"Metro", "Polegada", "Centímetro"});
        JTextField valorEntrada = new JTextField(10);
        JButton botaoConverter = new JButton("Converter");
        JLabel resultadoConversao = new JLabel("Resultado:");

        botaoConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor = Double.parseDouble(valorEntrada.getText());
                    String unidadeSelecionada = unidades.getSelectedItem().toString();
                    double resultado = 0.0;

                    if (unidadeSelecionada.equals("Polegada")) {
                        resultado = valor * 39.37;
                    } else if (unidadeSelecionada.equals("Centímetro")) {
                        resultado = valor * 100;
                    } else {
                        resultado = valor;
                    }

                    resultadoConversao.setText("Resultado: " + resultado + " " + unidadeSelecionada);
                } catch (NumberFormatException ex) {
                    resultadoConversao.setText("Resultado: Erro");
                }
            }
        });

        abaConversao.add(unidades);
        abaConversao.add(valorEntrada);
        abaConversao.add(botaoConverter);
        abaConversao.add(resultadoConversao);

        return abaConversao;
    }

    public static JPanel criarAbaListaTarefas() {
        JPanel abaListaTarefas = new JPanel();
        abaListaTarefas.setLayout(new BoxLayout(abaListaTarefas, BoxLayout.Y_AXIS));

        DefaultListModel<String> listaTarefasModel = new DefaultListModel<>();
        JList<String> listaTarefas = new JList<>(listaTarefasModel);
        JTextField novaTarefa = new JTextField(20);
        JButton botaoAdicionarTarefa = new JButton("Adicionar Tarefa");

        botaoAdicionarTarefa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tarefa = novaTarefa.getText();
                if (!tarefa.isEmpty()) {
                    listaTarefasModel.addElement(tarefa);
                    novaTarefa.setText("");
                }
            }
        });

        abaListaTarefas.add(new JScrollPane(listaTarefas));
        abaListaTarefas.add(novaTarefa);
        abaListaTarefas.add(botaoAdicionarTarefa);

        return abaListaTarefas;
    }
}
