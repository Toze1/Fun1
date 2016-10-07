/**
 * Created by Leitn on 06.10.2016.
 */
public class arrayszeilen {

    public static void main (String[] args) {

        int feld [][] = {{4,2,0,3},{4,1,3}};
        int i = 0;
        int zeile, spalte, summe = 0, summe2 = 0;

        for (zeile = 0; zeile < feld.length; zeile++) {
            for (spalte = 0; spalte < feld[zeile].length; spalte++) {

                summe = summe + feld[zeile][spalte];
                summe2 = summe2 + feld[zeile][spalte];

            }

            System.out.println("Zeile "+zeile+": " +summe);
            summe=0;

        }
        System.out.println("Gesamt: "+summe2);

    }
}
