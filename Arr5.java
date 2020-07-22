import java.util.*;
public class Arr5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int N = sc.nextInt();
        String name[] = new String[N];
        double totalmarks[] = new double[N];
        double sum = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Enter students name!");
            name[i] = sc.next();
            System.out.println("Enter students totalmarks!");
            totalmarks[i] = sc.nextInt();
            sum += totalmarks[i];
        }
        double avg = sum / N;
        double dev[] = new double[N];
        for (int i = 0; i < N; i++) {
            dev[i] = totalmarks[i] - avg;
            System.out.println("The deviation of " + name[i] + " is " + dev[i]);
        }
    }
}