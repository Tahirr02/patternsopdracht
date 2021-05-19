import static org.junit.jupiter.api.Assertions.*;

class SalarisProcessorTest {

    @org.junit.jupiter.api.Test
    void getMessage() {
        SalarisProcessor salarisProcessor = new SalarisProcessor("{ 'Name' : 'Tahir Balcik', " +
                "  'Uren' : '40', " +
                "  'Maand' : 'Februari', " +
                "  'Uurloon' : '7.50' }");
        String bericht = salarisProcessor.getMessage(300);
        assertEquals("Tahir Balcik met 40.0 uren heeft €300.0 euro verdiend in maand Februari.", bericht);
    }
}