import java.util.*;
public class Circle
{
    private int r;
    private double a;
    public static void main(String args[])
    {
        Circle c = new Circle();
        System.out.println("Enter the radius of the circle");
        c.input();
        c.process();
        c.output();
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
    }
     public void process()
    {
        a = (3.14)*r*r;
    }
    public void output()
    {
        System.out.println("Area of circle is "+a);
        System.exit(0);
    }
    
}