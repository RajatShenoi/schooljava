import java.util.*;
public class Lib2
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char a = sc.next().charAt(0);
        for (int i = 0; i < 5; i++)
        {
            char asc = (char)(((int) a) + (i + 1));
            System.out.println(asc);
        }
    }
}