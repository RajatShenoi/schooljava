import java.util.*;
public class Student
{
    private int rollNum, tm=0, pm;
    private String name;
    private double avg;
    private static final String subject = "Computer Applications";
    public static void displaySchoolAddress()
    {
        System.out.println("Sanjayanagar,\nBengaluru");
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input rollnumber, name, theory and practical marks");
        rollNum = sc.nextInt();
        name = sc.next();
        tm = sc.nextInt();
        pm = sc.nextInt();
    }
    public void process()
    {
        avg = (tm+pm)/2.0;
    }
    public void output()
    {
        System.out.println("Name = "+name);
        System.out.println("Average marks = "+avg);
    }
    public static void main(String args[])
    {
        Student s = new Student();
        s.input();
        s.process();
        s.output();
        displaySchoolAddress();
    }
}