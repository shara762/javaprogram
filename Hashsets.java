import java.util.*;
import java.util.Iterator;
class Hashsets
{
    public static void main(String arg[]) 
    {
      
        // HashSet<String> h=new HashSet<String>();
        // h.add("1000");
        // h.add("2000");
        // h.add("3000");

        //   Iterator<String> p =h.iterator();

        //   while(p.hasNext())
        //   {
        //     System.out.println(p.next());
        //   }
    

        //   h.removeAll(h);                                                    

        //   System.out.println("Its shows the size"+h.size());

        //   System.out.println("the array is empty or not"+h.isEmpty());

//  HashSet<String> H=new HashSet<String>();
//    H= (HashSet) H.clone();
//                     System.out.println("Its shows the size"+H);





                    // String [] newarr=new String[h.size()];
                    // h.toArray(newarr);
                    // System.out.println("Array elements");
                    // for(String)

//create treeset of hashset

// Set<String> t=new TreeSet<String>(h);
//  System.out.println("treeset elements");
//  for(String element: t)
//  {
//      System.out.println( element);
//  }

//use add() method to add values in the hash set
// HashSet<String> n=new HashSet<String>();
// n.add("green");
// n.add("Red");
// for(String ele:h)
// {
//     System.out.println(n.contains(ele)?"yes":"No");
// }



//same rehana chahiye different remove element from hashset

// h.retainAll(n);

//reversed order of treeset

TreeSet<String> t=new TreeSet<String>();
t.add("hi");
t.add("mello");
t.add("1");
t.add("0");

t.add("2");


 System.out.println(t);

Iterator it=t.descendingIterator();
System.out.println("Element is reversed");
while(it.hasNext())
{
    System.out.println(it.next());
}

 System.out.println(t.lower("1"));

  System.out.println("remove the last elements"+t.pollLast());

    }}