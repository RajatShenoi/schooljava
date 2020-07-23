import java.util.*;
public class Arr12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int p[] = new int[40];
        int c[] = new int[40];
        int m[] = new int[40];
        int roll[] = new int[40];
        int check[] = new int[40];
        System.out.println("Enter the roll number and the marks in physics chemistry and maths");
        for (int i = 0; i < 40; i++) {
            check[i] = 0;
        }
        for (int i = 0; i < 40; i++) {
            System.out.print("Enter child " + ((i + 1)) + "'s Roll number: ");
            roll[i] = sc.nextInt();
            System.out.print("Enter child " + (i + 1) + "'s marks in Physics: ");
            p[i] = sc.nextInt();
            System.out.print("Enter child " + (i + 1) + "'s marks in Chemistry: ");
            c[i] = sc.nextInt();
            System.out.print("Enter child " + (i + 1) + "'s marks in Mathematics: ");
            m[i] = sc.nextInt();
            if (p[i] > 35) {
                check[i]++;
            }
            if (c[i] > 35) {
                check[i]++;
            }
            if (m[i] > 35) {
                check[i]++;
            }
        }
        for (int i = 0; i < 20; i++) {
            if (check[i] >= 2) {
                System.out.println("Roll number: " + roll[i] + " Status: " + "Promotion is Granted");
            } else {
                System.out.println("Roll number: " + roll[i] + " Status: " + "Promotion is not Granted");
            }
        }
    }
}