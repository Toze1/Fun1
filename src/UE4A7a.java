/**
 * Created by Leitn on 07.10.2016.
 */
public class UE4A7a {

    public static void main (String[] args) {

        int[][] liste = {{0,0,0,0,0,0},{0,0,0,0,0,0}};

        System.out.println("Das zweidimensionale Array sieht wie folgt aus");

        for (int i = 0; i < 6; i++) {
            liste[0][i] = i;
        }
        for (int i = 0; i < 6; i++) {
            liste[1][i] = i+1; }

        for (int i = 0; i < 6;  i++) {
            System.out.print(liste[0][i]+" "); }// Ausgabe Zeile 0

            System.out.println();

        for (int i = 0; i < 6;  i++) {// Ausgabe Zeile 1
            System.out.print(liste[1][i]+" ");}
    }
}
