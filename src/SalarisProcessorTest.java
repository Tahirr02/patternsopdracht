import static org.junit.jupiter.api.Assertions.*;

class SalarisProcessorTest {

    @org.junit.jupiter.api.Test
    void getMessage() {
        //IWerknemerFactory werknemerFactory = new WerknemerFactory();
        SalarisProcessor salarisProcessor = new SalarisProcessor("{ 'Name' : 'Tahir Balcik', " +
                "  'Uren' : '40', " +
                "  'Maand' : 'Februari', " +
                "  'Adres' : 'Teststraat 1a', " +
                "  'Uurloon' : '7.50' }");
        String bericht = salarisProcessor.getMessage(300);
        assertEquals("Tahir Balcik te Teststraat 1a met 40.0 uren heeft €300.0 euro verdiend in maand Februari.", bericht);
    }
}