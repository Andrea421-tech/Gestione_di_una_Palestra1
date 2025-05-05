package model;

import java.util.ArrayList;

public class AbbonamentiManager {

    private AbbonamentiManager() {
        abbonamenti = new ArrayList<>();
    }

    private static class AbbonamentiManagerHolder {
        private static final AbbonamentiManager INSTANCE = new AbbonamentiManager();
    }

    public static AbbonamentiManager getInstance() {
        return AbbonamentiManagerHolder.INSTANCE;
    }

    private ArrayList<Abbonamento> abbonamenti;

    public void aggiungiAbbonamento(Abbonamento abbonamento) {
        abbonamenti.add(abbonamento);
    }

    public ArrayList<Abbonamento> getAbbonamenti() {
        return abbonamenti;
    }
}
