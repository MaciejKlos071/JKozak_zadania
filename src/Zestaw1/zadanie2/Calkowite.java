package Zestaw1.zadanie2;

import Zestaw1.Utils;

import java.util.Arrays;
import java.util.Scanner;

/* Wczytać od użytkownika 3 liczby całkowite i wypisać na ekran największą oraz
najmniejszą z nich.*/
public class Calkowite {
    public static void main(String[] args) {
        Utils utils = new Utils();
/*        int pierwsza = utils.podajLiczbe();
        int druga = utils.podajLiczbe();
        int trzecia = utils.podajLiczbe();*/
        int[] liczby = new int[]{utils.podajLiczbe(), utils.podajLiczbe(), utils.podajLiczbe()};
        System.out.println();
        for (int i = 0; i < liczby.length; i++) {
            if (liczby[i]> liczby){

            }

        }
    }

}
