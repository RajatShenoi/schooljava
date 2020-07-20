import java.util.*;
public class Lib7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integer numbers");
        int sum = 0;
        int prod = 1;
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            sum += n;
            prod *= n;
        }
        String sums = Integer.toString(sum);
        String prods = Integer.toString(prod);
        System.out.println(sums + prods);
    }
}