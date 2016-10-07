/**
 * Created by Leitn on 06.10.2016.
 */
public class ArrayMinMax7 {
    public static void main (String[] args) {

        int[] liste = {50, 6, 5, 11, 35, 85, 318, 33, 48, 69, 88, 154, 87, 52, 2, 3, 17, 90, 40};
        int min, max;

        max = liste[0]; //MAX
        for (int i=0; i < liste.length; i++ )
            if (liste[i]>max)
                max = liste[i];

     System.out.println ("Max: "+max);

        min = liste[0]; //MIN
        for (int i=0; i < liste.length; i++ )
            if (liste[i]<min)
                min = liste[i];

        System.out.println ("Min: " +min);

        int c; //hlp
        for(int i=0; i<liste.length; i++) //SORT
            for (int j=0; j <liste.length-1;j++)
                if (liste[j]>liste[j+1]) {
                c = liste[j];
                liste[j] = liste[j+1];
                liste[j + 1] = c;
            }
            // AUSGABE
        for (int i = 0; i < liste.length;  i++)
            System.out.print(liste[i]+" ");
    }
}
