import java.util.*;
public class Arr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalmarks[] = new double[50];
        double sum = 0;
        double highest = 0;
        int index = 0;
        String name[] = new String[50];
        for (int i = 0; i < 50; i++) {
            System.out.println("Enter students name: ");
            name[i] = sc.next();
            System.out.println("Enter students marks: ");
            totalmarks[i] = sc.nextInt();
            sum += totalmarks[i];
            if (totalmarks[i] > highest) {
                highest = totalmarks[i];
                index = i;
            }
        }
        double average = sum / 50;
        System.out.println("The subject average marks are: " + average);
        System.out.println("The highest marks obtained are: " + highest + " Scored by " + name[index]);
    }
}