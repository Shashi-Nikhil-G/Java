import java.util.Scanner;

class Smallest{
	public static void main(String[] args){
		System.out.println("mms");
		
		Scanner sc = new Scanner(System.in);
		int i;
		
		System.out.print("Enter the no:of items: ");
		int n = sc.nextInt();
		
		int[] items = new int[n];
		System.out.print("Enter the array elements: ");
		for(i=0;i<n;i++)
		{
			items[i] = sc.nextInt();
		}
		
		int small = items[0];
		for(i=0;i<n;i++)
		{
			if(items[i]<small)
				small = items[i];
		}
		System.out.println("Smallest = "+small);
		
		System.out.println("mme");
	}
}