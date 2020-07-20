import java.util.*;
public class Studen
{
    String Name;
    int age;
    double m1, m2, m3;
    double maximum;
    double average;
    public Studen(double n1, double n2, double n3)
    {
        m1 = n1;
        m2 = n2;
        m3 = n3;
        Name = "";
        age = 0;
        maximum = 0.0;
        average = 0.0;
    }
    public void compute()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name and the age");
        Name = sc.next();
        age = sc.nextInt();
        average = (m1 + m2 + m3) / 3;
        if (m1 > m2)
        {
            maximum = m1;
        }
        else
        {
            maximum = m2;
        }
        if (maximum > m3)
        {
        }
        else if (maximum < m3)
        {
            maximum = m3;
        }
    }
    public void display()
    {
        System.out.println("Name = " + Name);
        System.out.println("age = " + age);
        System.out.println("Marks in 3 subjects = " + m1 + " " + m2 + " " + m3);
        System.out.println("Maximum = " + maximum);
        System.out.println("Average = " + average);
    }
}