import java.util.Scanner;

class Grades{
	public static void main(String[] args){
		System.out.println("mms");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no:of Subjects: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the Each Subject Marks:");
		int[] marks = new int[n];
		int sum=0;
		for(int i=0;i<marks.length;i++){
			marks[i] = sc.nextInt();
			sum+=marks[i];
		}
		
		double percentage;
		System.out.print("Enter the total Marks: ");
		int totalMarks=sc.nextInt();
		
		percentage = (sum*100.00)/totalMarks;
		System.out.println("Percentage="+percentage);
		
		System.out.println("mme");
	}
}