/**
 * Created by Leitn on 07.10.2016.
 */
import java.util.Scanner;

public class Videospiel {

    boolean alter;
    static int mindestalter;
    static int erscheinungsjahr;
    static int preis;
    static String name;
    static String publisher;
    static double geld;
    static Scanner in = new Scanner(System.in);

    public static boolean Alter(){

        if (mindestalter <= 18) {
            System.out.println("Sie sind zu jung und dürfen das Spiel nicht kaufen");
            System.exit(0);
        return false;}
        else System.out.println("Sie dürfen das Spiel kaufen");
        return true;
    }
    public static int jahr() {
        int jahre = 2016 - erscheinungsjahr;
                return jahre;
    }
    public static double Geld() {
        System.out.println("Das Spiel kostet: " +preis+ "\nBitte geben Sie das Geld: ");    //The Cashback isnt fully working
        geld = in.nextDouble();                                                             // Wenn der Benutzer zweimal zuwenig Geld gibt
        geld = preis - geld;                                                                // Its kinda bugged when the Customers pays two times less than needed!
        if (geld < 0) {
            geld = geld *-1; }
        else {System.out.println("Es fehlen "+geld+" Euro. Zahlen Sie mehr");
            geld = geld - in.nextInt();}
        if (geld < 0) {
            geld = geld *-1; }
        return geld;
    }
    public static boolean Videotheke() {
        System.out.println("Ist das Spiel in der Videotheke vorhanden?"); // Random Variable... If <5 Not in Videotheke, if >5 is in Videotheke

        int x = (int) (Math.random()*10);
        if (x<5) {
            System.out.println("Das Spiel ist nicht vorhanden");
            return false; }
        else System.out.println("Das Spiel ist vorhanden");
            return true;
        }

      public static void Ausgabe(){
          Alter();
          System.out.println("Das Spiel ist von "+publisher+" und bereits "+jahr()+" Jahre auf dem Markt.");
          System.out.println("Sie erhalten "+Geld()+" Euro zurück");
          Videotheke();

        }
        public static void main (String[] args) {

            Videospiel DarkSouls= new Videospiel();
            DarkSouls.name="Dark Souls";
            DarkSouls.publisher="Bandai Namco Games";
            DarkSouls.preis=20;
            DarkSouls.erscheinungsjahr=2011;

            System.out.println("Geben Sie ihr Alter ein");
            mindestalter = in.nextInt();

            Ausgabe();


        }
    }

