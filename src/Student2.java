
public class Student2 {
	
	String name, name1;
	int rno, rno1;
	
	Student2()
	{
		name = "ABC";
		rno = 123;
		
		name1 = "xyz";
		rno1 = 456;
	}

	public static void main(String[] args) 
	{
		Student2 s1= new Student2();
		System.out.println(s1.name);
		System.out.println(s1.rno);
		
		Student2 s2= new Student2();
		System.out.println(s2.name1);
		System.out.println(s2.rno1);
	}

}
