import java.util.Scanner;

class Relational{
	public static void main(String[] args){
		System.out.println("mms");
		

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a and b:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Enter the relation to be find:");
		System.out.println("Enter the realation present only in brackets:"+"\n"+"[ <, >, <=, >=, ==, != ]");
		String o = sc.next();
		
		
			
		switch(o)
		{
			case ">": if(a>b)
						System.out.println("a is greater then b");
					 
					  break;
			case "<": if(a<b)
						System.out.println("a is lesser then b");
					break;
			case "<=": if(a<=b)
						System.out.println("a is lesser then or equal to b");
					break;
			case ">=": if(a>=b)
						System.out.println("a is greater then or equal to b");
					break;
			case "==": if(a==b)
						System.out.println("a is equal to b");
					break;
			case "!=": if(a!=b)
						System.out.println("a is not equal to b");
					break;
			
			default:System.out.println("Invalid input or worng operation");
					
					return;
		}
		

		
		System.out.println("mme");
	}
}