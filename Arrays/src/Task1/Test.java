package Task1;

public class Test {
	public static void main(String[] args)
	{
		Student s[]=new Student[2];
		Student stu1 = new Student();
		stu1.setRollno(1);
		stu1.setName("ABC");
		
		Student stu2 = new Student();
		stu2.setRollno(2);
		stu2.setName("XYZ");
		
		s[0]=stu1;
		s[1]=stu2;
		
		for( int i=0;i<s.length;i++)
		{
			System.out.println(s[i].getRollno());
			System.out.println(s[i].getName());
			
		}
	}

}
