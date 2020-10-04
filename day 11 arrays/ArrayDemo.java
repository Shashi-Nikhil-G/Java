import java.util.Scanner;

class ArrayDemo{
	public static void main(String[] args){
		System.out.println("mms");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no:ofitems in array");
		int n=sc.nextInt();
		
		int[] marks = new int[n];
		
		System.out.println("Enter array items:");
		for(int i=0;i<n;i++){
			marks[i]=sc.nextInt();
		}
		
		System.out.println("Total items="+marks.length);
		System.out.println("Array elements are:");
		for(int i=0;i<n;i++){
			System.out.println(marks[i]);
		}
		
		char rainbow[] = {'v','i','b','g','y','o','r'};
		System.out.println("Rainbow Colors are:");
		for(int i=0;i<rainbow.length;i++){
			System.out.println(rainbow[i]);
		}
		
		
		System.out.println("mme");
	}
}