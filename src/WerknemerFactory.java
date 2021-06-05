public class WerknemerFactory extends PersoonFactory {

    @Override
    public IPersoon createPersoon(String jsonString) {
        return new Werknemer(jsonString);
    }

}
