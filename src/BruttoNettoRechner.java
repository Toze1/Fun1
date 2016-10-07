/**
 * Created by Leitn on 04.10.2016.
 */
import java.io.*;
import java.util.Scanner;

public class BruttoNettoRechner {
        public static void main (String[] args )throws IOException {

            int ust, brutto;
            System.out.print("Betrag: ");
            Scanner sc = new Scanner(System.in);
            int n =  sc.nextInt();

            if (n<=0)
                System.out.print("Bitte einen größeren Betrag eingeben");
            else {
                ust = n*20/100;
                brutto = n+ust;

                System.out.println("Brutto:"+brutto);
                System.out.println("UST:"+ust);
            }
        }

}
