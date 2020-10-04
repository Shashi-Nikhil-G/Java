import java.util.Scanner;


public class Frequency {
		
		Scanner sc = new Scanner(System.in);
		
		int n,count,element;
		int a[];
		
		void read()
		{
			System.out.println("Enter the no:elements in the array:");
			n = sc.nextInt();
			
			System.out.println("Enter the array elements:");
			a = new int[n];
			for(int i = 0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			
			System.out.println("Enter an element to find frequency");
			element = sc.nextInt();
		}
		
		void find()
		{
			for(int i = 0;i<a.length;i++)
			{
				if(element==a[i])
					count++;
			}
		}
		
		void display()
		{
			if(count>0)
				System.out.println(element+" occurs"+count+" times");
			else
				System.out.println(element+" does not occurs");
		}
}



