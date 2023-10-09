import java.util.ArrayList; // Importa a classe ArrayList para gerenciar uma lista de tarefas
import java.util.List; // Importa a interface List para trabalhar com listas
import java.util.logging.Handler;

import javax.swing.DefaultListModel; // Importa DefaultListModel para usar em uma JList
import javax.swing.JButton; // Importa JButton para criar botões
import javax.swing.JComboBox; // Importa JComboBox para criar uma caixa de seleção
import javax.swing.JFrame; // Importa JFrame para criar a janela principal
import javax.swing.JList; // Importa JList para exibir a lista de tarefas
import javax.swing.JPanel; // Importa JPanel para criar painéis
import javax.swing.JScrollPane; // Importa JScrollPane para adicionar barras de rolagem
import javax.swing.JTextField; // Importa JTextField para criar campo de entrada de texto
import java.awt.*; // Importa classes do pacote awt para gerenciar a interface gráfica

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TodoList extends JFrame {
    // atributos
    private JPanel mainPanel; // Painel principal da interface
    private JTextField taskInputField; // Campo de entrada de texto para adicionar tarefas
    private JButton addButton; // Botão para adicionar tarefas
    private JList<String> taskList; // Lista de tarefas
    private DefaultListModel<String> listModel; // Modelo da lista de tarefas
    private JButton deleteButton; // Botão para excluir tarefas
    private JButton markDoneButton; // Botão para marcar tarefas como concluídas
    private JComboBox<String> filterComboBox; // Caixa de seleção para filtrar tarefas
    private JButton clearCompletedButton; // Botão para limpar tarefas concluídas
    private List<Task> tasks; // Lista de tarefas

    // CONSTRUTOR
    public TodoList() {
        // Configuração da janela principal
        super("To-Do List App"); // Define o título da janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define o comportamento padrão de fechar a janela
        this.setSize(425, 300); // Define o tamanho da janela

        // Inicializa o painel principal
        mainPanel = new JPanel(); // Cria um novo painel
        mainPanel.setLayout(new BorderLayout()); // Define o layout do painel como BorderLayout

        // Inicializa a lista de tasks e a lista de tasks concluídas
        tasks = new ArrayList<>(); // Cria uma lista vazia para armazenar as tarefas
        listModel = new DefaultListModel<>(); // Cria um modelo de lista para a JList
        taskList = new JList<>(listModel); // Cria a JList com o modelo

        // Inicializa campos de entrada, botões e JComboBox
        taskInputField = new JTextField(); // Cria um campo de entrada de texto
        addButton = new JButton("Adicionar"); // Cria um botão com rótulo "Adicionar"
        deleteButton = new JButton("Excluir"); // Cria um botão com rótulo "Excluir"
        markDoneButton = new JButton("Concluir"); // Cria um botão com rótulo "Concluir"
        filterComboBox = new JComboBox<>(new String[] { "Todas", "Ativas", "Concluídas" }); // Cria uma caixa de seleção com opções
        clearCompletedButton = new JButton("Limpar Concluídas"); // Cria um botão com rótulo "Limpar Concluídas"

        // Configuração do painel de entrada
        JPanel inputPanel = new JPanel(new BorderLayout()); // Cria um novo painel com BorderLayout
        inputPanel.add(taskInputField, BorderLayout.CENTER); // Adiciona o campo de entrada ao centro do painel
        inputPanel.add(addButton, BorderLayout.EAST); // Adiciona o botão "Adicionar" à direita do painel

        // Configuração do painel de botões
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // Cria um novo painel com layout FlowLayout à esquerda
        buttonPanel.add(deleteButton); // Adiciona o botão "Excluir" ao painel
        buttonPanel.add(markDoneButton); // Adiciona o botão "Concluir" ao painel
        buttonPanel.add(filterComboBox); // Adiciona a caixa de seleção ao painel
        buttonPanel.add(clearCompletedButton); // Adiciona o botão "Limpar Concluídas" ao painel

        // Adiciona os componentes ao painel principal
        mainPanel.add(inputPanel, BorderLayout.NORTH); // Adiciona o painel de entrada na parte superior do painel principal
        mainPanel.add(new JScrollPane(taskList), BorderLayout.CENTER); // Adiciona a lista de tarefas com barra de rolagem ao centro do painel principal
        mainPanel.add(buttonPanel, BorderLayout.SOUTH); // Adiciona o painel de botões na parte inferior do painel principal

        // Adiciona o painel principal à janela
        this.add(mainPanel); // Adiciona o painel principal à janela
        this.setVisible(true); // Torna a janela visível

        // criar os tratamentos de eventos - listener e eventos (FALTA IMPLEMENTAR)

        Handler add = new Handler();
        addButton.addActionListener(add);

        Handler2 del = new Handler2();
        deleteButton.addActionListener(del);

        Handler3 don = new Handler3();
        markDoneButton.addActionListener(don);

        Handler4 clr = new Handler4();
        clearCompletedButton.addActionListener(clr);

        Handler5 ftr = new Handler5();
        filterComboBox.addActionListener(ftr);

        Handler6 Tecl = new Handler6();
        filterComboBox.addActionListener(ftr);
        
    }

    public class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Chama Classe Para Adicionar Tarefa
            addTask(); 
        }

    }

    public class Handler2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Chama classe para deletar Tarefa
            deleteTask(); 
        }

    }

    public class Handler3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Chama classe para Concluir Tarefa
            markTaskDone(); 
        }

    }

    public class Handler4 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Chama classe para Limpar Tarefas Concluidas
            clearCompletedTasks(); 
        }

    }

    public class Handler5 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Chama Classe Para Adicionar Tarefa
            filterTasks(); 
        }

    }

    public class Handler6 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Chama classe para Limpar Tarefas Concluidas
            clearCompletedTasks(); 
        }

    }



    // criar os métodos (CRUD)
    private void addTask() {
        // Adiciona uma nova task à lista de tasks
        String taskDescription = taskInputField.getText().trim(); // Obtém o texto do campo de entrada e remove espaços em branco
        if (!taskDescription.isEmpty()) { // Verifica se a descrição da tarefa não está vazia
            Task newTask = new Task(taskDescription); // Cria uma nova tarefa com a descrição
            tasks.add(newTask); // Adiciona a nova tarefa à lista de tarefas
            updateTaskList(); // Atualiza a lista de tarefas exibida na GUI
            taskInputField.setText(""); // Limpa o campo de entrada de texto
        }
    }

    private void deleteTask() {
        // Exclui a task selecionada da lista de tasks
        int selectedIndex = taskList.getSelectedIndex(); // Obtém o índice da tarefa selecionada na lista
        if (selectedIndex >= 0 && selectedIndex < tasks.size()) { // Verifica se o índice é válido
            tasks.remove(selectedIndex); // Remove a tarefa da lista
            updateTaskList(); // Atualiza a lista de tarefas exibida na GUI
        }
    }

    private void markTaskDone() {
        // Marca a task selecionada como concluída
        int selectedIndex = taskList.getSelectedIndex(); // Obtém o índice da tarefa selecionada na lista
        if (selectedIndex >= 0 && selectedIndex < tasks.size()) { // Verifica se o índice é válido
            Task task = tasks.get(selectedIndex); // Obtém a tarefa selecionada
            task.setDone(true); // Marca a tarefa como concluída
            updateTaskList(); // Atualiza a lista de tarefas exibida na GUI
        }
    }

    private void filterTasks() {
        // Filtra as tasks com base na seleção do JComboBox
        String filter = (String) filterComboBox.getSelectedItem(); // Obtém o filtro selecionado na caixa de seleção
        listModel.clear(); // Limpa o modelo da lista
        for (Task task : tasks) { // Itera sobre todas as tarefas na lista
            if (filter.equals("Todas") || (filter.equals("Ativas") &&
                    !task.isDone()) || (filter.equals("Concluídas") && task.isDone())) {
                // Verifica se a tarefa deve ser exibida com base no filtro selecionado
                listModel.addElement(task.getDescription()); // Adiciona a descrição da tarefa à lista exibida na GUI
            }
        }
    }

    private void clearCompletedTasks() {
        // Limpa todas as tasks concluídas da lista
        List<Task> completedTasks = new ArrayList<>(); // Cria uma lista temporária para armazenar tarefas concluídas
        for (Task task : tasks) { // Itera sobre todas as tarefas na lista
            if (task.isDone()) { // Verifica se a tarefa está concluída
                completedTasks.add(task); // Adiciona a tarefa à lista de tarefas concluídas
            }
        }
        tasks.removeAll(completedTasks); // Remove todas as tarefas concluídas da lista principal
        updateTaskList(); // Atualiza a lista de tarefas exibida na GUI
    }

    private void updateTaskList() {
        // Atualiza a lista de tasks exibida na GUI
        listModel.clear(); // Limpa o modelo da lista
        for (Task task : tasks) { // Itera sobre todas as tarefas na lista
            listModel.addElement(task.getDescription() + (task.isDone() ? " (Concluída)" : ""));
            // Adiciona a descrição da tarefa à lista exibida na GUI, indicando se está concluída
        }
    }

    public void run() {
        // Exibe a janela
        this.setVisible(true); // Torna a janela visível
    }
}
