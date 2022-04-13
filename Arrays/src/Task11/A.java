package Task11;

public class A {
	public static void main(String args[])
	{
		int a [] = {10,100,69,78,89,};
		int temp;
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
				}
				// 200, 200, 199, 100, 89, 78, 69,10
			}
			
		}
		
		int n=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				count++;
			}
			
		}
		
		System.out.println("Second Largest " +a[count]);
		
		
	}

}
