import java.util.Scanner;

class Area{
	
	Scanner sc = new Scanner(System.in);
	
	int side,width,breadth;
	float base,heigth;
	
	int area(int a)
	{
		return a*a;
	}
	
	int area(int w,int b)
	{
		return w*b;
	}
	
	double area(float b,float h)
	{
		return (0.5*b*h);
	}
	
	void read(int k)
	{
		switch(k)
		{
			case 1:System.out.println("Enter the side:");
					side = sc.nextInt();
					System.out.println("Area of square:"+area(side));
					break;
			case 2:System.out.println("Enter width and breadth:");
					width = sc.nextInt();
					breadth = sc.nextInt();
					System.out.println("Area of rectangle:"+area(width,breadth));
					break;
			case 3:System.out.println("Enter base and heigth:");
					base = sc.nextFloat();
					heigth = sc.nextFloat();
					System.out.println("Area of tringle:"+area(base,heigth));
					break;
			default:System.out.println("worng choice");
		}
	}
	
	void menu()
	{
		System.out.println("1.Find area of a square");
		System.out.println("2.Find area of a rectangle");
		System.out.println("3.Find area of a tringle");
		System.out.println("Enter your choice:");
	}
}

class AreaTester{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("mms");
		
		Area a = new Area();
		int choice;

			a.menu();
			choice = sc.nextInt();
			a.read(choice);
		
		System.out.println("mme");

	}
}