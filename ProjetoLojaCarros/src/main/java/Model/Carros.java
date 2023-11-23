package Model;

public class Carros {
    // Atributos (Attributes)
    private String marca;    // Marca do carro
    private String modelo;   // Modelo do carro
    private String ano;      // Ano do carro
    private String placa;    // Placa do carro
    private String valor;    // Valor do carro

    // Construtor para inicializar o objeto Carros com valores fornecidos
    public Carros(String marca, String modelo, String ano, String placa, String valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.valor = valor;
    }

    // Método de obtenção para recuperar a marca do carro
    public String getMarca() {
        return marca;
    }

    // Método de configuração para definir a marca do carro
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Método de obtenção para recuperar o modelo do carro
    public String getModelo() {
        return modelo;
    }

    // Método de configuração para definir o modelo do carro
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método de obtenção para recuperar o ano do carro
    public String getAno() {
        return ano;
    }

    // Método de configuração para definir o ano do carro
    public void setAno(String ano) {
        this.ano = ano;
    }

    // Método de obtenção para recuperar a placa do carro
    public String getPlaca() {
        return placa;
    }

    // Método de configuração para definir a placa do carro
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Método de obtenção para recuperar o valor do carro
    public String getValor() {
        return valor;
    }

    // Método de configuração para definir o valor do carro
    public void setValor(String valor) {
        this.valor = valor;
    }
}
