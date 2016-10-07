/**
 * Created by Leitn on 06.10.2016.
 */

import java.util.Scanner;
    public class binaersuchenit {
        public static void main(String[] args) {

            int[] liste = {2, 3, 5, 6, 9, 10, 14, 16, 17, 19, 20, 22, 25, 30, 32, 35, 36, 37, 40};
            int suchen, e;

            System.out.print("Welches Element möchtest du suchen?: ");
            Scanner sc = new Scanner(System.in);
            suchen = sc.nextInt();

            e = binaerSuchenIterativ(liste, suchen, 0, liste.length - 1);
            if (e == 1) {
                System.out.print("Nicht gefunden");
            } else {
                System.out.print("Position des Elementens startet bei (0)" +e);
            }

        }

        public static int binaerSuchenIterativ(int[] liste, int suchen, int first, int last) {
            boolean found = false;
            int m = -1;

            while (first <= last && found == false) {
                m = (first + last) / 2;

                if (suchen == liste[m]) {
                    found = true;
                } else if (suchen < liste[m]) {
                    last = m - 1;
                } else {
                    first = m + 1;
                }
                if (!found) {
                    m = 1;
                }
            }
            return m;
        }
    }


