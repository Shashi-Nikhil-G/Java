class CalculateTester{
	public static void main(String[]args){
		System.out.println("mms");
		
		Calculate c1 = new Calculate();
		c1.greeting();			//method call or function call
		
		double result = c1.calculatePercentage(40,50,60,70);
		System.out.println("Result = "+result);
		
		double n = c1.findSquare(5);
		System.out.println("Square = "+n);
		
		boolean isEven = c1.checkNumEvenOrOdd(5);
		System.out.println("Is Given Number is Even = "+isEven);
		
		char[] r = c1.rainbowColors();
		for(int i=0;i<r.length;i++){
			System.out.println(r[i]);
		}
		
		double p = c1.power(2,-2);
		System.out.println("power = "+p);
		
		
		
		System.out.println("mme");
	}
}