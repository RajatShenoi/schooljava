import java.util.*;
public class Str13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String w = sc.next();
        boolean upper = true;
        String str = w.toLowerCase();
        String newStr = "=>";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.charAt(i) == 'a' ||
                str.charAt(i) == 'e' ||
                str.charAt(i) == 'i' ||
                str.charAt(i) == 'o' ||
                str.charAt(i) == 'u') {

                char nextChar = (char)(ch + 1);
                newStr = newStr +  nextChar;

            } else {
                newStr = newStr + ch;
            }
        }
        System.out.println(newStr);
    }
}