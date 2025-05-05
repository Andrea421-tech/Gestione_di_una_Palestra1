package model;

import java.util.ArrayList;

public class Iscritto {
    private String codice;
    private String nome;
    private String cognome;
    private ArrayList<Abbonamento> abbonamentiAttivi;
    private ArrayList<Abbonamento> storicoAbbonamenti;
    
    public Iscritto(String codice, String nome, String cognome) {
        this.codice = codice;
        this.nome = nome;
        this.cognome = cognome;
        this.abbonamentiAttivi = new ArrayList<>();
        this.storicoAbbonamenti = new ArrayList<>();
    }
    
    // In questo esempio, supponiamo che il metodo getCodiceIdentificativo restituisca il codice
    public String getCodiceIdentificativo() { return codice; }
    public String getNome() { return nome; }
    public String getCognome() { return cognome; }
    public ArrayList<Abbonamento> getAbbonamentiAttivi() { return abbonamentiAttivi; }
    public ArrayList<Abbonamento> getStoricoAbbonamenti() { return storicoAbbonamenti; }
    
    public void aggiungiAbbonamentoAttivo(Abbonamento abb) {
        abbonamentiAttivi.add(abb);
    }
    
    public void terminaAbbonamento(Abbonamento abb) {
        if(abbonamentiAttivi.remove(abb)) {
            storicoAbbonamenti.add(abb);
        }
    }
    
    @Override
    public String toString() {
        return "Iscritto{" +
               "codice='" + codice + '\'' +
               ", nome='" + nome + '\'' +
               ", cognome='" + cognome + '\'' +
               '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj instanceof Iscritto) {
            Iscritto other = (Iscritto) obj;
            return this.codice.equalsIgnoreCase(other.codice);
        }
        return false;
    }

    public String getCodice() {
        return this.codice;
    }
}

