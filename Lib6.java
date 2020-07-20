import java.util.*;
public class Lib6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 characters");
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        int d = (int)(a - b);
        System.out.println(d);
        if (d == 0) {
            System.out.println("Both the characters are same");
        } else if (d < 0) {
            System.out.println("First Character is smaller");
        } else {
            System.out.println("Second character is smaller");
        }
    }
}