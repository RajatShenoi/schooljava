import java.util.*;
public class Arr18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N[][] = new int[4][4];
        int sume = 0;
        int sumo = 0;
        System.out.println("Enter the numbers in the matrix");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                N[i][j] = sc.nextInt();
                if (N[i][j] % 2 == 0) {
                    sume += N[i][j];
                } else {
                    sumo += N[i][j];
                }
            }
        }
        System.out.println("The sum of all even numbers are: " + sume);
        System.out.println("The sum of all the odd numbers are: " + sumo);
    }
}