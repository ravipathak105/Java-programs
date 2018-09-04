class MainClass
{
	public static void main(String args[])
	{
		
		Student s1=new Student();
		/*private Student s2=new Student();
		private Student s3=new Student();
	     */
	}
	s1.setStuId(83);
	s1.setStuName("Ravi");
	System.out.println(s1.getStuId());
	System.out.println(s1.getStuName());
}
class Student
{
	private int stuId;
	private  String stuName;
	public void setStuId(int stuId)
	{
		this.stuId=stuId;
	}
	public int getStuId()
	{
		return stuId;
	}
	public void setStuName(String stuName)
	{
		
		this.stuName=stuName;
	}
    public String getStuName()
	
	{
		return stuName;
	}
}
