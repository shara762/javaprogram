import java.util.*; 
class ListDemo 
{ 
 public static void main(String args[]) 
 { 
 Set C=new TreeSet();
 
 C.add("aa"); 
 C.add("bb"); 
 C.add("cc"); 
 C.add("aa"); 
 
  System.out.println(C); 
//  System.out.println("get = "+ C.get(2)); 
//  System.out.println("IndexOf = "+ C.indexOf("ee")); 
//  System.out.println("Last IndexOf = " + C.lastIndexOf("ee")); 
//  System.out.println(C.remove(2)); 
//  System.out.println("After Remove element at 4" +C); 
//  C.set(1,"xx"); 
//  System.out.println("After replace " +C); 
//  System.out.println("Size " + C.size()); 
//  System.out.println(C.subList(2,3)); 
 } 
} 