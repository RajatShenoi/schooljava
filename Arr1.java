import java.util.*;
public class Arr1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 numbers");
        int sumo = 0;
        int sume = 0;
        int a[] = new int[20];
        for (int i = 0; i < 20; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) {
                sume += a[i];
            } else {
                sumo += a[i];
            }
        }
        System.out.println("The sum of even numbers are " + sume);
        System.out.println("The sum of odd numbers are " + sumo);
    }
}