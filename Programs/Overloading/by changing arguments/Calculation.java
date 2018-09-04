class Calculation
{
   void sum(int a,int b, int c)
    {
      System.out.println(a+b+c);
    }
   void sum(int a,int b)
    {
      System.out.println(a+b);
    }

  public static void main(String[]args)
   {
  
    Calculation obj = new Calculation();
    obj.sum(10,20);
    obj.sum(10,20,30);
  }


}