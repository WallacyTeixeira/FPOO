package RevisaoFPOO.Agenda;

public class Agenda {
    //atributos
    String servico;
    String data;
    String hora;
    String dataHora;
    //métodos
    public String getServico() {
        return servico;
    }
    public void setServico(String servico) {
        this.servico = servico;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getDataHora() {
        dataHora = data + hora;
        return dataHora;
    }
    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

}
