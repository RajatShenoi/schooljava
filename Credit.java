import java.util.*;
public class Credit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the card number");
        long number = sc.nextLong();
        long m = number;
        while(card!=0)
        {
            card = card / 10;
            int dig = card % 10;
            if(dig > 9)
            {
                