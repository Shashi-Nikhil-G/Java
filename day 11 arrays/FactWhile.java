import java.util.Scanner;

class FactWhile{
	public static void main(String[] args){
		System.out.println("mms");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		
		int fact=1;
		int i=n;
		while(i>0){
			fact = fact*i;
			i--;
		}
		System.out.println("Factorial of "+n+" is = "+fact);
		
		System.out.println("mme");
	
	}
}