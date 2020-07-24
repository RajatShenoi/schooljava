import java.util.*;
public class Arr20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String M[][] = new String[5][10];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the details for the people in floor " + (i + 1));
            for (int j = 0; j < 10; j++) {
                System.out.print("Guest in room " + (j + 1) + ": ");
                M[i][j] = sc.nextLine();
            }
        }
        System.out.println("Enter the name of the person");
        String check = sc.nextLine();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (M[i][j].equals(check)) {
                    System.out.println("The guest is in Floor: " + (i + 1) + " and in Room: " + (j + 1));
                    System.exit(0);
                }
            }
        }
        System.out.println("Not found!");
    }
}