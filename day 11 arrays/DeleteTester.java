import java.util.Scanner;

class DeleteTester{
	public static void main(String[] args) {
		System.out.println("mms");
		
		Delete d = new Delete();
		
		d.read();
		d.del();
		d.display();
		
		System.out.println("mme");
	}
}

class Delete {
	
	Scanner sc = new Scanner(System.in);
	
	int n,element,position;
	int a[] = new int[100];
	
	void read()
	{
		System.out.println("Enter the no:of elements:");
		n = sc.nextInt();
		
		System.out.println("Enter the array elements:");
		
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element to delete:");
		element = sc.nextInt();
	}
	
	void del()
	{
		for(int i=0;i<n;i++)
		{
			if(a[i]==element)
				position = i;
		}

		for(int i=position;i<n;i++)
		{
			a[i] = a[i+1];
		}
		n=n-1;
	}
	
	void display()
	{
		System.out.println("elements after deletion:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}

