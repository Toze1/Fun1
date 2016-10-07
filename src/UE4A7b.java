/**
 * Created by Leitn on 07.10.2016.
 */
public class UE4A7b {

    public static void main (String[] args) {

        int feld [][] = {{9,9,9,9},{9,9,9,9},{9,9,9,9},{9,9,9,9}};
        int i = 0;
        int j = 0;

        System.out.println("Array vor der Änderung der Diagonalen: ");
        for (i = 0; i < 4;  i++) {
            System.out.print(feld[0][i]+" "); }// Ausgabe Zeile 0
        System.out.println();
        for (i = 0; i < 4;  i++) {// Ausgabe Zeile 1
            System.out.print(feld[1][i]+" ");}
        System.out.println();
        for (i = 0; i < 4;  i++) {// Ausgabe Zeile 2
            System.out.print(feld[1][i]+" ");}
        System.out.println();
        for (i = 0; i < 4;  i++) {// Ausgabe Zeile 3
            System.out.print(feld[1][i]+" ");}
        System.out.println();

        i = 0; j = 0;
                while (i<=3 && j<=3) {

                    feld[i][j] = 0;
                    i++;
                    j++;
                }

        System.out.println("Array nach der Änderung der Diagonalen: ");
        for (i = 0; i < 4;  i++) {
            System.out.print(feld[0][i]+" "); }// Ausgabe Zeile 0
        System.out.println();
        for (i = 0; i < 4;  i++) {// Ausgabe Zeile 1
            System.out.print(feld[1][i]+" ");}
        System.out.println();
        for (i = 0; i < 4;  i++) {// Ausgabe Zeile 2
            System.out.print(feld[2][i]+" ");}
        System.out.println();
        for (i = 0; i < 4;  i++) {// Ausgabe Zeile 3
            System.out.print(feld[3][i]+" ");}

    }
}
