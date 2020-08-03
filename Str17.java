import java.util.*;
public class Str17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        s = s.toUpperCase();
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            char d = s.charAt(i + 1);
            if (c == d) {
                count++;
                i++;
            }
        }
        System.out.println("The number of double letter sequences are: " + count);
    }
}