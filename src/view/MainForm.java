
package view;

import interfaces.IMainForm;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import model.Abbonamento;

public class MainForm  extends javax.swing.JFrame implements IMainForm{

    public static final String HOME = "HOME";
    public static final String AGGIUNGI_ISCRITTO = "AGGIUNGI_ISCRITTO";
    public static final String VISUALIZZA_ISCRITTI = "VISUALIZZA_ISCRITTI";
    public static final String CERCA_ISCRITTO = "CERCA_ISCRITTO";
    public static final String STORICO_ABBONAMENTI = "STORICO_ABBONAMENTI";
    public static final String ABBONAMENTI_ATTIVI = "ABBONAMENTI_ATTIVI";
    


      private ArrayList<String> _cardAperte;
      private String lastCardName;
      private CardLayout cardLayout;
      private ArrayList<Abbonamento> abbonamentiAttiviView;
      private JPanel cardPanel;

    public MainForm() {
         initComponents();
         
             if (cardPanel == null) {
            cardPanel = new JPanel();
            getContentPane().add(cardPanel);
        }

        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        _cardAperte = new ArrayList<>();
        _cardAperte.add(HOME);
        lastCardName = HOME;

          HomeView homeView = new HomeView();
         AggiungiIscrittoView inserisciView = new AggiungiIscrittoView(this);
         CercaIscrittoView cercaView = new CercaIscrittoView(this);
         AbbonamentiAttiviView abbonamentiAttivi = new AbbonamentiAttiviView(this);
         VisualizzaIscrittiView visualizzaView = new VisualizzaIscrittiView(this);
         StoricoAbbonamentiView storicoView = new StoricoAbbonamentiView(this);
         abbonamentiAttiviView = new ArrayList<>();

        cardPanel.add(homeView, HOME);
        cardPanel.add(inserisciView, AGGIUNGI_ISCRITTO);
        cardPanel.add(cercaView, CERCA_ISCRITTO);
        cardPanel.add(visualizzaView, VISUALIZZA_ISCRITTI);
        cardPanel.add(storicoView, STORICO_ABBONAMENTI);
        cardPanel.add(abbonamentiAttivi, ABBONAMENTI_ATTIVI);

        cardLayout.show(cardPanel, HOME);

        pack();
         setLocationRelativeTo(null); 
         setVisible(true);
    }
    
    @Override
    public void show(String cardName) {
        _cardAperte.add(lastCardName);
        lastCardName = cardName;
        cardLayout.show(cardPanel, cardName);
    }

    @Override
    public void show(boolean goHome) {
        if (goHome) {
            GoHome();
        } else {
            Back();
        }
    }

    public void GoHome() {
        cardLayout.show(cardPanel, HOME);
        lastCardName = HOME;
        _cardAperte.clear();
    }

    public void Back() {
        if (!_cardAperte.isEmpty()) {
            String cardName = _cardAperte.remove(_cardAperte.size() - 1);
            lastCardName = cardName;
            cardLayout.show(cardPanel, cardName);
        } else {
            GoHome();
        }
    }
    
       
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("<-- Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Inserisci");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.Back();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.GoHome();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    this.show(AGGIUNGI_ISCRITTO); 
    }//GEN-LAST:event_jButton3ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables


  




}


