class Pen{
	String color;
	String  name;
	double price;
	String type;
	
	void write(){
		System.out.println("writeing...");
	}
	
	void useAsScale(){
		
		System.out.println("using pen to draw a st line...");
	}
	
	void getPenDetails(){
		System.out.println("Pen details:");
		System.out.println(name+"\n"+color+"\n"+price+"\n"+type);
		System.out.println("====");
	}
}