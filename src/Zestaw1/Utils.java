package Zestaw1;

import java.util.Scanner;

public class Utils {
    private final Scanner scanner = new Scanner(System.in);



    public int podajLiczbe(){
        System.out.println("Podaj liczbę całkowitą");
        return scanner.nextInt();
    }

}
