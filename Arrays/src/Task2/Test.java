package Task2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee e1 [] = new Employee[4];
		
		for(int i = 0; i<e1.length ; i++)
		{
			Employee e = new Employee();
			System.out.println("Enter ID");
			int id = sc.nextInt();
			e.setId(id);
			
			System.out.println("Enter Name :");
			String name = sc.next();
			e.setName(name);
			
			System.out.println("Enter Mobile no :");
			long mno = sc.nextLong();
			e.setMno(mno);
			
			System.out.println("Enter Salary :");
			double salary = sc.nextDouble();
			e.setSalary(salary);
			
			e1[i]=e;
		}
		
		for (int i = 0; i<e1.length;i++)
		{
			System.out.println("ID       : " +e1[i].getId() );
			System.out.println("Name     : " +e1[i].getName());
			System.out.println("Mobile No: " +e1[i].getMno());
			System.out.println("Salary   : " +e1[i].getSalary());
		}

	}

}
