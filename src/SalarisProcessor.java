public class SalarisProcessor {

    private Werknemer werknemer;
    Displayer displayerInstance;

    public SalarisProcessor (String jsonString) {
        this.werknemer = new Werknemer (jsonString);
        displayerInstance = Displayer.getInstance();
    }



    public void bereken() {

        double salaris = this.werknemer.getMaandsalaris().berekenSalaris();

        String bericht = getMessage(salaris);
        displayerInstance.display(bericht);
    }

    public String getMessage(double salaris){
        String bericht =  werknemer.getNaam() + " " + "met" + " " + werknemer.getMaandsalaris().getUren() + " uren" + " " + "heeft " + "€" + salaris + " euro "+ "verdiend " + "in maand " + werknemer.getMaandsalaris().getMaand() + ".";
        return bericht;
    }
}
