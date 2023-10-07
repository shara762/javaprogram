import java.util.*;

class tryout
{
    public static void main(String arg[])
    {
        List<String> list_Strings=new ArrayList<String>();

        list_Strings.add("red");
        list_Strings.add("orange");
        list_Strings.add("blue");
        list_Strings.add("purple");
        list_Strings.add("black");
        System.out.println(list_Strings);

        // for(String element:list_Strings)
        // {
        //     System.out.println(element);
        // }

        // list_Strings.add(0,"pink");         //insert//
        // list_Strings.add(5,"yellow");

        // System.out.println(list_Strings);
        

        // String element= list_Strings.get(0);
        // System.out.println("First element index is:"+element);
        // element=list_Strings.get(2);                                       //index find
        // System.out.println("Third element is:"+element);


        // list_Strings.set(2,"yellow");                                       //replace 
        // System.out.println(list_Strings);


        // list_Strings.remove(2);                                                 //remove
        // System.out.println("After removing 3rd element:"+list_Strings);


// if(list_Strings.contains("red"))
// {
//     System.out.println("found the element");
// }                                                                                  //element found or not and searching
// else
// {
//     System.out.println("not found");
// }


// Collections.sort(list_Strings);
// System.out.println("list after sort"+list_Strings);                    //sorting
   


List<String> list_Strings2=new ArrayList<String>();

        list_Strings2.add("r");
        list_Strings2.add("o");
        list_Strings2.add("b");
        list_Strings2.add("p");
        list_Strings2.add("r");
        // System.out.println(list_Strings2);


        Collections.copy(list_Strings,list_Strings2);                           //copy 1list to 2nd list
         System.out.println("copy to list1 to list2,\n after copy");
          System.out.println(list_Strings);
           System.out.println(list_Strings2);


        //    Collections.shuffle(list_Strings);
        //    System.out.println(list_Strings2);                                               //shuffuling


        //    Collections.reverse(list_Strings);                                           //reverseds
        //    System.out.println(list_Strings);


           
           


List<String> list_Strings3=new ArrayList<String>();

// for(String e:list_Strings)                                                                                    //comaparison and checking
// {
//     list_Strings3.add(list_Strings2.contains(e)?"yes":"no");
//     System.out.println(list_Strings3);

// }

// list_Strings3.addAll(list_Strings);
// list_Strings3.addAll(list_Strings2);                        //join 2 array list

// System.out.println(list_Strings3);

           

}
}