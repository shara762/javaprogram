import java.util.*;
class student
{
   public  int rno,m1,m2;
    String name;

    void get()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the rno");
        rno=ob.nextInt();
        System.out.println("Enter the name");
        name=ob.next();
        System.out.println("Enter the m1");
        m1=ob.nextInt();
        System.out.println("Enter the m2");
        m2=ob.nextInt();
        System.out.println("*******************************");

    }
    void show()
    {
          result r=new result();
        System.out.println("Student name is:"+name+"\n"+"Student rno is:"+rno+"\n"+"Student mark1:"+m1+"\n"+"student mark2:"+m2+"\n");
        r.cal();
    }

    class result
    {
        int tot;
        double per;
        void cal()
        {
          
            tot=m1+m2;
            per=(tot*100)/200;
            System.out.println("The total mark is:"+tot+"\n");
             System.out.println("The percentage is:"+per+"\n");
    }
}

}

class inoutmain
{
    static public void main(String arg[])
    {

    
    student s=new student();
    s.get();
    s.show();
    
    
}
}