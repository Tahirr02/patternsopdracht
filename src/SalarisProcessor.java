public class SalarisProcessor {

    private Werknemer werknemer;


    public SalarisProcessor (String jsonString) {
        this.werknemer = new Werknemer (jsonString);

    }



    public void bereken() {

        double salaris = this.werknemer.getMaandsalaris().berekenSalaris();
        String bericht =  werknemer.getNaam() + "met" + werknemer.getUurloon() + "heeft " + salaris + "verdiend";
        Displayer.display(bericht);
    }
}
