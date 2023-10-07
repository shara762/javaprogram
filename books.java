import java.util.*;

class demo
{
    int id;
    String name;
    
        void accept()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enetr the id ");
            int id=sc.nextInt();
            System.out.println("Enter the name ");
            String name=sc.next();
           
       
        } 
        void display()
        { 
            System.out.println("-----------------------------------------");
            System.out.println("Book id:"+id);
            System.out.println("Book name:"+name);
        }
}

class books
{
    public static void main(String arg[])
     {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How Many Element");
        int n=sc.nextInt();
        demo d[]=new demo[n];

        for(int i=1;i<=n;i++)
        {
            d[i]=new demo();
            d[i].accept();
            d[i].display();
        }

        

    }
}