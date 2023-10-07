import java.util.*;

class cricket{
    int pid,totruns,inplay,notouttime,avg,max=0;
    String pname;
    void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the player id ");
            pid=sc.nextInt();
            System.out.println("Enter the player name ");
            pname=sc.next();
             System.out.println("Enter the total runs ");
            totruns=sc.nextInt();
             System.out.println("Enter the plyer innings played ");
            inplay=sc.nextInt();
             System.out.println("Enter the player not out times ");
            notouttime=sc.nextInt();
    }
    void average()
    {
        avg=totruns/inplay;
    }
    
    void display()
    {
        System.out.println(pid+"\n"+pname+"\n"+"\n"+totruns+"\n"+inplay+"\n"+notouttime+"\n"+avg+"\n");
    }
}

class slip7{
    public static void main(String args[]) 
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How Many Element do u want to enter");

        int n=sc.nextInt();
        cricket c[]=new cricket[n];
        

        for(int i=0;i<=n;i++)
        {
            
            c[i]= new cricket();
            c[i].get();
            c[i].average();
             c[i].display();
        }   
    }
}