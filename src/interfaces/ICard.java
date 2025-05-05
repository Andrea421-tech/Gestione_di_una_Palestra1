package interfaces;

public interface ICard {
    void setMainForm(IMainForm mainForm);
    IMainForm getMainForm();
    void setResult(boolean status, String msg);
}
