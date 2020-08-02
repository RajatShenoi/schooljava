import java.util.*;
public class Str16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or a sentence: ");
        String s = sc.nextLine();
        String ss = s.toUpperCase();
        System.out.println("Character\tFrequency");
        int letters[] = new int[26];
        for (int i = 0; i < ss.length(); i++) {
            char ch = ss.charAt(i);
            if (Character.isLetter(ch)) {
                letters[ch - 65]++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (letters[i] == 0) {
                continue;
            } else {
                System.out.println("Character " + (char)(i + 65) + " has a frequency of " + letters[i]);
            }
        }
    }
}