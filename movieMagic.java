import java.util.*;
public class movieMagic
{
    private int year;
    private String title;
    private float rating;
    public movieMagic()
    {
        year = 0;
        title = "";
        rating = 0.0F;
    }
    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year, title and the rating");
        year = sc.nextInt();
        title = sc.next();
        rating = sc.nextFloat();
    }
    public void display()
    {
        System.out.println("Movie: "+title);
        if (rating > 0.0 && rating <= 2.0)
        {
            System.out.println("Flop");
        }
        else if (rating > 2.0 && rating <= 3.4)
        {
            System.out.println("Semi-hit");
        }
        else if (rating > 3.4 && rating <= 4.5)
        {
            System.out.println("Hit");
        }
        else if (rating > 4.5 && rating <= 5.0)
        {
            System.out.println("Super hit");
        }
        else 
        {
            System.out.println("INVALID INPUT");
        }
    }
    public static void main(String args[])
    {
        movieMagic mm = new movieMagic();
        mm.accept();
        mm.display();
    }
}