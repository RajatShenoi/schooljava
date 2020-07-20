public class Polygon
{
    public static void polygon(int n, char ch)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void polygon(int x, int y)
    {
        for(int i = 1; i <= y; i++)
        {
            for(int j = 1; j <= x; j++)
            {
                System.out.print("@");
            }
            System.out.println();
        }
    }
    public static void polygon()
    {
        for(int i = 1; i <= 3; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        polygon();
    }
}