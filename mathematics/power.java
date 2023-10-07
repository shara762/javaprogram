package mathematics;
public class power
{
    public int a,b;
    public void pow(int a,int b)
    {
        int i,c=a;
        for(i=1;i<=b;i++)
        {
            c=c*a;
        }
        System.out.println(c);

    }
}