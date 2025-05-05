package presenter;

import model.Iscritto;
import model.IscrittiManager;
import java.util.ArrayList;
import view.VisualizzaIscrittiView;

public class VisualizzaIscrittiPresenter {
    private VisualizzaIscrittiView view;
    
    public VisualizzaIscrittiPresenter(VisualizzaIscrittiView view) {
        this.view = view;
    }
    
    public void caricaIscritti() {
        ArrayList<Iscritto> iscritti = IscrittiManager.getInstance().getIscritti();
        view.displayIscritti(iscritti);
    }
}

