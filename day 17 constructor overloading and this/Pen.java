class Pen{
	String name;
	String type;
	double price;
	String color;
	int length;
	
	Pen(String name, String type, String color, double price){
		System.out.println("Pen constructor..");
		this.name=name;
		this.type=type;
		this.color=color;
		this.price=price;
	}
	Pen(){
		System.out.println("Pen deafult constructor..");
	}
	void getPenDetails(){
		System.out.println("Pen details are:");
		System.out.println(this.name+"\n"+this.type+"\n"+this.price+"\n"+this.color+"\n"+this.length);
		System.out.println("--------------------------");
	}
}