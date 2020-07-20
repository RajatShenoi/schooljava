import java.util.*;
public class Lib1
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char a = sc.next().charAt(0);
        char asc = (char)(((int) a) + 10);
        System.out.println(asc);
    }
}