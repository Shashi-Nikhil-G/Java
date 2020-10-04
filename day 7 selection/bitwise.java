class bitwise{
	public static void main(String[] args){
		int a=30, b=12;
		int res=a&b;
		System.out.println("and="+res);
		
		res=a|b;
		System.out.println("or="+res);
		
		res=~a;
		System.out.println("not="+res);
		
		int c=-4;
		res=~c;
		System.out.println("Result="+res);
	}
}