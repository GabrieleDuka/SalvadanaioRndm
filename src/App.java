public class App {
    public static void main(String[] args) throws Exception { 
        Salvadanaio s = new Salvadanaio();

        Azione inserisciMonete = new Azione(s, true);
        Azione prelevaMonete = new Azione(s, false);

        inserisciMonete.start();
        inserisciMonete.run();
        inserisciMonete.join();

        prelevaMonete.start();
        prelevaMonete.run();
        prelevaMonete.join();
    
        System.out.println(Salvadanaio.monete);
    }
}
