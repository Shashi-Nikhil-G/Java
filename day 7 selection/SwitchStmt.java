import java.util.Scanner;

class SwitchStmt{
	public static void main(String[] args){
		
		System.out.println("Enter the grade:");
		Scanner sc = new Scanner(System.in);
		char grade = sc.next().charAt(0);
		switch(grade)
		{
			case 'A':System.out.println("Excellent");
					break;
			case 'B':System.out.println("Well done");
					break;
			case 'C':System.out.println("You passed");
					break;
			case 'D':System.out.println("Better try again");
					break;
			default: System.out.println("Invalid grade");
					return;
		}
		
		System.out.println("Your grade = "+grade);
	}
}