package model;

import java.util.ArrayList;

public class IscrittiManager {
    private static IscrittiManager instance;
    private ArrayList<Iscritto> iscritti;
    
    private IscrittiManager() {
        iscritti = CsvManager.getInstance().loadIscritti();
        if(iscritti == null)
            iscritti = new ArrayList<>();
    }
    
    public static IscrittiManager getInstance() {
        if(instance == null) {
            instance = new IscrittiManager();
        }
        return instance;
    }
    
    public ArrayList<Iscritto> getIscritti() {
        return iscritti;
    }
    
    public void aggiungiIscritto(Iscritto iscritto) {
        iscritti.add(iscritto);
        CsvManager.getInstance().saveIscritti(iscritti);
    }
    
    public Iscritto cercaIscritto(String codice) {
        for (Iscritto i : iscritti) {
            if (i.getCodiceIdentificativo().equalsIgnoreCase(codice)) {
                return i;
            }
        }
        return null;
    }
}
