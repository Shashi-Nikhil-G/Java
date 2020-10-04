class Car{
	String brand;
	String model;
	String color;
	double price;
	boolean isMusicSystem;
	int numOfAirbags;
	String accessories;	
	
	Car(){
		System.out.println("Car default constructor...");
	} 

	Car(String brand, String model, String color){
		this();
		System.out.println("3 param Car constructor");
		this.brand=brand;
		this.model=model;
		this.color=color;
	}

	Car(String brand, String model, String color, double price){
		this(brand,model,color); //calling one constructor 
					//from other constructor
		System.out.println("4 param Car constructor");
		this.price=price;
	}
	
	Car(String brand, String model, boolean isMusicSystem, int numOfAirbags){
		this(brand,model,"Defaultcolor");
		System.out.println("4 param Car constructor");
		this.isMusicSystem=isMusicSystem;
		this.numOfAirbags=numOfAirbags;
	}

	Car(String brand, String model, boolean isMusicSystem, 
				int numofAirbags, String accessories){
		System.out.println("5 param Car constructor");
		this.brand=brand;
		this.model=model;
		this.isMusicSystem=isMusicSystem;
		this.numOfAirbags=numOfAirbags;
		this.accessories=accessories;
	}

	void getCarDetails(){
		System.out.println("Car details are :");
		System.out.println(this.brand+"\n"+this.model+"\n"
				+this.color+"\n"+this.price+"\n"
			+this.numOfAirbags+"\n"+this.accessories);
		System.out.println("==");
	}
       
}