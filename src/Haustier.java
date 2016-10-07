
import java.util.Scanner;

public class Haustier {

    static Scanner in = new Scanner(System.in);
    String name;
    String art;
    int alter;
    boolean lebenodernicht;
    boolean laut;

    static void makesound(boolean lautodernicht) {

        if (lautodernicht == true)
        System.out.println("Das Tier macht Laut");
        else System.out.println("Das tier macht keinen laut");

    }

    public void ausgabe() {
        System.out.println("Der Name ist "+name);
        System.out.println("Die Art ist "+art);
        System.out.println("Das Alter ist "+alter);
        System.out.println("Das Tier lebt oder nicht "+lebenodernicht);
        System.out.println("Das Tier macht Laut oder nicht "+laut);
    }
    static boolean geimpft(boolean inp) {
        if (inp ==false) {
            System.out.println("Bitte impfen");
            inp=true;}
        return inp;

    }

    public static void main (String[] args) {

        Haustier hund = new Haustier();
        hund.name ="Lesi";
        hund.alter = 12;
        hund.art = "Golden Retriever";
        hund.lebenodernicht =true;
        hund.laut = false;

        hund.ausgabe();
        hund.geimpft(false);
        System.out.println(hund.geimpft(false));
        hund.makesound(false);
    }
}
