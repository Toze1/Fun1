/**
 * Created by Leitn on 05.10.2016.
 */
import java.util.Scanner;
public class Taschenrechner {
    static Scanner in = new Scanner(System.in);
    static String fehlermeldung = "Ungültiger Operator!";
    static int zahl1 = 0, zahl2 = 0;
    static String operator = "";
    static String verabschiedung = "Danke fürs Benutzen! :)";
    static int menueoption = 0;
    static boolean kleinerals = false;
    static String begruessung = "Hallo lieber Nutzer!";
    static boolean fehler = false;
    static double ergebnis = 0;
    static char operator2 = ' ';

    public static void main(String[] args) {
        System.out.println(begruessung);
        do {
            System.out.println("Bitte 1. Zahl eingeben: ");
            zahl1 = in.nextInt();
            System.out.println("Bitte 2. Zahl eingeben: ");
            zahl2 = in.nextInt();
            System.out.println("Bitte Operator eingeben: ");
            operator = in.next();
            if (zahl1 < zahl2) {
                kleinerals = true;
            }
            ergebnis = calculate(zahl1, zahl2, operator, kleinerals);
            if (fehler) {
                System.out.println(fehlermeldung);
                fehler = false;
            } else {
                System.out.println("Ihr Ergebnis ist: " + ergebnis);
            }
            System.out.println("Noch etwas rechnen? Ja = 1, Nein = 2");
            menueoption = in.nextInt();
        } while (menueoption == 1);
        System.out.println(verabschiedung);
    }

    public static double calculate (int a, int b, String x, boolean zahl) {
        double e = 0;
        if (zahl) {
            e = a;
            a = b;
            b = (int) e;
            e = 0;
            operator2 = x.charAt(0);
            switch (operator2) {
                case '+':
                    e = a + b;
                    break;
                case '-':
                    e = a - b;
                    break;
                case '*':
                    e = a * b;
                    break;
                case '/':
                    e = a / b;
                    break;
                case ':':
                    e = a / b;
                    break;
                default:
                    fehler = true;
            }
        }
        return e;
    }
}
