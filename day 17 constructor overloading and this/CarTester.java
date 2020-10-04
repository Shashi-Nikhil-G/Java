class CarTester{
		public static void main(String[] args){
		System.out.println("mms");
		
		Car c1 = new Car();
		c1.getDetails();
		
		Car c2 = new Car("kia","sonet","black",500000);
		c2.getDetails();
		
		Car c3 = new Car("maruthi","i10",true,4,"Available");
		c3.getDetails();
		
		Car c4 = new Car("innova","null",false,3,"Available");
		c4.getDetails();
		
		
		
		System.out.println("mme");
	}
}