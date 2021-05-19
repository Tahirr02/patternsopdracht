import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaandsalarisTest {

    @Test
    void berekenSalaris() {
        Maandsalaris maandsalaris = new Maandsalaris("April", 8.50, 50);
        double salaris = maandsalaris.berekenSalaris();
        assertEquals(425.0, salaris);
    }
}