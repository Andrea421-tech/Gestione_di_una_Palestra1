package presenter;

import interfaces.IMainForm;
import view.HomeView;

public class HomePresenter {

    private final IMainForm mainForm;

  
    public HomePresenter(IMainForm mainForm) {
        this.mainForm = mainForm;
    }

   
    public void onAggiungiIscrittoClicked() {
        mainForm.show(HomeView.AGGIUNGI_ISCRITTO);
    }

  
    public void onVisualizzaIscrittiClicked() {
        mainForm.show(HomeView.VISUALIZZA_ISCRITTI);
    }

    public void onCercaIscrittoClicked() {
        mainForm.show(HomeView.CERCA_ISCRITTO);
    }

    
    public void onStoricoAbbonamentiClicked() {
        mainForm.show(HomeView.STORICO_ABBONAMENTI);
    }
}
