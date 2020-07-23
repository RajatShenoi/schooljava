import java.util.*;
public class Arr13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double a[] = new double[10];
        int b[] = new int[10];
        int c[] = new int[10];
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextDouble();
            b[i] = (int)(a[i]);
            c[i] = (int)((a[i] * 100) % 100);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println((int)b[i]);
            System.out.println(c[i]);
        }
    }
}