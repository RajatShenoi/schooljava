import java.util.*;
public class Str1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String s = sc.nextLine();
        int words = 1;
        int letter = 0;
        char c = ' ';
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == ' ') {
                words++;
            } else {
                letter++;
            }
        }
        if (letter == 0) {
            words = 0;
        }
        System.out.println("The number of words are: " + words);
        System.out.println("The number of letters are: " + letter);
    }
}