import java.util.*;
public class Lib3
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 characters");
        int v = 0;
        int c = 0;
        for (int i = 0; i < 20; i++)
        {
            char a = sc.next().charAt(0);
            System.out.println(Character.toUpperCase(a));
            if (Character.toUpperCase(a) == 'A' || Character.toUpperCase(a) == 'E' || Character.toUpperCase(a) == 'I' || Character.toUpperCase(a) == 'O' || Character.toUpperCase(a) == 'U')
            {
                v++;
            }
            else
            {
                c++;
            }
        }
        if (v == 0)
        {
            System.out.println("There were no vowels entered");
        }
        else
        {
            System.out.println("There were " + v + " vowels entered");
        }
        if (c == 0)
        {
            System.out.println("There were no consonants entered");
        }
        else
        {
            System.out.println("There were " + c + " consonants entered");
        }
    }
}