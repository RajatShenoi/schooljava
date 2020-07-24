import java.util.*;
public class Arr16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int year[] = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010};
        System.out.println("Enter your graduation year!");
        int in = sc.nextInt();
        int first = 0;
        int last = 9;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (year[mid] == in) {
                System.out.println("Record Exists!");
                System.exit(0);
            } else if (year[mid] > in) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        System.out.println("Record doesn't exist :(");
    }
}