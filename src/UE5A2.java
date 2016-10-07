/**
 * Created by Leitn on 07.10.2016.
 */

import java.util.Scanner;

public class UE5A2 {

    static Scanner in = new Scanner(System.in);

    public static void main (String[] args) {

        int alter;
        System.out.println("Geben Sie ein alter ein: ");
        alter = in.nextInt();

        if (Wahlrecht(alter) == true) {
            System.out.println("Sie haben ein Wahlrecht");}
        else{
            System.out.println("Sie haben kein Wahlrecht");
            System.out.println("Sie müssen " +Warten(alter)+" Jahre warten");}

    }

    public static boolean Wahlrecht(int y) {
        boolean x;
        if (y < 18)
            x= false;
        else
            x=true;
        return x;
    }
    public static int Warten(int x) {
        int y = 18;
        x = y - x;
        return x;
    }

}
