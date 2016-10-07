import java.util.Scanner;

public class QuadratWurzel {
    static Scanner in = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.println("a: ");
        int a = in.nextInt();
        System.out.println("b: ");
        int b = in.nextInt();
        System.out.println("c: ");
        int c = in.nextInt(); // Zu lösen: ax² + bx + c

        double x1, x2;

        x1 = ((-b)+ Math.sqrt((b*b)-(4*a*c)))/(2*a);
        x2 = ((-b)- Math.sqrt((b*b)-(4*a*c)))/(2*a);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
