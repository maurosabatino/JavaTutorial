package Esempio0;

/**
 * Created by Mauro on 20/04/2015.
 */
public class While_For {
    public static void main(String[]args){
        int num = 15;
        System.out.println("ecco il ciclo while");
        while(num>=0) {
            System.out.println("il numero ora : " + num--);
            // più chiaro se fosse numm--;
        }
        System.out.println("ecco il ciclo for");
        for(num=15;num>=0;num--){
            System.out.println("il numero ora : " + num);
        }
    }
}
