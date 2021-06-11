public class SalarisProcessor implements ISalarisProcessor{
    private Werknemer werknemer;
    Displayer displayerInstance;
    public SalarisProcessor (String jsonString) {
        this.werknemer = (Werknemer)
                PersoonFactory.werknemerFactory.createPersoon(jsonString);
        displayerInstance = Displayer.getInstance();
    }
    public void bereken() {
        double salaris =
                this.werknemer.getLaatsteMaandsalaris()
                        .berekenSalaris();
        String bericht = getMessage(salaris);
        displayerInstance.display(bericht);
    }
    public String getMessage(double salaris)
    {
        String bericht = werknemer.getNaam() + " te " +
                werknemer.getAdres()+ " " + "met" + " " +
                werknemer.getLaatsteMaandsalaris()
                        .getUren() +
                " uren" + " " + "heeft " + "€" + salaris + " euro "+
                "verdiend " + "in maand " +
                werknemer.getLaatsteMaandsalaris()
                        .getMaand() + ".";
        return bericht;
    }
}