class LaptopTester{
	public static void main(String[] args){
		System.out.println("mms");
		
		Laptop l1 = new Laptop();		// l1 is the object reference variable
		l1.brandName = "HP";
		l1.modelName = "15gbr104tx";
		l1.display = 15;
		l1.processor = "i5";
		
		System.out.println("Laptop details are:");
		System.out.println("Brand Name = "+l1.brandName);
		System.out.println("Model Name = "+l1.modelName);
		System.out.println("Size of display = "+l1.display);
		System.out.println("Processcer = "+l1.processor);
		
		l1.executeProgram();
		l1.playGames();
		l1.browsing();
		
		System.out.println("mme");
	}
}