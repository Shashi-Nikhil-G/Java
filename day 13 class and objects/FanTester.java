class FanTester{
	public static void main(String[] args){
		System.out.println("mms");
		
		Fan f1 = new Fan();
		
		f1.brandName = "LG";
		f1.color = "Brown";
		f1.blades = 3;
		f1.type = "celing";
		
		System.out.println("Brand Name = "+f1.brandName+"\n"+"Color = "+f1.color+"\n"+"No:of Blades = "+f1.blades+"\n"+"Type of fan = "+f1.type);
		
		String s = f1.stateOfFan("OFF");
		System.out.println("state of fan = "+s);
		
		if(s=="Fan is rotating"){
		int sp = f1.speed(3);
		System.out.println("Speed of fan = "+sp);
		}
		
		
		System.out.println("mme");
	
	}
}