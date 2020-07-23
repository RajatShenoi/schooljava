import java.util.*;
public class Arr8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
        System.out.println("Enter 20 numbers");
        for (int i = 0; i < 20; i++) {
            a[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("The first 10 numbers in ascending order are: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        for (int i = 10; i < 20; i++) {
            for (int j = 10; j < 20 - 1; j++) {
                if (a[j] < a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("The next 10 numbers in descending order are: ");
        for (int i = 10; i < 20; i++) {
            System.out.print(a[i] + ", ");
        }
    }
}