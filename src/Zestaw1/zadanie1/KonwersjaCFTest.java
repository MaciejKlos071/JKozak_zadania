package Zestaw1.zadanie1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class KonwersjaCFTest {
    public static void main(String[] args) {
        KonwersjaCF konwersjaCF = new KonwersjaCF(20 , "f");
        double Wynik = konwersjaCF.konwersjaA_B();
        System.out.println(Wynik);
    }
}
