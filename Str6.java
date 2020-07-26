import java.util.Scanner;

public class Str6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = in.nextLine();

        int len = word.length();

        for (int i = 0; i < len; i++) {
            char ch = word.charAt(i);
            System.out.println("ASCII of " + ch
                               + " = " + (int)ch);
        }
    }
}