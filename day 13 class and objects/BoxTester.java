class BoxTester{
	public static  void main(String[] args){
		System.out.println("mms");
		
		Box b = new Box();
		b.height = 20;
		b.width = 20;
		b.depth = 20;
		
		System.out.println("Height = "+b.height+"\n"+"Width = "+b.width+"\n"+"depth = "+b.depth);
		
		double a = b.area();
		System.out.println("area of box = "+a);
		
		double v = b.volume();
		System.out.println("volume of  box = "+v);
		
		System.out.println("mme");
	}
}