public class App {
    public static void main(String[] args) throws Exception { 
        Salvadanaio s = new Salvadanaio();

        Azione inserisciMonete = new Azione(s, true);
        Azione prelevaMonete = new Azione(s, false);

        inserisciMonete.start();
        prelevaMonete.start();
        
        inserisciMonete.join();
        prelevaMonete.join();
    
        System.out.println(Salvadanaio.monete);
    }
}
