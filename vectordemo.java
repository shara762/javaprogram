import java.util.*;

class vectordemo
{
    public static void main(String arg[])
    {
        int i,j,n;
        n=arg.length;
        Vector<String> v=new Vector <String>();
        String str[]=new String[n];

        for(i=0;i<n;i++)
        {
            v.addElement(arg[i]);
        }

        v.copyInto(str);
        for(i=0;i<n;i++)
        {
            if(str[i].endsWith(".java"))
            {
                System.out.println(str[i]);
            }
        }
    }
}