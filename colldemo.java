import java.util.*; 
class colldemo
 
{ 
 public static void main(String args[]) 
 { 
 int i,n; t;
 String cn; 
 Collection c=new ArrayList(); 
 Scanner ob=new Scanner(System.in); 
 System.out.println ("How Many elements do u want:"); 
 n=ob.nextInt (); 
 for(i=1;i<=n;i++) 
 { 
 System.out.println ("City Name is:"); 
 cn=ob.next(); 
 c.add(cn); 
 } 
 System.out.println ("Entered Data is " + c); 
 } 
} 