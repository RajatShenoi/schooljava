import java.util.*;
public class Employee
{
    private String name;
    private int ms;
    private double tax;
    private static final String cName = "Achievers' Hub";
    public static void displayCompanyAddress()
    {
        System.out.println(cName);
        System.out.println("Sanjayanagar Bangalore");
    }
    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name and monthly salary");
        name = sc.next();
        ms = sc.nextInt();
    }
    public void compute()
    {
        if(ms*12>500000)
        {
            tax = 0.1*ms*12;
        }
    }
    public void display()
    {
        System.out.println("Name = "+name);
        System.out.println("Tax to be paid = "+tax);
    }
    public static void main(String args[])
    {
        Employee e = new Employee();
        displayCompanyAddress();
        e.accept();
        e.compute();
        e.display();
    }
}