class mynumber
{
    private int n;
        mynumber()
        {
            n=0;
        }
        mynumber(int a)
        {
            n=a;
        }
        public void isnegative()
        {
            
            if(n<0)
            {
                System.out.println(n+" no is negative");
            }

        }
        public void ispositive()
        {
            if(n>0)
            {
                System.out.println(n+" no is positive");
            }
        }
    }
    


class tp
{
      public static void main(String arg[])
    {
        int n=Integer.parseInt(arg[0]);
        mynumber ob1=new mynumber();
        ob1=new mynumber(n);
        ob1.isnegative();
        ob1.ispositive();
    }
}
