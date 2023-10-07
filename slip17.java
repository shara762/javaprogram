import java.util.*;
class slip17
{
    int pid;
    double price;
    String pname;

    void acccept()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter Product id:");
        pid=ob.nextInt();
        System.out.println("Enter Product name:");
        pname=ob.next();
        System.out.println("Enter Prouct price:");
        price=ob.nextDouble();

    }
    void show()
    {
        System.out.println("The All Product Details:");
        System.out.println("PRODUCT ID:"+pid);
        System.out.println("PRODUCT NAME:"+pname);
        System.out.println("PRODUCT PRICE:"+price);
    }
}

class promain
{
    static public void main(String arg[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=ob.nextInt();
        slip17 p[]=new slip17[n];
        for(int i=0;i<=n;i++)
        {
            p[i]=new slip17();
            p[i].acccept();
            p[i].show();
        }
    }

}