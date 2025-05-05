package presenter;

import view.AggiungiIscrittoView;
import model.Iscritto;
import model.IscrittiManager;
import model.CsvManager;

public class AggiungiIscrittoPresenter {

    private final IscrittiManager iscrittiManager = IscrittiManager.getInstance();
    private final CsvManager csvManager = CsvManager.getInstance();
    private final AggiungiIscrittoView view;

    public AggiungiIscrittoPresenter(AggiungiIscrittoView view) {
        this.view = view;
    }


    public boolean aggiungiIscritto(String nome, String cognome, String codice) {
        if (nome == null || cognome == null || codice == null ||
            nome.trim().isEmpty() || cognome.trim().isEmpty() || codice.trim().isEmpty()) {
            return false;
        }
        
        Iscritto iscritto = new Iscritto(codice, nome, cognome);
        iscrittiManager.aggiungiIscritto(iscritto);
        csvManager.saveIscritti(iscrittiManager.getIscritti());
        return true;
    }

    public void salvaIscritto(String codice, String nome, String cognome) {
        boolean result = aggiungiIscritto(nome, cognome, codice);
        if(result) {
            view.displayMessage("Iscritto aggiunto con successo.");
        } else {
            view.displayMessage("Errore: tutti i campi devono essere compilati.");
        }
    }
}


