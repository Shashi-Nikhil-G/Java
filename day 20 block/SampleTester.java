class Sample{
	static int i;
	int j;
	
	static{
		i = 10;
		System.out.println("static block");
	}
	
	Sample(){
		i = 10;
		System.out.println("SampleDC....");
		
	}
	
	static{
		i= 25;
		System.out.println("i="+i);
	}
}

class SampleTester{
	public static void main(String[] args){
		System.out.println("mms");
		
		System.out.println("=====================");
		Sample s1 = new Sample();
		System.out.println("i="+Sample.i);
		Sample s2 = new Sample();
		
		System.out.println(Sample.i);
		
		System.out.println("mme");
	}
}