/**
 * Created by Leitn on 04.10.2016.
 */
import java.io.*;
import java.util.Scanner;

public class RLN {
    static Scanner in = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.print("R: ");
        int r = in.nextInt();
        System.out.print("L: ");
        int l = in.nextInt();
        System.out.print("N: ");
        int n = in.nextInt();
        int m = 0;


        System.out.println();

        for(int i=n; i <= r; i++ ) {
            m = m + i;

        }
        System.out.print("Summe der Zahlen zw. R und N: "+m);
    }
}
