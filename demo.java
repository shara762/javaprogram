import mathematics.maximum;
import mathematics.power;

import java.util.*;

class demo
{
    public static void main(String arg[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the two number");
        int x=ob.nextInt();
        int y=ob.nextInt();
        maximum m=new maximum();
        power p=new power();

        

        m.max2(x,y);
        p.pow(x,y);



    }
}