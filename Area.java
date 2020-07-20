public class Area
{
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