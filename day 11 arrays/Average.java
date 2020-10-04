import java.util.Scanner;

class Average{
	public static void main(String[] args){
		System.out.println("mms");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no:of array elements: ");
		int n = sc.nextInt();
		
		int sum=0;
		System.out.print("Enter the array elements: ");
		int[] items = new int[n];
		for(int i=0;i<n;i++)
		{
			items[i] = sc.nextInt();
			sum+=items[i];
		}
		
		int average;
		average = sum/items.length;
		
		System.out.println("sum = "+sum+"\n"+" average = "+average);
		
		System.out.println("mme");
	}
}