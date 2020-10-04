class Student{
	String name;
	
	
	void gotoInstitute(){
		System.out.println("by Walkin...");
	}
	
	void gotoInstitute(Bus b){
		System.out.println("Going by bus...");
		b.getBusDetails();
	}
	
	void gotoInstitute(Bike bk){
		System.out.println("Going to institute using Bike");
		bk.getBikeDetails();
	}
}