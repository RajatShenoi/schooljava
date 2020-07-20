import java.util.*;
public class Lib10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 first five upper case letters");
        System.out.println("Enter 2 last five lower case letters");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                for (char a = 'A'; a <= 'E'; a++) {
                    System.out.println(a);
                }
                break;
            case 2:
                for (char a = 'v'; a <= 'z'; a++) {
                    System.out.println(a);
                }
                break;
            default:
                System.out.println("Enter only 1 or 2");
        }
    }
}