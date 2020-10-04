class StudentTester{
	public static void main(String[] args){
		System.out.println("mms");
		
		Student.college = "TJIT";
		
		Student s1 = new Student();
		s1.name = "Nikhil";
		s1.rollNum = 45;
		s1.phoneNumber = 78643484158l;
		
		
		Student s2 = new Student();
		s2.name = "Pavan";
		s2.rollNum = 2;
		s2.phoneNumber = 548676513248l;
		
		s1.getStudentDetails();
		s2.getStudentDetails();
		
		s1.payExamFees();	//this is not a standared practice
		Student.payExamFees();
		
		System.out.println(s1.college);
		
		Student.college ="KIT";
		System.out.println(s1.college);
		
		System.out.println("college="+Student.college);
		
		s1.college = "SKIT";
		System.out.println(Student.college);
		
		System.out.println("mme");
	}
}