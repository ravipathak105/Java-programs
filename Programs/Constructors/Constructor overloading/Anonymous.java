abstract class Check
{
	abstract void msg();
	
}
class Test
{
	public static void main(String[]args)
	{
		Check obj=new Check()
		{
			
			void msg()
			{
				System.out.println("HelloWorld");
				
			}
		};
		obj.msg();
	}
	
}