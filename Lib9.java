import java.util.*;
public class Lib9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter");
        char a = sc.next().charAt(0);
        int n = (int)(a);
        int m = n;
        int rev = 0;
        while (m != 0) {
            int dig = m % 10;
            rev = rev * 10 + dig;
            m = m / 10;
        }
        System.out.println((char)(rev));
    }
}