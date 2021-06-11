public class Main {
    public static void main(String[] args) {
        Urenreceiver urenReceiver = new Urenreceiver();
        ISalarisProcessor salarisProcessor = new SalarisProcessor(
                "{ 'Name' : 'Sevim Balcik', " +
                        " 'Uren' : '40', " +
                        " 'Adres' : 'Teststraat 1a', " +
                        " 'Maand' : 'Februari', " +
                        " 'Uurloon' : '7.50' }");
        urenReceiver.displaySalaris(salarisProcessor);
    }
}