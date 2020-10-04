import java.util.Scanner;

class readinput{
	public static void main(String[] args){
		System.out.println("main method started..");
		
		Scanner sc = new Scanner(System.in);	//object creation
		
		System.out.println("Enter int number");
		int n1 = sc.nextInt();
		System.out.println("int number="+n1);
		
		System.out.println("Enter double number");
		double n2 = sc.nextDouble();
		System.out.println("double number="+n2);
		
		System.out.println("Enter the long number:");
		long phoneNumber = sc.nextLong();
		System.out.println("Phone number="+phoneNumber);
		
		System.out.println("Enter the charecter:");
		char ch = sc.next().charAt(0);
		System.out.println("charecter="+ch);
		
		System.out.println("Enter String data(name)");
		String name = sc.next();
		System.out.println("Name="+name);
		
		System.out.println("Main method ended");
	}
}