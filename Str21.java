import java.util.Scanner;
public class Str21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b or c for any of the three patterns: ");
        char c = sc.next().charAt(0);
        switch (c) {
            case 'a':
                for (int i = 0; i < 5; i++) {
                    for (int j = i; j < 5; j++) {
                        System.out.print((char)(65 + j));
                    }
                    System.out.println();
                }
                break;
            case 'b':
                int count = 0;
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        count++;
                        System.out.print((char)(64 + count));
                    }
                    System.out.println();
                }
                break;
            case 'c':
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5 - i; j++) {
                        System.out.print((char)(65 + j));
                    }
                    if (i == 0) {
                        System.out.println();
                        continue;
                    }
                    for (int k = 0; k < i; k++) {
                        System.out.print((char)(k + 65));
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("ERROR! Make sure to enter only one character with a or b or c.");
        }
    }
}
