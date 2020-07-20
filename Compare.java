public class Compare
{
    public static void compare(int a, int b)
    {
        if (a > b)
        {
            System.out.println(a + " is greater than " + b);
        }
        else if (a < b)
        {
            System.out.println(b + " is greater than " + a);
        }
        else
        {
            System.out.println(a + " and " + b + " are equal");
        }
    }
    public static void compare(char a, char b)
    {
        int a1 = (int) a;
        int b1 = (int) b;
        if (a1 > b1)
        {
            System.out.println(a + " is greater than " + b);
        }
        else if (a1 < b1)
        {
            System.out.println(b + " is greater than " + a);
        }
        else
        {
            System.out.println(a + " and " + b + " are equal");
        }
    }
}