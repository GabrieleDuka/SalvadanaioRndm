public class Azione extends Thread{
    private Salvadanaio salvadanaio;
    private Boolean usa;
    
    public Azione(Salvadanaio s, Boolean b) {
        salvadanaio = s;
        usa = b;
    }

    public void run() {
        if(usa) {
            for(int i = 0; i < 1000; i++) {
                salvadanaio.inserisci();
            }
        }
        else {
            for(int i = 0; i < 1000; i++) {
                salvadanaio.preleva();
            }
        }
    }
}
