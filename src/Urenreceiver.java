public class Urenreceiver {


    public void displaySalaris(String jsonString) {
        //IWerknemerFactory werknemerFactory = new WerknemerFactory();
        SalarisProcessor salarisProcessor = new SalarisProcessor(jsonString);
        salarisProcessor.bereken();
    }
}
