class Car{
	String brand;
	String model;
	String color;
	double price;
	boolean isMusicSystem;
	int numOfAirbags;
	String accessories;
	
	Car(){
		System.out.println("Car Details are:");
	}
	Car(String brand, String model, String color, double price){
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
	Car(String brand, String model, boolean isMusicSystem, int numOfAirbags){
		this.brand = brand;
		this.model = model;
		this.isMusicSystem =isMusicSystem;
		this.numOfAirbags = numOfAirbags;
	}
	
	Car(String brand, String model, boolean isMusicSystem, int numOfAirbags, String accessories){
		this.brand = brand;
		this.model = model;
		this.isMusicSystem = isMusicSystem;
		this.numOfAirbags = numOfAirbags;
		this.accessories = accessories;
	}
	
	void getDetails(){
		System.out.println("Brand="+this.brand+"\n"+"model="+this.model+"\n"+"numOfAirbags="+this.numOfAirbags+"\n"+"accessories="+this.accessories);
	}
}