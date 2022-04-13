package Task3;

import java.util.Scanner;

public class Test1 {
	public static void main(String args[])
	{
		Doctor d[]= new Doctor[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<d.length; i++)
		{
			Doctor d1 = new Doctor();
			System.out.println("Enter Age");
			d1.setAge(sc.nextInt());
			
			System.out.println("Enter Name :");
			d1.setName(sc.next());
			
			System.out.println("Enter Hospital Name ");
			d1.setHospname(sc.next());
			
			d[i]=d1;
			
		}
		
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i].getAge());
			System.out.println(d[i].getName());
			System.out.println(d[i].getHospname());
		}
	}

}
