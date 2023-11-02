import javax.swing.JFrame; // Importa a classe JFrame do pacote javax.swing
import javax.swing.JTabbedPane; // Importa a classe JTabbedPane do pacote javax.swing

public class MainFrame extends JFrame { // Define uma classe chamada MainFrame que estende a classe JFrame

    public MainFrame() {
        super("App"); // Chama o construtor da classe JFrame e define o título da janela como "App"
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Define a ação padrão de fechamento da janela (fechar a aplicação quando a janela for fechada)

        // Cria um objeto JTabbedPane para conter as abas da aplicação
        JTabbedPane abas = new JTabbedPane();

        // Adiciona uma aba com o título "Cadastro de Usuários" e associa a classe CadastroUsuarios a essa aba
        abas.add("Cadastro de Usuários", new CadastroUsuarios());
        abas.add("Agendamento", new CadastroAgendas());

        // Adiciona o JTabbedPane (com as abas) à janela principal
        add(abas);
    }

    public void run() {
        pack(); // Ajusta o tamanho da janela automaticamente com base no conteúdo
        setVisible(true); // Torna a janela visível
    }
}
