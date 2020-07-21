import java.util.*;
public class Arr4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 numbers");
        int a[] = new int[20];
        for (int i = 0; i < 20; i++) {
            a[i] = sc.nextInt();
        }
        int pv[] = new int[20];
        for (int i = 0; i < 20; i++) {
            for (int j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    pv[i]++;
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            if (pv[i] == 2) {
                System.out.print(a[i] + ", ");
            }
        }
    }
}