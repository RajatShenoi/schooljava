import java.util.*;
public class Lib5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n;
        do {
            n = sc.nextInt();
        } while (n >= 27 || n <= 0);
        System.out.println((char)(n + 65));
    }
}