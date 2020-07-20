import java.util.*;
public class Recursion
{
    public static void draw(int h)
    {
        if (h == 0)
        {
            return;
        }
        draw(h-1);
        for (int i = 0; i < h; i++)
        {
            System.out.print("#");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        int h = sc.nextInt();
        draw(h);
    }
}