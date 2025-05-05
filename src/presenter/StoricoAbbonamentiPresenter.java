package presenter;

import model.Iscritto;
import model.IscrittiManager;
import java.util.ArrayList;
import model.Abbonamento;
import view.StoricoAbbonamentiView;

public class StoricoAbbonamentiPresenter {
    
    private StoricoAbbonamentiView view;
    
    public StoricoAbbonamentiPresenter(StoricoAbbonamentiView view) {
        this.view = view;
    }
    
 
    public void caricaStoricoAbbonamenti(String codiceIscritto) {
        Iscritto i = IscrittiManager.getInstance().cercaIscritto(codiceIscritto);
        if (i != null) {
            ArrayList<Abbonamento> storici = i.getStoricoAbbonamenti();
            if (storici.isEmpty()) {
                view.displayMessage("Nessun abbonamento trovato per questo iscritto.");
            } else {
                StringBuilder sb = new StringBuilder();
                for (Abbonamento s : storici) {
                    sb.append(s).append("\n");
                }
                view.displayStorico(sb.toString());
            }
        } else {
            view.displayMessage("Iscritto non trovato per il codice: " + codiceIscritto);
        }
    }
    
  
    public void mostraStorico(String codice) {
        caricaStoricoAbbonamenti(codice);
    }
}
