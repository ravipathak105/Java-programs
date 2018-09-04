//Encapsulation
public class EncapEx
{
	private int i;
	int j;
	public void setI(int j)
	{
		i=j;
		
	}
	public int getI()
	{
		
		return i;
	}
	
	
}

class MainClass
{
	static public void main(String[]args)
	{
		EncapEx obj=new EncapEx();
		obj.setI(8);
	    System.out.println(getI());
	
	}
	
}