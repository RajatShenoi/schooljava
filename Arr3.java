import java.util.*;
public class Arr3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int a[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (a[i] < 0) {
                System.out.print(a[i] + ", ");
            }
        }
        for (int i = 0; i < 10; i++) {
            if (a[i] > 0) {
                System.out.print(a[i] + ", ");
            }
        }
        System.out.println("\n");
    }
}