package org.example;

import org.example.laskin.Laskin;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
 
// Tässä käytetään ParameterizedTest -annotaatiota
// Parametriparit taulukossa (comma separated values)
 
public class NelioTest {

	private static Laskin laskin = new Laskin();
	private final double DELTA = 0.001;

	@BeforeAll
	public static void setupVirta() {
		laskin.virtaON();
	}

	@ParameterizedTest (name="Luvun {0} neliö on {1}")
	@CsvSource({ "0, 0", "1, 1", "2, 4", "4, 16", "5, 25", "6, 36" })
	public void testNelio(int luku,  int tulos) {
		laskin.nelio(luku);
		assertEquals(tulos, laskin.annaTulos(), "Neliöön korotus ei nyt kyllä skulaa");
	}
}
