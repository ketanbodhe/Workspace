package Task6;

public class A {
	public static void main(String args[])
	{
		int a[] = {10,12,13,14,15,67,78,89};
		int b[] = new int [8];
		int c[] = new int [8];
		
	    int j=0,k=0;
	    
	System.out.println("Even Arrays");
	for(int i = 0; i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			b[j]=a[i];
		j++;
		}
	}
	for(int i=0;i<j;i++)
	{
		System.out.println(b[i]);
	}
	
	System.out.println("Odd Arrays");
	for(int i = 0; i<a.length;i++)
	{
		if(a[i]%2!=0)
		{
			c[k]=a[i];
		k++;
		}
	}
	for(int i=0;i<k;i++)
	{
		System.out.println(c[i]);
	}
	
	}

}
