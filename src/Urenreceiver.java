public class Urenreceiver {


    public void berekenSalaris(String jsonString) {
        SalarisProcessor salarisProcessor = new SalarisProcessor(jsonString);
        salarisProcessor.bereken();
    }
}
