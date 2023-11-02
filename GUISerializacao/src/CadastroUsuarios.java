import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CadastroUsuarios extends JPanel {
    private JTextField inputNome; // Campo de entrada para o nome do usuário
    private JTextField inputIdade; // Campo de entrada para a idade do usuário
    private DefaultTableModel tableModel; // Modelo de tabela para exibir os usuários
    private JTable table; // Tabela para exibir os usuários

    private List<Usuario> usuarios = new ArrayList<>(); // Lista de usuários
    private int linhaSelecionada = -1; // Índice da linha selecionada na tabela

    public CadastroUsuarios() {
        
        tableModel = new DefaultTableModel(); // Inicializa o modelo da tabela
        tableModel.addColumn("Nome"); // Adiciona uma coluna "Nome" à tabela
        tableModel.addColumn("Idade"); // Adiciona uma coluna "Idade" à tabela
        table = new JTable(tableModel); // Cria a tabela com base no modelo
        JScrollPane scrollPane = new JScrollPane(table); // Adiciona uma barra de rolagem à tabela
        inputNome = new JTextField(20); // Cria um campo de texto para o nome com 20 colunas de largura
        inputIdade = new JTextField(5); // Cria um campo de texto para a idade com 5 colunas de largura
        JButton cadastrarButton = new JButton("Cadastrar"); // Cria um botão "Cadastrar"
        JButton atualizarButton = new JButton("Atualizar"); // Cria um botão "Atualizar"
        JButton apagarButton = new JButton("Apagar"); // Cria um botão "Apagar"
        JButton apagarTodosButton = new JButton("Apagar Todos"); // Cria um botão "Apagar Todos"
        JButton salvarButton = new JButton("Salvar"); // Cria um botão "Salvar"
        JPanel inputPanel = new JPanel(); // Cria um painel para organizar os componentes de entrada
        inputPanel.add(new JLabel("Nome:")); // Adiciona um rótulo "Nome" ao painel
        inputPanel.add(inputNome); // Adiciona o campo de texto do nome ao painel
        inputPanel.add(new JLabel("Idade:")); // Adiciona um rótulo "Idade" ao painel
        inputPanel.add(inputIdade); // Adiciona o campo de texto da idade ao painel
        inputPanel.add(cadastrarButton); // Adiciona o botão "Cadastrar" ao painel
        inputPanel.add(atualizarButton); // Adiciona o botão "Atualizar" ao painel
        inputPanel.add(apagarButton); // Adiciona o botão "Apagar" ao painel
        inputPanel.add(apagarTodosButton); // Adiciona o botão "Apagar Todos" ao painel
        inputPanel.add(salvarButton); // Adiciona o botão "Salvar" ao painel
        setLayout(new BorderLayout()); // Define o layout deste painel como BorderLayout
        add(inputPanel, BorderLayout.NORTH); // Adiciona o painel de entrada à parte superior do painel
        add(scrollPane, BorderLayout.CENTER); // Adiciona a barra de rolagem com a tabela ao centro do painel

        // Deserialização quando a aplicação é aberta
        File arquivo = new File("dados.txt"); // Cria um objeto File para o arquivo "dados.txt"
        if (arquivo.exists()) { // Verifica se o arquivo existe
            usuarios = Serializacao.deserializar("dados.txt"); // Carrega os usuários a partir do arquivo
            atualizarTabela(); // Atualiza a tabela com os dados dos usuários
        }

        // Tratamentos de eventos

        // Define um ouvinte de eventos do mouse para a tabela
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint()); // Obtém a linha selecionada na tabela
                if (linhaSelecionada != -1) {
                    inputNome.setText((String) table.getValueAt(linhaSelecionada, 0)); // Define o nome no campo de texto
                    inputIdade.setText(table.getValueAt(linhaSelecionada, 1).toString()); // Define a idade no campo de texto
                }
            }
        });

        // Cria um objeto OperacoesUsuarios para realizar operações nos usuários
        OperacoesUsuarios operacoes = new OperacoesUsuarios(usuarios, tableModel, table);

        // Adiciona ouvintes de eventos para os botões

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.cadastrarUsuario(inputNome.getText(), inputIdade.getText());
                inputNome.setText(""); // Limpa o campo de texto do nome
                inputIdade.setText(""); // Limpa o campo de texto da idade
            }
        });

        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.atualizarUsuario(linhaSelecionada, inputNome.getText(), inputIdade.getText());
            }
        });

        apagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarUsuario(linhaSelecionada);
            }
        });

        apagarTodosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarTodosUsuarios();
            }
        });

        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.salvarUsuarios();
            }
        });
    }

    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas da tabela
        for (Usuario usuario : usuarios) {
            tableModel.addRow(new Object[] { usuario.getNome(), usuario.getIdade() }); // Adiciona os dados dos usuários à tabela
        }
    }
}
