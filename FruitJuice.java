import java.util.*;
class FruitJuice
{
    private int product_code, pack_size, product_price;
    private String flavour, pack_type;
    public FruitJuice( )
    {
        product_code = 0;
        pack_size = 0;
        product_price = 0;
        flavour = "";
        pack_type = "";
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product code, flavour, pack type, pack size and product price: ");
        product_code = sc.nextInt();
        flavour = sc.nextLine();
        pack_type = sc.nextLine();
        pack_size = sc.nextInt();
        product_price = sc.nextInt();
    }
    public void discount()
    {
        product_price=product_price - 10;
    }
    public void display()
    {
        System.out.println("Product Code: "+product_code);
        System.out.println("Flavour: "+flavour);
        System.out.println("Pack Type: "+pack_type);
        System.out.println("Pack Size: "+pack_size);
        System.out.println("Product Price: "+product_price);
    }
    public static void main(String args[])
    {
        FruitJuice fj = new FruitJuice();
        fj.input();
        fj.discount();
        fj.display();
    }
}