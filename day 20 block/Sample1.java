class Sample1{
	static int i;
	int j;

	static{
		i=10;
		//j=20;  //error, nonstatic var (j) cant be accessed 
			// in static blocks
		System.out.println("static block1...");
	}
	
	Sample1(){
		System.out.println("Sample DC...");
		//init default values to dm's
	}

	static{
		i=25;
		System.out.println("static block2...");
	}
}

class SampleTester1{
	public static void main(String[] args){
		System.out.println("mms");
			
		Sample1 s1 = new Sample1();
		System.out.println("i="+Sample1.i);
		Sample1 s2 = new Sample1();
		
		System.out.println("mme");
	}
}