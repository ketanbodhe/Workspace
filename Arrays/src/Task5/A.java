package Task5;

public class A {
	public static void main(String args[])
	{
		int a[] = {10,12,13,14,15,67,78,89};
	
		for(int i=0; i<a.length;i++)
		{
			if((a[i]%2)==0)
				System.out.println(a[i]+" is even number ");
			else
				System.out.println(a[i]+" is odd number");

		}
	}

}
