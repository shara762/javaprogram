import java.util.*;
class slip9{
    public  static void main(String aeg[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=obj.nextInt();
        int i,j;
         int temp=1;
        for(i=1;i<=n;i++)
        { 
            for(j=1;j<=i;j++)
            {
                if(temp==1)
                {
                    System.out.print(temp);
                    temp--;
                }
                else
                {
                    System.out.print(temp);
                    temp++;                    
                }
                
            }
            System.out.println();
        }
    }
}