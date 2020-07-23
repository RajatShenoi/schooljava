import java.util.*;
public class Arr9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m1[] = new int[40];
        int m2[] = new int[40];
        int m3[] = new int[40];
        double avg[] = new double[40];
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        for (int i = 0; i < 40; i++) {
            System.out.print("Marks of student " + i + " in English: ");
            m1[i] = sc.nextInt();
            System.out.print("Marks of student " + i + " in Mathematics: ");
            m2[i] = sc.nextInt();
            System.out.print("Marks of student " + i + " in Science: ");
            m3[i] = sc.nextInt();
            avg[i] = (m1[i] + m2[i] + m3[i]) / 3.0;
            sum1 += m1[i];
            sum2 += m2[i];
            sum3 += m3[i];
            System.out.println("The average of student " + i + " is: " + avg[i]);
        }
        System.out.println("The average of class in English is " + sum1 / 40);
        System.out.println("The average of class in Mathematics is " + sum2 / 40);
        System.out.println("The average of class in Science is " + sum3 / 40);
    }
}