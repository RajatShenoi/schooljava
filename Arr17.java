import java.util.*;
public class Arr17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int N = sc.nextInt();
        int r[] = new int[N];
        String n[] = new String[N];
        int m1[] = new int[N];
        int m2[] = new int[N];
        int m3[] = new int[N];
        double avg[] = new double[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter child's name: ");
            n[i] = sc.next();
            System.out.print("Enter " + n[i] + "'s roll number: ");
            r[i] = sc.nextInt();
            System.out.print("Enter " + n[i] + "'s mark 1: ");
            m1[i] = sc.nextInt();
            System.out.print("Enter " + n[i] + "'s mark 2: ");
            m2[i] = sc.nextInt();
            System.out.print("Enter " + n[i] + "'s mark 3: ");
            m3[i] = sc.nextInt();
            avg[i] = (m1[i] + m2[i] + m3[i]) / 3;
        }
        for (int i = 0; i < N; i++) {
            if (avg[i] > 80 && avg[i] <= 100) {
                System.out.println(n[i] + "'s Grade is: A");
            } else if (avg[i] > 60 && avg[i] < 80) {
                System.out.println(n[i] + "'s Grade is: B");
            } else if (avg[i] > 40 && avg[i] < 60) {
                System.out.println(n[i] + "'s Grade is: C");
            } else if (avg[i] < 40) {
                System.out.println(n[i] + "'s Grade is: D");
            } else {
                System.out.println(n[i] + "'s Grade is: INVALID!");
            }
        }
    }
}