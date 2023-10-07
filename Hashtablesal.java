import java.util.*;
import java.io.*;
class Hashtablesal
{
    public static void main(String arg[]) throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Hashtable<Integer, Integer> H=new Hashtable<Integer,Integer>();
        H.put(1,1000);
        H.put(2,2000);
        H.put(3,3000);

          Enumeration E;
          E=H.keys();

          while(E.hasMoreElements())
          {
            int k=(int) E.nextElement();
            System.out.println(k+";"+H.get(k));          //KEY VALUE TRAVELING//
          }

          // Scanner ob=new Scanner(System.in);

          System.out.println("Enter the emp name to search:");

          int ename=Integer.parseInt(br.readLine());
          E=H.keys();

          while(E.hasMoreElements())
          {
            int  a=(int)E.nextElement();

            if(ename==a)
            {
                          System.out.println();
                            System.out.println("value="+H.get(a));
                            break;
            }
          }


    }
}