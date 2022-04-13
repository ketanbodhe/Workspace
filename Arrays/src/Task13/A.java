package Task13;

public class A {
	public static void main(String args[])
	{
		int a[] = {1,2,3};
		int b[] = {4,5,6};
		int c [] = new int [a.length+b.length];
		
		for(int i=0; i<a.length;i++)
		{
			c[i]=a[i];
		}
		int k=c.length-a.length;
		for(int i=0;i<b.length;i++)
		{
			c[k]=b[i];
			k++;
		}
		
		System.out.println("First Array");
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+"   ");
		}
		System.out.println();
		System.out.println("Second Array");
		for(int i=0; i<b.length;i++)
		{
			System.out.print(b[i]+"   ");
		}
		
		System.out.println();
		System.out.println("Merged Array  ");
		for(int i=0; i<c.length;i++)
		{
			System.out.print(c[i]+"   ");
		}
	}

}
