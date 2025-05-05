package presenter;

import model.Iscritto;
import model.IscrittiManager;
import view.CercaIscrittoView;

public class CercaIscrittoPresenter {
    private final CercaIscrittoView view;
    
    public CercaIscrittoPresenter(CercaIscrittoView view) {
        this.view = view;
    }
    
    public void cercaIscritto(String codice) {
        Iscritto iscritto = IscrittiManager.getInstance().cercaIscritto(codice);
        if (iscritto != null) {
            view.showIscritto("Iscritto trovato:\n" + iscritto.toString());
        } else {
            view.showMessage("Nessun iscritto trovato con il codice: " + codice);
        }
    }
}

