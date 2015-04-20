package calcolatrice;

import javax.swing.*;

/**
 * Created by Mauro on 20/04/2015.
 */
public class Calcolatrice {
    public static void main(String[] args){
        CalcolatriceFinestra calcolatriceFinestra = new CalcolatriceFinestra("Calcolatrice");
        calcolatriceFinestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcolatriceFinestra.setSize(300,300);
        calcolatriceFinestra.setVisible(true);
    }
}
