package view;

import interfaces.IMainForm;
import interfaces.ICard;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BaseCard extends JPanel implements ICard {
    protected  IMainForm mainForm;
    
    public BaseCard(){}
    
    @Override
    public IMainForm getMainForm() {
        return mainForm;
    }
    
    @Override
    public void setMainForm(IMainForm mainForm) {
        this.mainForm = mainForm;
    }

    @Override
   public void setResult(boolean status, String msg) {
        String title = status ? "Operazione Completata" : "Errore";
        JOptionPane.showMessageDialog(this, msg, title, status ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE);
    }
}
