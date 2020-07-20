public class Calc
{
    public static void num_calc(int num, char ch)
    {
        int ans = 0;
        if(ch == 's')
        {
            ans = num * num;
        }
        else
        {
            ans = num * num * num;
        }
        System.out.println("The answer is " + ans);
    }
    public static void num_calc(int a, int b, char ch)
    {
        int ans = 0;
        if(ch == 'p')
        {
            ans = a * b;
        }
        else
        {
            ans = a + b;
        }
        System.out.println("The answer is " + ans);
    }
}