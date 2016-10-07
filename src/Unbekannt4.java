import java.util.Scanner;


public class Unbekannt4 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("N");
        int n = in.nextInt();
        int F = 0;
        int f = 0;
        int i = 1;

        while (i < n) {
            f = i * (n - i);
                if (f>F) {
                    F = f;
                }
              i = i + 1;

        }
        System.out.print(f);
    }

}
