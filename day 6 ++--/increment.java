class increment{
	public static void main(String[] args){
		int a=10;
		int x=-5;
		int res=0;
		
		//post increment
		res = a++;
		System.out.println("Result="+res);
		
		//pre increment
		res = ++a;
		System.out.println("Result="+res);
		
		res = ++x+a++;
		System.out.println("Result="+res);
		
		res = x++ + (++x);
		System.out.println("Result="+res);
		res = ++a + (++x);
		System.out.println("Result="+res);
		
		int i=7, j=0;
		int output = 0;
		
		output = i-- + --j;
		System.out.println("output1="+output);
		
		output = i*--i;
		System.out.println("output2="+output);
		output=--j+--i;
		System.out.println("output3="+output);
		
		output=--j - i--;
		System.out.println("output4="+output);
	}
}