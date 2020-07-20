import java.util.*;
public class BookFair
{
    String Bname;
    double price;
    public BookFair()
    {
        Bname = "";
        price = 0.0;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of the book and the price of it");
        Bname = sc.next();
        price = sc.nextDouble();
    }
    public void calculate()
    {
        double discount = 0.0;
        if (price > 0.0 && price <= 1000.0)
        {
            discount = 0.02 * price;
        }
        else if (price > 1000.0 && price <= 3000.0)
        {
            discount = 0.1 * price;
        }
        else if (price > 3000.0)
        {
            discount = 0.15 * price;
        }
        else
        {
            System.out.println("INVALID COST");
        }
        price -= discount;
    }
    public void display()
    {
        System.out.println("Name of the book = " + Bname);
        System.out.println("Cost after DISCOUNT = " + price);
    }
    public static void main(String args[])
    {
        BookFair b = new BookFair();
        b.input();
        b.calculate();
        b.display();
    }
}