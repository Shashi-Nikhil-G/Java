import java.util.Scanner;

public class Inserting {
	
	Scanner sc = new Scanner(System.in);
	
	int position,element,n;
	int a[];
	
	void read()
	{
		System.out.println("Enter the no:elements:");
		n = sc.nextInt();
		
		System.out.println("Enter the array elements:");
		a = new int[n+1];
		
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element to be insert:");
		element = sc.nextInt();
		
		System.out.println("Enter the position:");
		position = sc.nextInt();
	}
	
	void insert()
	{
		
		for(int i=n;i>=position;i--)
		{
			a[i] = a[i-1];
			
		}

		a[position-1] = element;
		n=n+1;
	}
	
	void display()
	{
		System.out.println("Array elements after insertion:");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
	
}
