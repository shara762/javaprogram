import java.util.Scanner;

interface shape
{
    public final double pi=3.14;
    
    public void area(int r);
}
class sphere implements shape
{
    

    public void area(int r)
    {
        System.out.println("Area of sphere: "+4*pi*r*r);
    }
}
class cirle implements shape
{

    public void area(int r)
    {
        System.out.println("Area of cirle : "+pi*r*r);
    }
}
public class slip8 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the r");
         int a=sc.nextInt();
        sphere r=new sphere();
        r.area(a);
        cirle c=new cirle();
        c.area(a);
    }
}
