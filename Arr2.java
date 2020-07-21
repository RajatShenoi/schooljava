import java.util.*;
public class Arr2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 temperatures in farenheit");
        double f[] = new double[20];
        for (int i = 0; i < 20; i++) {
            f[i] = sc.nextInt();
        }
        double c[] = new double[20];
        for (int i = 0; i < 20; i++) {
            c[i] = (5 * (f[i] - 32)) / 9;
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(f[i] + " in celcius is " + c[i]);
        }
    }
}