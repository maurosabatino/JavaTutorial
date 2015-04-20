package Esempio0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Mauro on 20/04/2015.
 */
public class PrintConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("if you want to stop, write stop");
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader myInput = new BufferedReader(reader);
        String str = new String();
        while (!str.equals("stop")) {
            try {
                str = myInput.readLine();
            } catch (IOException e) {
                System.out.println("Si è verificato un errore: " + e);
                System.exit(-1);
            }
            System.out.println("yuu write: " + str);
        }
    }

}
