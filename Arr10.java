import java.util.*;
public class Arr10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[20];
        System.out.println("Enter the 20 numbers");
        for (int i = 0; i < 20; i++) {
            n[i] = sc.nextInt();
        }
        int odd[] = new int[20];
        int even[] = new int[20];
        for (int i = 0; i < 20; i++) {
            if (n[i] % 2 == 0) {
                even[i] = n[i];
            } else {
                odd[i] = n[i];
            }
        }
        System.out.print("The even numbers are: ");
        for (int i = 0; i < 20; i++) {
            if (even[i] != 0) {
                System.out.print(n[i] + ", ");
            }
        }
        System.out.println();
        System.out.print("The odd numbers are: ");
        for (int i = 0; i < 20; i++) {
            if (odd[i] != 0) {
                System.out.print(n[i] + ", ");
            }
        }
    }
}