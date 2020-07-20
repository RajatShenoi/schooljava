import java.util.*;
public class Mobike
{
    private int bno;
    private int phno;
    private String name;
    private int days;
    private int charge;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bike number, phone number, name, no of days");
        bno = sc.nextInt();
        phno = sc.nextInt();
        name = sc.next();
        days = sc.nextInt();
    }
    public void compute()
    {
        if(days<=5)
        {
            charge = 500*days;
        }
        else if(days>5&&days<=10)
        {
            charge = 2500 + 400*(days-5);
        }
        else
        {
            charge = 4500 + 200*(days-10);
        }
    }
    public void display()
    {
        System.out.println("Bike no\tPhone number\tName\tNo of days\tCharge\t");
        System.out.println(bno +"\t"+phno+"\t"+name+"\t"+days+"\t"+charge);
    }
    public void Mobike()
    {
    }
    public static void main(String args[])
    {
        Mobike m = new Mobike();
        m.input();
        m.compute();
        m.display();
    }
}