package view;

import javax.swing.SwingUtilities;

public class GymManagerApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainForm().setVisible(true);
        });
    }
}
