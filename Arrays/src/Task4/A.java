package Task4;

public class A {
	public static void main(String args[])
	{
	int a[] = {10,20,30,40};
	int b[] = new int [a.length];

	System.out.println("Array A");
	for(int i = 0; i<a.length; i++)
	{
		System.out.println(a[i]);
	}
	
	for(int i=0; i<a.length; i++ )
	{
		b[i]=a[i];
	}
	
	System.out.println("Array B");
	for(int i = 0; i<b.length; i++)
	{
		System.out.println(b[i]);
	}
	}
}
