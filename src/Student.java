
public class Student {
	
	String name;
	int rno;
	
	Student()
	{
		name = "ABC";
		rno = 123;
	}

	public static void main(String[] args) 
	{
		Student s1= new Student();
		System.out.println(s1.name);
		System.out.println(s1.rno);
	}

}
