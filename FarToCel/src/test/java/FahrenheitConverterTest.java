package test.java;

import main.java.FahrenheitConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FahrenheitConverterTest {

    @Test
    void toCelsius() {
        FahrenheitConverter converter = new FahrenheitConverter();
        int luku = converter.toCelsius(32);
        assertEquals(0, luku);
    }
}