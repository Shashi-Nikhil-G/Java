class Student{
	String name;
	int rollNum;
	long phoneNumber;
	static String college;
	
	void attendClass(){
		System.out.println("aatending class....");
	}
	
	void attendExams(){
		System.out.println("attent exam...");
	}
	
	static void payExamFees(){
		System.out.println("paying fees..");
	}
	
	void getStudentDetails(){
		System.out.println("Student details are:");
		System.out.println(this.name+"\n"+this.rollNum+"\n"+this.phoneNumber+"");
	}
}