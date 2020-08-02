import java.util.*;
public class Str15 {
    public static boolean hN(long number) {
        int sum = 0;
        while (number != 0) {
            long dig = number % 10;
            sum += Math.pow(dig, 2);
            number = number / 10;
        }
        if (sum == 4) {
            return false;
        } else if (sum == 1) {
            return true;
        } else {
            return hN(sum);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.next();
        word = word.toUpperCase();
        String wordValueStr = "";
        int len = word.length();
        for (int i = 0; i < len; i++) {
            wordValueStr += String.valueOf(word.charAt(i) - 64);
        }
        long wordValue = Long.parseLong(wordValueStr);
        boolean isHappy = hN(wordValue);
        if (isHappy) {
            System.out.println("Happy number");
        } else {
            System.out.println("Not a happy number");
        }
    }
}