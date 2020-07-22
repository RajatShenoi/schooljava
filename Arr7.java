import java.util.*;
public class Arr7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name[] = new String[100];
        int roll[] = new int[100];
        double sub1[] = new double[100];
        double sub2[] = new double[100];
        double sub3[] = new double[100];
        double sub4[] = new double[100];
        double sub5[] = new double[100];
        double sub6[] = new double[100];
        double per[] = new double[100];
        for (int i = 0; i < 100; i++) {
            System.out.print("Enter students name: ");
            name[i] = sc.next();
            System.out.print("Enter " + name[i] + "'s Roll Number: ");
            roll[i] = sc.nextInt();
            System.out.print("Enter " + name[i] + "'s Marks in subject 1: ");
            sub1[i] = sc.nextDouble();
            System.out.print("Enter " + name[i] + "'s Marks in subject 2: ");
            sub2[i] = sc.nextDouble();
            System.out.print("Enter " + name[i] + "'s Marks in subject 3: ");
            sub3[i] = sc.nextDouble();
            System.out.print("Enter " + name[i] + "'s Marks in subject 4: ");
            sub4[i] = sc.nextDouble();
            System.out.print("Enter " + name[i] + "'s Marks in subject 5: ");
            sub5[i] = sc.nextDouble();
            System.out.print("Enter " + name[i] + "'s Marks in subject 6: ");
            sub6[i] = sc.nextDouble();
        }
        for (int i = 0; i < 100; i++) {
            per[i] = ((sub1[i] + sub2[i] + sub3[i] + sub4[i] + sub5[i] + sub6[i]) / 600) * 100;
            if (per[i] > 80 && per[i] <= 100) {
                System.out.println(name[i] + "'s Grade is: A");
            } else if (per[i] > 60 && per[i] < 80) {
                System.out.println(name[i] + "'s Grade is: B");
            } else if (per[i] > 40 && per[i] < 60) {
                System.out.println(name[i] + "'s Grade is: C");
            } else if (per[i] < 40) {
                System.out.println(name[i] + "'s Grade is: D");
            } else {
                System.out.println(name[i] + "'s Grade is: INVALID!");
            }
        }
    }
}