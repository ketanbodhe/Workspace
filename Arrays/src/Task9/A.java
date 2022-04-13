package Task9;

import java.util.Scanner;

public class A {
	public static void main(String args[])
	{
		int a[]={10,10,2,4,5,6,2,2,7,10};
		Scanner sc = new Scanner(System.in);
		int n, count = 0;
		System.out.println("Enter the number to find occurance");
		n=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				count++;
			}
			
		}
		System.out.println(n+" Occures " +count + " times");
	}

}
