import java.util.Scanner;

class Arithmatic{
	public static void main(String[] args){
		System.out.println("mms");
		
		Scanner sc = new Scanner(System.in);
		
		double res;
		
		System.out.println("Enter the value of a and b:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.println("Enter the operator mentioned only in brackets"+"\n"+"[ +, -, *, /, %]");
		
		System.out.println("Enter the operator to perform requried operation:");
		char o = sc.next().charAt(0);
		
		switch(o)
		{
			case '+':res = a+b;
					break;
			case '-':res = a-b;
					break;
			case '*':res = a*b;
					break;
			case '/':res = a/b;
					break;
			case '%':res = a%b;
					break;
			default:System.out.println("Invalid Input");
					return;
		}
		
		System.out.println("Result = "+res);
		
		System.out.println("mme");
	}
}