package Task10;

public class A {
	public static void main(String args[])
	{
		int a[]={10,69,78,89,100,199,200};
		int large=0;
		
		for(int i=0;i<a.length;i++)
		{
		
			if(a[i]>large)
			{
				large = a[i];
			}
			
		}
		System.out.println("largest element in array "+large);
	}

}
