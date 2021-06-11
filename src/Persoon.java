public abstract class Persoon implements IPersoon {
    protected String naam;
    protected String adres;

    public String getNaam() {
        return this.naam;
    }

    public String getAdres() {
        return this.adres;
    }
}
