import java.util.Scanner;

class Ascending{
	public static void main(String[] args){
		System.out.println("mms");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no:of array elements: ");
		int n = sc.nextInt();
		
		System.out.print("Enter the array elements: ");
		int[] items = new int[n];
		for(int i=0;i<n;i++)
		{
			items[i] = sc.nextInt();
		}
		
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(items[i]>items[j])
				{
					temp = items[i];
					items[i] = items[j];
					items[j] = temp;
				}
			}
		}
		
		System.out.println("Elements after soorting in ascending order: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(items[i]+" ");
		}
		System.out.print("\n");
		
		System.out.println("mme");
	}
}