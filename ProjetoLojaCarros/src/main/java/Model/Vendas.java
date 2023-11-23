package Model;

public class Vendas {

    private String Comprador;    // Nome do comprador
    private String Modelo;       // Modelo do veículo
    private String Data;         // Data da venda
    private int Valor;           // Valor da venda

    // Construtor para inicializar o objeto Vendas com valores fornecidos
    public Vendas(String comprador, String modelo, String data, int valor) {
        Comprador = comprador;
        Modelo = modelo;
        Data = data;
        Valor = valor;
    }

    // Método de obtenção para recuperar o nome do comprador
    public String getComprador() {
        return Comprador;
    }

    // Método de configuração para definir o nome do comprador
    public void setComprador(String comprador) {
        Comprador = comprador;
    }

    // Método de obtenção para recuperar o modelo do veículo
    public String getModelo() {
        return Modelo;
    }

    // Método de configuração para definir o modelo do veículo
    public void setModelo(String veiculo) {
        Modelo = veiculo;
    }

    // Método de obtenção para recuperar a data da venda
    public String getData() {
        return Data;
    }

    // Método de configuração para definir a data da venda
    public void setData(String data) {
        Data = data;
    }

    // Método de obtenção para recuperar o valor da venda
    public int getValor() {
        return Valor;
    }

    // Método de configuração para definir o valor da venda
    public void setValor(int valor) {
        this.Valor = valor;
    }
}
