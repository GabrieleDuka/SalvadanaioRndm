public class Salvadanaio {
    static public int monete = 0;
    public void inserisci() {
        usa(true);
    }
    public void preleva() {
        usa(false);
    }
    private void usa(Boolean b) {
        if(b)
            monete--;
        else
            monete++;
    }
}
