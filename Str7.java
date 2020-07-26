import java.util.*;
public class Str7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word or a sentence");
        String s = sc.nextLine();
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i'
                || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
                System.out.print("*");
            } else {
                System.out.print(c);
            }
        }
        System.out.println();
    }
}