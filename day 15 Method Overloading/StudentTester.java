class StudentTester{
	public static void main(String[] args){
		System.out.println("mms");
		
		Student st1 = new Student();
		st1.name = "Pavan";
		st1.gotoInstitute();
		System.out.println("-----------------");
		
		Student st2 = new Student();
		st2.name = "Sabeeha";
		
		Bus b1 = new Bus();
		b1.transName = "BMTC";
		b1.source = "Majestic";
		b1.dest = "Rajajinagar";
		b1.price = 15;
		st2.gotoInstitute(b1);
		System.out.println("-----------------");
		
		Bike bk1 = new Bike();
		bk1.brand = "HOnda";
		bk1.model = "dio";
		bk1.price=70000;
		bk1.numSeat=2;
		bk1.cc=100;
		st2.gotoInstitute(bk1);
		
		System.out.println("mme");
	}
}
