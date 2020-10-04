class MobileTester{
	public static void main(String[] args){
		System.out.println("mms");
		
		Mobile m1 = new Mobile();
		m1.brandName = "vivo";
		m1.modelName = "z10";
		m1.color="gold";
		m1.hdd = 32;
		m1.primMem = 4;
		m1.price = 14000;
		m1.isDualSim = true;
		
		System.out.println(m1);
		System.out.println();
		
		System.out.println("Mobile details are: ");
		System.out.println(m1.brandName+"\n"+m1.modelName+"\n"+m1.color+"\n"+m1.hdd+"\n"+m1.primMem+"\n"+m1.price+"\n"+m1.isDualSim);
		
		Mobile m2 = new Mobile();
		m2.brandName = "vivo";
		m2.modelName = "z10";
		m2.color="gold";
		m2.hdd = 32;
		m2.primMem = 4;
		m2.price = 14000;
		m2.isDualSim = true;
		
		System.out.println(m2);
		System.out.println();
		
		System.out.println("Mobile details are: ");
		System.out.println(m2.brandName+"\n"+m2.modelName+"\n"+m2.color+"\n"+m2.hdd+"\n"+m2.primMem+"\n"+m2.price+"\n"+m2.isDualSim);
		
		System.out.println("mme");
	}
}