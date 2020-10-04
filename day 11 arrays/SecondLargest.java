import java.util.Scanner;

class SecondLargest{
	public static void main(String[] args){
		System.out.println("mms");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no:of Items: ");
		int n = sc.nextInt();
		
		int[] items = new int[n];
		System.out.print("Enter the array elements: ");
		for(int i=0;i<n;i++)
		{
			items[i] = sc.nextInt();
		}
		
		int largest, second;
		if(items[0]>items[1])
		{
			largest = items[0];
			second = items[1];
		}
		else
		{
			largest = items[1];
			second = items[0];
		}
		
		for(int i=2;i<items.length;i++)
		{
			if(items[i]>largest)
			{
				second = largest;
				largest = items[i];
			}
			else if(second<items[i])
				second = items[i];
		}
		
		System.out.println("Largest = "+largest+"\n"+"second Largest = "+second);
		
		System.out.println("mme");
	}
}