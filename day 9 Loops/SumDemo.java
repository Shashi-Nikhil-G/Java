import java.util.Scanner;
class SumDemo{
	public static void main(String[] args){
		System.out.println("main method started..");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{
			sum = sum+1;
		}
		System.out.println("Result="+sum);
		
		int prod=1;
		for(int i=1;i<=5;i++)
		{
			prod=prod*i;
		}
		System.out.println("Product="+prod);
		
		System.out.println("main method ended");
	}
}