public abstract class PersoonFactory {

    public static final WerknemerFactory werknemerFactory = new WerknemerFactory();

    public abstract IPersoon createPersoon (String jsonString);
}
