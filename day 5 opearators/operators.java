class operators{
	public static void main(String[] args){
		int a=10,b=5;
		double x=10, y=5;	// x=10.0, y=5.0
		int res = 0;
		double result = 0;	//result=0.0
		
		res = a/b;	//2
		System.out.println("Result="+res);
		
		result =x/y;	//2.0
		System.out.println("Result="+result);
		
		//res = a/y;	//2    8byte data cannot put into 4byte
		
		result = a/b;	//2.0
		
		result = a/3;	//3.0
		
		System.out.println("result="+result);
		
		result = x/3;
		System.out.println("result="+result);
		
		}
	}