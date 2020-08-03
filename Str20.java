import java.util.*;
public class Str20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = sc.next();
        System.out.print("Enter an option (a, b, c): ");
        char o = sc.next().charAt(0);
        switch (o) {
            case 'a':
                for (int i = 0; i < s.length(); i++) {
                    for (int j = 0; j < s.length() - i; j++) {
                        char c = s.charAt(j);
                        System.out.print(c);
                    }
                    System.out.println();
                }
                break;
            case 'b':
                for (int i = s.length() - 1; i >= 0; i--) {
                    for (int j = s.length() - 1; j >= i; j--) {
                        char ch = s.charAt(i);
                        System.out.print(ch);
                    }
                    System.out.println();
                }
                break;
            case 'c':
                for (int i = 0; i < s.length(); i++) {
                    for (int j = i; j < s.length(); j++) {
                        char ch = s.charAt(j);
                        System.out.print(ch);
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("ERROR, INVALID OPTION");
        }
    }
}