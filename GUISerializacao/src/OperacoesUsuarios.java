import java.util.List;  // Importa a classe List do pacote java.util
import javax.swing.JTable;  // Importa a classe JTable do pacote javax.swing
import javax.swing.table.DefaultTableModel;  // Importa a classe DefaultTableModel do pacote javax.swing.table

public class OperacoesUsuarios {
    // Atributos da classe
    private List<Usuario> usuarios;  // Lista que armazena objetos do tipo Usuario
    private DefaultTableModel tableModel;  // Modelo de tabela para a GUI
    private JTable table;  // Tabela da GUI

    // Construtor da classe
    public OperacoesUsuarios(List<Usuario> usuarios, DefaultTableModel tableModel, JTable table) {
        this.usuarios = usuarios;  // Inicializa o atributo 'usuarios' com a lista passada como parâmetro
        this.tableModel = tableModel;  // Inicializa o atributo 'tableModel' com o modelo passado como parâmetro
        this.table = table;  // Inicializa o atributo 'table' com a tabela passada como parâmetro
    }

    // Métodos do CRUD (Create, Read, Update, Delete)

    // Método para cadastrar um novo usuário com nome e idade
    public void cadastrarUsuario(String nome, String idade) {
        int idadeInt = Integer.parseInt(idade);  // Converte a idade de String para int
        Usuario usuario = new Usuario(nome, idadeInt);  // Cria um novo objeto de usuário
        usuarios.add(usuario);  // Adiciona o usuário à lista
        atualizarTabela();  // Atualiza a tabela na interface gráfica
    }

    // Método para atualizar um usuário existente com base na linha selecionada
    public void atualizarUsuario(int linhaSelecionada, String nome, String idade) {
        if (linhaSelecionada != -1) {  // Verifica se uma linha foi selecionada
            int idadeInt = Integer.parseInt(idade);  // Converte a idade de String para int
            Usuario usuario = new Usuario(nome, idadeInt);  // Cria um novo objeto de usuário
            usuarios.set(linhaSelecionada, usuario);  // Substitui o usuário na lista
            atualizarTabela();  // Atualiza a tabela na interface gráfica
        }
    }

    // Método para apagar um usuário com base na linha selecionada
    public void apagarUsuario(int linhaSelecionada) {
        if (linhaSelecionada != -1) {  // Verifica se uma linha foi selecionada
            usuarios.remove(linhaSelecionada);  // Remove o usuário da lista
            atualizarTabela();  // Atualiza a tabela na interface gráfica
        }
    }

    // Método para apagar todos os usuários
    public void apagarTodosUsuarios() {
        usuarios.clear();  // Remove todos os usuários da lista
        atualizarTabela();  // Atualiza a tabela na interface gráfica
    }

    // Método para salvar os usuários em um arquivo
    public void salvarUsuarios() {
        Serializacao.serializar("dados.txt", usuarios);  // Chama um método para serializar a lista em um arquivo
    }

    // Método privado para atualizar a tabela na interface gráfica
    private void atualizarTabela() {
        tableModel.setRowCount(0);  // Limpa todas as linhas da tabela
        for (Usuario usuario : usuarios) {
            tableModel.addRow(new Object[] { usuario.getNome(), usuario.getIdade() });  // Adiciona os dados dos usuários à tabela
        }
    }
}
