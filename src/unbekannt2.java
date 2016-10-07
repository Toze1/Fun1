import java.util.Scanner;

/**
 * Created by Leitn on 04.10.2016.
 */
public class unbekannt2 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 0;
        int x = in.nextInt();
        int b;

        while (x > 1) {
            x = x / 2;
            n = n + 1;

        }
        System.out.print(n);
    }

}
