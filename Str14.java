import java.util.*;
public class Str14 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        str = str.toUpperCase();
        boolean isUnique = true;
        int len = str.length();

        for (int i = 0; i < len; i++) {

            char ch = str.charAt(i);

            for (int j = i + 1; j < len; j++) {
                if (ch == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (!isUnique) {
                break;
            }
        }

        if (isUnique) {
            System.out.println("Unique String");
        } else {
            System.out.println("Not Unique String");
        }
    }
}