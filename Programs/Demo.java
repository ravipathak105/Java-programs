class Demo
{
	public static void method1()
	{
		System.out.println("Method 1");
	}	
	public static void method2()
	{
		System.out.println("Method 2");
	     method1();
	}	
	public static void method3()
	{
		System.out.println("Method 3");
	    method2();
	}	
	public static void main(String []args)
	{
		System.out.println("Method");
		method3();
	}
	}