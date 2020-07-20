public class Area_1
{
    public static double findArea(double a, double b, double c)
    {
        double s = (a + b + c) / 2; 
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
    public static double findArea(int a, int b, int height)
    {
        double area = 0.5 * height * (a + b);
        return area;
    }
    public static double findArea(double diagonal1, double diagonal2)
    {
        double area = 0.5 * diagonal1 * diagonal2;
        return area;
    }
}