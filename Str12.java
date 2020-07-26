import java.util.*;
public class Str12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        str += " ";
        String newStr = "";
        String word = "";
        String target = "Blue";
        String newWord = "Red";
        int len = str.length();

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (target.equals(word)) {
                    newStr = newStr + newWord + " ";
                }
                else {
                    newStr = newStr + word + " ";
                }
                word = "";
            }
            else {
                word += ch;
            }

        }

        System.out.println(newStr);
    }
}