package model;

import java.io.*;
import java.util.ArrayList;

public class CsvManager {
    private static final String ISCRITTI_FILE = "iscritti.csv";
    private static final String ABBONAMENTI_FILE = "abbonamenti.csv";

    private CsvManager() { }

    private static class CsvManagerHolder {
        private static final CsvManager INSTANCE = new CsvManager();
    }

    public static CsvManager getInstance() {
        return CsvManagerHolder.INSTANCE;
    }

    public void saveIscritti(ArrayList<Iscritto> iscritti) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ISCRITTI_FILE))) {
            for (Iscritto i : iscritti) {
                writer.write(i.getCodiceIdentificativo() + ";" + i.getNome() + ";" + i.getCognome());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Iscritto> loadIscritti() {
        ArrayList<Iscritto> iscritti = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ISCRITTI_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length >= 3) {
                    Iscritto i = new Iscritto(parts[0], parts[1], parts[2]);
                    iscritti.add(i);
                }
            }
        } catch (IOException e) {
        }
        return iscritti;
    }

    public void saveAbbonamenti(ArrayList<Iscritto> iscritti) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ABBONAMENTI_FILE))) {
            for (Iscritto i : iscritti) {
                for (Abbonamento a : i.getAbbonamentiAttivi()) {
                    writer.write(i.getCodiceIdentificativo() + ";" +
                                 a.getTipologia() + ";" +
                                 a.getDataInizio() + ";" +
                                 a.getDataFine() + ";" +
                                 a.getCosto());
                    writer.newLine();
                }
                for (Abbonamento a : i.getStoricoAbbonamenti()) {
                    writer.write(i.getCodiceIdentificativo() + ";" +
                                 a.getTipologia() + ";" +
                                 a.getDataInizio() + ";" +
                                 a.getDataFine() + ";" +
                                 a.getCosto());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
