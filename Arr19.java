import java.util.*;
public class Arr19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long s[][] = new long[5][6];
        for (int i = 0; i < 5; i++) {
            System.out.println("Store " + (i + 1) + " Sales");
            for (int j = 0; j < 6; j++) {
                System.out.print("Enter monthly sale of department " +
                    (j + 1) + ": ");
                s[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMonthly Sale by store: ");
        for (int i = 0; i < 5; i++) {
            long storeSale = 0;
            for (int j = 0; j < 6; j++) {
                storeSale += s[i][j];
            }
            System.out.println("Store " + (i + 1)
                + " Sales: " + storeSale);
        }

        System.out.println("\nMonthly Sale by Department: ");
        for (int i = 0; i < 6; i++) {
            long deptSale = 0;
            for (int j = 0; j < 5; j++) {
                deptSale += s[j][i];
            }
            System.out.println("Department " + (i + 1)
                + " Sales: " + deptSale);
        }
    }
}