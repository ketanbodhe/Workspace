package Task6;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,12,13,14,15,67,78,89};
		
		System.out.println("Even array");
		for(int i = 0; i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
		
		System.out.println("Odd array");
		for(int i = 0; i<a.length;i++)
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}

	}

}
