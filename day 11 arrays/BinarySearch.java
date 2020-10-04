import java.util.Scanner;

class BinarySearch{
	
	Scanner sc = new Scanner(System.in);
	
	int n,element,low,high,mid,position;
	int[] a = new int[100];
	
	void read()
	{
		System.out.println("Enter the no:of items:");
		n = sc.nextInt();
		
		System.out.println("Enter the array elements:");
		for(int i = 0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element to search:");
		element = sc.nextInt();
	}
	
	void search()
	{
		low = 0;
		high = n-1;
		while(low<=high)
		{
			mid = (low+high)/2;
			if(element==a[mid])
				position = mid+1;
			if(element<a[mid])
				high=mid-1;
			else
				low = mid+1;
		}
		
	}
	
	void display()
	{
		if(position>0)
			System.out.println("Element found at position:"+position);
		else
			System.out.println("Element not found");
	}
	
}

class BinarySearchTester{
	public static void main(String[] args){
		
		System.out.println("mms");
		
		BinarySearch b = new BinarySearch();
		b.read();
		b.search();
		b.display();
		
		System.out.println("mme");
	}
}