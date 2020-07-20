public class return_Error
{
    public static int paws(int a, int b) 
    {
        a = a + b;
        b = a - b;
        a = a - b;
        int c = 4;
        System.out.println(a + "," + b);
        return a;
        return b;
        return c;
    }
    public static void main()
    {
        paws(30,50);
    }
}
  