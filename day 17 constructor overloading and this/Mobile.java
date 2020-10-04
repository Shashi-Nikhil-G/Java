class Mobile{
	String brand;
	String model;
	int display;
	double price;
	int priMemory;
	int secMemory;
	boolean isDualSim;
	int camRes;
	
	Mobile(){
		System.out.println("Mobile Details are:");
	}
	
	Mobile(String brand, String model){
		this.brand = brand;
		this.model = model;
	}
	
	Mobile(String brand, String model, int priMemory, int secMemory){
		this.brand = brand;
		this.model = model;
		this.secMemory = secMemory;
	}
	
	Mobile(String brand, String model, int camRes){
		this.brand = brand;
		this.model = model;
		this.camRes = camRes;
	}
	
	Mobile(String brand, String model, int priMemory, int secMemory, int camRes, boolean isDualSim){
		this.brand = brand;
		this.model = model;
		this.priMemory = priMemory;
		this.secMemory = secMemory;
		this.camRes = camRes;
		this.isDualSim = isDualSim;
	}
	
	void getDetails(){
		System.out.println("brand="+this.brand+"\n"+"model="+this.model+"Primary memory="+this.priMemory+"\n"+this.secMemory+"\n"+"camRes="+this.camRes+"\n"+"isDualSim="+this.isDualSim);
}
}
