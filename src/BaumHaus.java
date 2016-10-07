/**
 * Created by Leitn on 06.10.2016.
 */
public class BaumHaus {
    public static void main (String[] args) {

            char feld1 [] = {'B','a','u','m'};
            char feld2 [] = {'h','a','u','s'};
            char [] feld3 = new char[feld1.length+feld2.length];
           int i;

        for( i=0; i < feld1.length; i++)
            feld3[i] = feld1[i];

        for( int j=4; j < feld3.length; j++)
                feld3[j] = feld2[j-feld2.length];

        for (i = 0; i < feld3.length;  i++)

            System.out.print(feld3[i]);

        }

}

