import java.util.*;
public class ShowRoom
{
    String name;
    long mobno;
    double cost;
    double dis;
    double amount;
    public ShowRoom()
    {
        mobno = 0L;
        cost = 0.0;
        dis = 0.0;
        amount = 0.0;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name, MOBILE NUMBER and the COST");
        name = sc.next();
        mobno = sc.nextInt();
        amount = sc.nextDouble();
    }
    public void calculate()
    {
        double d = 0.0;
        if (amount > 0.0 && amount <= 10000)
        {
            d = 0.05 * amount;
        }
        else if (amount > 10000 && amount <= 20000)
        {
            d = 0.1 * amount;
        }
        else if (amount > 20000 && amount <= 35000)
        {
            d = 0.15 * amount;
        }
        else if (amount > 35000)
        {
            d = 0.20 * amount;
        }
        else 
        {
            System.out.println("INVALID INPUT");
        }
        amount -= d;
    }
    public void display()
    {
        System.out.println("Name = " + name);
        System.out.println("Mobile Number = " + mobno);
        System.out.println("Amount = " + amount);
    }
    public static void main(String args[])
    {
        ShowRoom s = new ShowRoom();
        s.input();
        s.calculate();
        s.display();
    }
}