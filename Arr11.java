import java.util.*;
public class Arr11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
        for (int i = 0; i < 20; i++) {
            a[i] = sc.nextInt();
        }
        for (int i : a) {
            for (int j = 0; j < 20; j++) {
                if (((j + 1) * (j + 1)) == i) {
                    System.out.print(i + ", ");
                }
            }
        }
        System.out.println("\b\b");
    }
}