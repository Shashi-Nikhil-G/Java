import java.util.Scanner;

class WhileDemo{
	public static void main(String[] args){
		System.out.println("main method started..");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many times to print HI");
		int n = sc.nextInt();
		
		int i = 0;
		while(i<n){
			System.out.println("Hi");
			i++;
		}
		
		int j=10;
		while(j>0){
			System.out.println(j);
			j--;
		}
		
		System.out.println("Main method ended");
	}
}
		