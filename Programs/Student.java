class Student
{
	int rollNo;
	String name;
	int batch;
	void setRecord(int r,String n, int b)
	{
		rollNo=r;
		name=n;
		batch=b;
		
	}
	void getRecord()
	{
		System.out.println(rollNo+" "+name+" "+batch);
		
	}
	

	public static void main(String[]args)
	{
		Student s1=new Student();
		Student s2=new Student();
		s1.setRecord(83,"Ravi",2016);
		s2.setRecord(86,"Shivam",2017);
		s1.getRecord();
		s2.getRecord();
		
	}
	
}