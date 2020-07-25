import java.util.*;
public class Str3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String s = sc.nextLine();
        char c;
        System.out.print(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == ' ') {
                System.out.print(s.charAt(i + 1) + " ");
            }
        }
    }
}