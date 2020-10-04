class CarTester{
	public static void main(String[] args){
		System.out.println("main method started..");
		
		Car c1 = new Car("Kia","Sonet","Blue");
		c1.getCarDetails();
		
		Car c2 = new Car("Tata","Nexon","Orange",1000000.00);
		c2.getCarDetails();
	}
}