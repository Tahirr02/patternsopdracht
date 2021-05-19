

public class Maandsalaris {
    private String maand;
    private double uren;
    private double uurloon;


    public Maandsalaris(String maand, double uurloon, double uren) {
        this.maand = maand;
        this.uren = uren;
        this.uurloon = uurloon;
    }
    public double berekenSalaris(){
        double salaris = uren * uurloon;
        return salaris;


    }
    public double getUren(){
        return uren;
    }
    public String getMaand(){
        return maand;
    }

}
