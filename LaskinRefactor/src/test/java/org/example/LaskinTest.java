package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;


public class LaskinTest {
    private static Laskin laskin = new Laskin();
    private final double DELTA = 0.001;

    @BeforeAll
    public static void setupVirta() {
        laskin.virtaON();
    }

    @BeforeEach
    public void clearCalculator() {
        laskin.nollaa();
    }

    @AfterAll
    public static void turnOffVirta() {
        laskin.virtaOFF();
    }

    @Test
    @DisplayName("Testaa nollaus")
    public void testLisaa() {
        laskin.lisaa(1);
        laskin.lisaa(2);
        assertEquals(3, laskin.annaTulos(), "Lukujen 1 ja 2 summa väärin");
    }

    @Test
    @DisplayName("Testaa vähennyslasku")
    public void testVahenna() {
        laskin.lisaa(10);
        laskin.vahenna(2);
        assertEquals(8, laskin.annaTulos(), "Lukujen 10 ja 2 erotus väärin");
    }

    @Test
    @DisplayName("Testaa neliö")
    public void testNelio() {
        laskin.nelio(5);
        assertEquals(25, laskin.annaTulos(), "Luvun 5 neliö väärin");
    }

    @Test
    @DisplayName("Testaa neliöjuuri")
    public void testNeliojuuri() {
        assertEquals(5, laskin.neliojuuri(25), DELTA, "Luvun 25 neliöjuuri väärin");
    }

    @Test
    @DisplayName("Testaa jakolasku 8 / 2")
    public void testJaa() {
        laskin.lisaa(8);
        laskin.jaa(2);
        assertEquals(4, laskin.annaTulos(), "Jakolasku 8/2 väärin");
    }

    @Test
    @DisplayName("Testaa nollallajako")
    public void testJaaNollalla() {
        ArithmeticException poikkeus = assertThrows(ArithmeticException.class, () -> laskin.jaa(0));
        assertEquals("Nollalla ei voi jakaa", poikkeus.getMessage());
    }

    @Test
    @DisplayName("Testaa kertolasku")
    public void testKerro() {
        laskin.lisaa(5);
        laskin.kerro(3);
        assertEquals(15, laskin.annaTulos(), "Lukujen 5 ja 3 tulo väärin");
    }
}
