package model;

public class AbbonamentoAnnuale extends Abbonamento {
    public AbbonamentoAnnuale(String dataInizio, String dataFine, double costo, String sospensioniRinnovi,
                              String metodoPagamento) {
        super(dataInizio, dataFine, "Annuale", costo, sospensioniRinnovi, metodoPagamento);
    }
}
