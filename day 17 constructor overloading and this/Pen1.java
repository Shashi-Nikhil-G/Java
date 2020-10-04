class Pen1{
	String name;
	String type;
	double price;
	String color;	
	int length;

	Pen1(String name, String type, String color, double price){
		System.out.println("Pen constructor..");
		this.name=name;
		this.type=type;
		this.color=color;
		this.price=price;
	}

	Pen1(String type){
		System.out.println("1-param Pen constructor..");
		this.type=type;
	}

	Pen1(int length){
		System.out.println("1-param Pen(int) constructor..");
		this.length=length;
	}

	void getPenDetails(){
		System.out.println("Pen details are :");
		System.out.println(this.name+"\n"+this.type+"\n"+
				this.price+"\n"+this.color+"\n"
				+this.length);
		System.out.println("----");
	}
	

}