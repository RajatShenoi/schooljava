import java.util.*;
public class E
{
    public static int factorialin(int n)
    {
        int product = 1;
        for(int i = 1; i<=n; i++)
        {
            product*=i;
        }
        return product;
    }
    public static void factors()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for factors");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++)
        {
            if(n%i==0)
            {
                System.out.println(i+" is a factor of "+n);
            }
        }
    }
    public static void factorial()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for factorial");
        int n = sc.nextInt();
        long product = 1;
        for(int i = 1; i<=n; i++)
        {
            product=product*i;
        }
        System.out.println("Factorial is "+product);
    }
    public static void findArea(int r)
    {
        double area = 3.14 * r * r;
        System.out.println("The area of circle is " + area);
    }
    public static void findArea(int l, int b)
    {
        double area = l * b;
        System.out.println("The area of rectangle is " + area);
    }
    public static void findArea(double b, double h)
    {
        double area = 0.5 * b * h;
        System.out.println("The are of the triangle is " + area);
    }
}