abstract class shapes
{
    final double pi=3.14;
    abstract void area();
    abstract void volume();
}
class cylender extends shapes{
    
    void area()
    {
        int r=2,h=1;

        System.out.println("Area of cylender : "+2*pi*r*h+2*pi*r*r);
    }
    void volume()
    {
        int r=1,h=2;
        System.out.println("Volume of cylender : "+pi*r*r*h);

    }
}
class cone extends shapes{
    void area()
    {
        int r=2,l=3;
        System.out.println(" Area of cone : "+pi*r*r+pi*r*l);
    }
    void volume()
    {        int r=6,h=4;
        System.out.println("volume of cone :"+ 1/3*pi*r*r*h);
    }

}

class slip3b
{
    public static void main(String arg[])
    {
        cone c1=new cone();
        c1.area();
        c1.volume();
        cylender c2=new cylender();
        c2.area();
        c2.volume();
        
    }
}
