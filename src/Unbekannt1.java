/**
 * Created by Leitn on 04.10.2016.
 */
import java.util.Scanner;

public class Unbekannt1 {

    static Scanner in = new Scanner(System.in);

    public static void main (String[] args) {
        int y = 1;
        int x = in.nextInt();
        int b;

        while(x>1) {
            y = y + x;
            x = x - 1;

        }
        System.out.print(y);


    }
}
