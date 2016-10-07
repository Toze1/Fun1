/**
 * Created by Leitn on 07.10.2016.
 */

import java.util.Scanner;

public class UE5A3 {
    static Scanner in = new Scanner(System.in);

    public static void main (String[] args) {

        System.out.print("1. Reihe: ");
        int stern1 = in.nextInt();
        System.out.print("2. Reihe: ");
        int stern2 = in.nextInt();
        System.out.print("3. Reihe: ");
        int stern3 = in.nextInt();

        Sterne(stern1, stern2, stern3);
    }

    public static  void Sterne (int x, int y, int z) {

        for (int i = 0; i < x; i++) {
        System.out.print("*");}

        System.out.println();

        for (int i = 0; i < y; i++) {
            System.out.print("*");}

        System.out.println();

        for (int i = 0; i < z; i++) {
            System.out.print("*");}
    }

}

