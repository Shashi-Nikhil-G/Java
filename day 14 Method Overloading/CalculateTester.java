class CalculateTester{
	public static void main(String[] args){
		System.out.println("main method started..");
		
		Calculate c1 = new Calculate();
		double result = c1.calculatePercentage(45,67,78,83);
		System.out.println("Percentage="+result);

		result = c1.calculatePercentage(45,55,65,75,85,95,600);
		System.out.println("Percentage="+result);
		
		result = c1.calculatePercentage(45.00,55.00,65.00,73.00);
		System.out.println("Percentage="+result);

		System.out.println("main method ended..");
	
	}
}

