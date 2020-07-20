import java.util.*;
public class Lib8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to display Z - A");
        System.out.println("Enter 2 to display a - z");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                for (char a = 'Z'; a >= 'A'; a--) {
                    System.out.println(a);
                }
                break;
            case 2:
                for (char a = 'a'; a <= 'z'; a++) {
                    System.out.println(a);
                }
                break;
            default:
                System.out.println("Enter 1 or 2");
        }
    }
}