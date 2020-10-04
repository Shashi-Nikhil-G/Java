import java.util.Scanner;

class FibonacciSeries{
	public static void main(String[] args){
		System.out.println("main method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of items in series");
		int n=sc.nextInt();
		int n1=0, n2=1;
		int res=0;
		
		System.out.println(n1+"\n"+n2);
		for(int i=0;i<n-2;i++)
		{
			res = n1+n2;
			System.out.println(res);
			n1 = n2;
			n2 = res;
		}
		
		System.out.println("main method ended");
	}
}