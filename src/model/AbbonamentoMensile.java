package model;

public class AbbonamentoMensile extends Abbonamento {
    public AbbonamentoMensile(String dataInizio, String dataFine, double costo, String sospensioniRinnovi,
                              String metodoPagamento) {
        super(dataInizio, dataFine, "Mensile", costo, sospensioniRinnovi, metodoPagamento);
    }
}
