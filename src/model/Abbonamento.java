package model;

public class Abbonamento {
     private String dataInizio;
     private String dataFine;
     private String tipologia;
     private double costo;
     private String sospensioniRinnovi;
     private String metodoPagamento;

    public Abbonamento(String dataInizio, String dataFine, String tipologia, double costo,
                       String sospensioniRinnovi, String metodoPagamento) {
         this.dataInizio = dataInizio;
         this.dataFine = dataFine;
         this.tipologia = tipologia;
         this.costo = costo;
         this.sospensioniRinnovi = sospensioniRinnovi;
         this.metodoPagamento = metodoPagamento;
    }

    public String getDataInizio() { return dataInizio; }
    public String getDataFine() { return dataFine; }
    public String getTipologia() { return tipologia; }
    public double getCosto() { return costo; }
    public String getSospensioniRinnovi() { return sospensioniRinnovi; }
    public String getMetodoPagamento() { return metodoPagamento; }

    @Override
    public String toString() {
        return "Abbonamento{" +
                "dataInizio='" + dataInizio + '\'' +
                ", dataFine='" + dataFine + '\'' +
                ", tipologia='" + tipologia + '\'' +
                ", costo=" + costo +
                ", sospensioniRinnovi='" + sospensioniRinnovi + '\'' +
                ", metodoPagamento='" + metodoPagamento + '\'' +
                '}';
    }
}
