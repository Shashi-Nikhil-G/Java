import java.util.Scanner;

class Student{
	public static void main(String[] args){
		System.out.println("Main Method Started");
		
		Scanner sc=new Scanner(System.in);
		
		String studentName;
		int studentAge;
		double percentage;
		long phoneNumber;
		byte sem;
		boolean isGraduated;
		
		System.out.print("Enter the Student Name: ");
		studentName = sc.next();
			
		System.out.print("Enter the Student age: ");
		studentAge = sc.nextInt();
			
		System.out.print("Enter the Student Percentage: ");
		percentage = sc.nextDouble();
			
		System.out.print("Enter the Student Phone Number:");
		phoneNumber = sc.nextLong();
			
		System.out.print("Enter the Sem: ");
		sem = sc.nextByte();
		
		System.out.print("is student graduated:");
		isGraduated = sc.nextBoolean();
		
		System.out.printf("\n");
		System.out.println("Student Name: "+studentName);
		System.out.println("Student age: "+studentAge);
		System.out.println("Student Percentage: "+percentage);
		System.out.println("Phone Number: "+phoneNumber);
		System.out.println("Sem: "+sem);
		if(isGraduated)
			System.out.println("Student graduation Completed");
		else
			System.out.println("Student graduation Not Completed");
		
		System.out.println("Main Method Ended");
	}
}
