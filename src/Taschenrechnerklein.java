/**
 * Created by Leitn on 06.10.2016.
 */
import java.util.Scanner;

public class Taschenrechnerklein {
    static Scanner in = new Scanner(System.in);
    static char operator2 = ' ';

    public static void main(String[] args) {
        double ergebnis;
        int endoption;

        do {
            System.out.println("Hallo lieber Nutzer!1");
            System.out.println("Bitte 1. Zahl eingeben: ");
            int x = in.nextInt();
            System.out.println("Bitte 2. Zahl eingeben: ");
            int y = in.nextInt();
            System.out.println("Bitte Operator eingeben: ");
            String operator = in.next();

            ergebnis = calculate(x, y, operator);
            System.out.println("Ihr Ergebnis ist: " + ergebnis);

            System.out.println("Wollen Sie noch etwas rechnen?: JA = 1, NEIN = 2; ");
            endoption = in.nextInt();
        } while (endoption == 1);
    }

    public static double calculate(int a, int b, String x) {
        double e = 0;
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
                System.out.print("FEHLER"); }

                return e;
        }
    }
