class MobileTester{
		public static void main(String[] args){
		System.out.println("mms");
		
		Mobile m1 = new Mobile();
		m1.getDetails();
		
		Mobile m2 = new Mobile("MI","Android");
		m2.getDetails();
		
		Mobile m3 = new Mobile("vivo","Android",4,32);
		m3.getDetails();
		
		Mobile m4 = new Mobile("oneplus","Android",64);
		m4.getDetails();
		
		Mobile m5 = new Mobile("Apple","iphone",8,64,64,true);
		m5.getDetails();
		
		System.out.println("mme");
		}
}