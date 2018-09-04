class Student
{
	int id;
	String name;
	int age;
	int batch;
	Student(int i,String n)
	{
		id=i;
		name=n;
		
	}
	Student(int i,String n,int a)
	{
		id=i;
		name=n;
		age=a;
		
	}
	Student(int i,String n,int a,int b)
	{
	
		id=i;
		name=n;
		age=a;
		batch=b;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+age+" "+batch);
	}
	public static void main(String[]args)
	{
		Student s1=new Student(83,"Ravi");
		Student s2=new Student(84,"Anurag",22);
		Student s3=new Student(103,"Shivam",23,2016);
		Student s4=new Student(86,"Shivesh");
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		
		
	}
}