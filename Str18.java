import java.util.*;
public class Str18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String a = sc.next();
        String s = a.toUpperCase();
        boolean isspecialword = false;
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            isspecialword = true;
        } else {
            System.out.println("Not a special word");
            System.exit(0);
        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {
                continue;
            } else {
                System.out.println("It is a Special Word");
                System.exit(0);
            }
        }
        System.out.println("It is a Palindrome");
    }
}