package Task8;

public class A {
	public static void main(String args[])
	{
		int a[] = {10,20,20,10,30,40};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]+"is duplicate element in array");
				}
				}
		}
	}

}
