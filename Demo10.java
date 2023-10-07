class Parent
{
    void display()
    {
        
        System.out.println("Hello");
    }
}
class Child extends Parent
{
    public void add()
    {
        System.out.println("hii");

    }
}
class Demo10
{
    public static void main(String[] args)

    {
        Parent p = new Child();
        p.display();
        p.add();
    }
}