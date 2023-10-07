public class slip18 {

    final double pi=3.14;

    void area(int r)

    {
        System.out.println("Area of circle is:"+pi*r*r);
    }
    void area(int h,int w)
    {
        System.out.println("Area of rectangle is:"+w*h);

    }
    void area(int b,double h)
    {
        System.out.println("Area of triangle is:"+(1/2)*b*h);
    }
    
}

class overload
{
    public static void main(String arg[])
    {
        slip18 ob=new slip18();

        ob.area(2);
        ob.area(5,4);
        ob.area(4,5.5);
    }
}
