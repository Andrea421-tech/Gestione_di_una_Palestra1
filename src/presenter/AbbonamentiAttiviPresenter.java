package presenter;

import view.AbbonamentiAttiviView;

public class AbbonamentiAttiviPresenter {
    
    private AbbonamentiAttiviView view;
    
    public AbbonamentiAttiviPresenter(AbbonamentiAttiviView view) {
        this.view = view;
    }
    
  
    public String filterAbbonamentiAttivi(String tipologia) {
        if(tipologia == null || tipologia.isEmpty()){
            return "Nessun tipo di abbonamento selezionato.";
        }
    
        if(tipologia.equalsIgnoreCase("Mensile")){
            return "Abbonamenti attivi Mensili:\n- Abbonamento Mensile 1\n- Abbonamento Mensile 2";
        } else if(tipologia.equalsIgnoreCase("Annuale")){
            return "Abbonamenti attivi Annuali:\n- Abbonamento Annuale 1\n- Abbonamento Annuale 2";
        } else {
            return "Nessun abbonamento trovato per la tipologia selezionata.";
        }
    }
}

