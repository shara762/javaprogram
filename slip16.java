import java.util.*;
class sumd
{

    int r,sum=0;

    void add(int n)
    {
        if(n!=0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        add(n);
    }

    void dis()
    {
        System.out.println("Sum of digit is:"+sum);
    }

    

}

class slip16
{

    public static void main(String arg[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enetr the number:");
        int n=ob.nextInt();
        
        add(n);
        ob.dis();
    
    }

}