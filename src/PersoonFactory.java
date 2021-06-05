public abstract class PersoonFactory {



    public static final WerknemerFactory werknemerFactory = new WerknemerFactory();
    //public static final SenderFactoryTrouw TROUW = new SenderFactoryTrouw ();


    public abstract IPersoon createPersoon (String jsonString);
}
