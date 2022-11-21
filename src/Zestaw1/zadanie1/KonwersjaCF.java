package Zestaw1.zadanie1;

import java.util.HashSet;
import java.util.Set;

public class KonwersjaCF {
    public double basicValue;
    public String basicUnit;

    public KonwersjaCF(double liczba, String basicUnit) {
        this.basicValue = liczba;
        this.basicUnit = basicUnit.toLowerCase();

    }

    double konwersjaA_B()
        {

            Double wynik;
            wynik = null;
            if (basicUnit.startsWith("f")) {
                System.out.println("Przeliczanie Farenhait na Celsjusze.");
                System.out.println("Wynik: " + FarenhaitNaCeljusz());
                wynik = FarenhaitNaCeljusz();
            } else if (basicUnit.startsWith("c")) {
                System.out.println("Przeliczanie Celsjusze na Farenhait.");
                System.out.println("Wynik: " + CeljuszNaFarenhait());
                wynik = CeljuszNaFarenhait();

            } else {
                System.out.println("Błędne dane jednostki");
                return wynik;
            }
        return wynik;
    }

    private double FarenhaitNaCeljusz(){
        final double przelicznik = 1.8;
        double wynik = (basicValue-32)*5/9;
        return wynik ;
    }
    private double CeljuszNaFarenhait(){
        final double przelicznik = 9/5;
        double wynik = (basicValue*przelicznik)+32;
        return wynik ;
    }

}
