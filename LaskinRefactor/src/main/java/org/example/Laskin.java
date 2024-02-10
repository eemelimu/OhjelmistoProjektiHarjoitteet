package org.example;

public class Laskin {

    private int tulos;  	// Muuttuja tulokselle
    private boolean virta;  // Muuttuja laskimen virralle

    public void nollaa() {  // Nollaa tulosmuuttuja
        if (virta) tulos = 0;
    }

    public int annaTulos() {
        if (virta) return tulos;
        else throw new IllegalStateException("Laskin ei ole päällä");
    }

    public void lisaa(int n) {
        if (virta) tulos = tulos + n;
    }

    public void vahenna(int n) {
        if (virta) tulos = tulos - n;
    }

    public void kerro(int n) {
        if (virta) tulos = tulos * n;
    }

    public void jaa(int n) {
        if (virta) {
            if (n == 0) throw new ArithmeticException("Nollalla ei voi jakaa");
            tulos = tulos / n;
        }
    }

    public void nelio(int n) {
        if (virta) tulos = n * n;
    }

    public double neliojuuri(int n) {
        if (!virta) throw new IllegalStateException("Laskin ei ole päällä");
        if (n < 0) throw new ArithmeticException("Negatiiviselle luvulle ei voi laskea neliöjuurta");
        return Math.sqrt(n);
    }

    public void virtaON() {
        virta = true;
        tulos = 0;
    }

    public void virtaOFF() {
        virta = false;
    }
}
