package Task12;

public class A {
	public static void main(String args[])
	{
		int a[] = {12,13,14};
		
		System.out.println("Original Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i = 0; i<a.length; i++)
		{
			a[i]=a[i]*a[i];
		}
		

		
		System.out.println("Square of array");
		for(int i =0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
