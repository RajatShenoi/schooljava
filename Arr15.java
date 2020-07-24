import java.util.*;
public class Arr15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int P[] = new int[6];
        int Q[] = new int[4];
        int R[] = new int[10];
        System.out.println("Enter the elements of array P");
        for (int i = 0; i < 6; i++) {
            P[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of array Q");
        for (int i = 0; i < 4; i++) {
            Q[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (i < 6) {
                R[i] = P[i];
            } else {
                R[i] = Q[i - 6];
            }
            if (i < 9) {
                System.out.print(R[i] + ", ");
            } else {
                System.out.print(R[i] + "\n");
            }
        }
    }
}