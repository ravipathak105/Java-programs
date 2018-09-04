import java.util.Scanner;
class Example
{
	public static void main(String[]args)
	{
		int option,no;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Your Option");
		System.out.println("1.If-else");
		System.out.println("2. For");
		System.out.println("3. While");
		System.out.println("4. Do-While");
		option=s.nextInt();
		switch(option)
		{
			case 1:
			System.out.println("Enter Your Number to check even-odd");
			no=s.nextInt();
			if(no%2==0)
			{
				System.out.println("Even number");
			}
			else
			{
				System.out.println("Odd Number");
			}
			break;
			case 2:
			System.out.println("Enter Your no to print table");
			no=s.nextInt();
			for(int i=1;i<=10;i++)
			{
				int x=no*i;
				System.out.println(x);
			}
			break;
		    
			case 3:
			System.out.println("Enter no print table in reverse order");
			no=10;
			while(no!=0)
			{
				for(int j=1;j<10;j++)
				{
				int y=no*j;
				
				System.out.print(y);
				System.out.print("\t");
			}
			no--;
			}
			
			break;
		}
	}
	
}