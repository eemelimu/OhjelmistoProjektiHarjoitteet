package test.java;

import main.java.kelvinToCel;
import static org.junit.Assert.*;

public class kelvinToCelTest {

    @org.junit.Test
    public void kelvintoCel() {
        kelvinToCel converter = new kelvinToCel();
        float luku = converter.kelvintoCel(273.15f);
        assertEquals(0, luku, 0.1);
    }
}