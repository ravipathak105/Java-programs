class Calculation
{
   void sum(int a,double b, int c)
    {
      System.out.println(a+b+c);
    }
   void sum(double a,double b)
    {
      System.out.println(a+b);
    }

  public static void main(String[]args)
   {
  
    Calculation obj = new Calculation();
    obj.sum(1000,2000);
    obj.sum(10,20,30);
  }


}