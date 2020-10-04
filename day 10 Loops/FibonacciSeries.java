import java.util.Scanner;
class FibonacciSeries{
	public static void main(String[] args){
		System.out.println("mms");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the No: of Series Required:");
		int n= sc.nextInt();
		
		int n1=0,n2=1;
		System.out.print(n1+"\t"+n2+"\t");
		
		int i=0;
		int sum=0;
		while(i<n-2){
			sum = n1+n2;
			System.out.print(sum+"\t");
			n1=n2;
			n2=sum;
			i++;
		}
		
	}
}