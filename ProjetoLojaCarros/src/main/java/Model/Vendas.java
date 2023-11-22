package Model;

public class Vendas {

    private String Comprador;
    private String Modelo;
    private int Data;
    private int Valor;

    public Vendas(String comprador, String modelo, int data, int valor) {
        Comprador = comprador;
        Modelo = modelo;
        Data = data;
        Valor = valor;
    }

    public String getComprador() {
        return Comprador;
    }

    public void setComprador(String comprador) {
        Comprador = comprador;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String veiculo) {
        Modelo = veiculo;
    }

    public int getData() {
        return Data;
    }

    public void setData(int data) {
        Data = data;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int valor) {
        this.Valor = valor;
    }

}
