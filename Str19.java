import java.util.Scanner;

public class Str19 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = in.nextLine();
        str = str.toUpperCase();
        str += " ";
        String word = "";
        int count = 0;
        int len = str.length();

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                int wordLen = word.length();
                for (int j = 0; j < wordLen - 1; j++) {
                    if (word.charAt(j) + 1 == word.charAt(j + 1)) {
                        count++;
                        System.out.println(word);
                        break;
                    }
                }

                word = "";
            } else {
                word += str.charAt(i);
            }

        }

        System.out.println("Number of words containing consecutive letters: " + count);
    }
}