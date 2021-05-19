

public class Maandsalaris {
    private String maand;
    private double totaalUren;
    private double uurloon;


    public Maandsalaris(String maand, double uurloon, double totaalUren) {
        this.maand = maand;
        this.totaalUren = totaalUren;
        this.uurloon = uurloon;
    }
    public double berekenSalaris(){
        double salaris = totaalUren * uurloon;
        return salaris;


    }

}
