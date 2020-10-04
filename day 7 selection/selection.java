class selection{
	public static void main(String[] args){
		System.out.println("main method started");
		
		System.out.println("if-else");
		int age = 15;
		if(age>=18){
			System.out.println("Issue the voter ID");
		}
		else{
			System.out.println("You need to wait till 18");
		}

		System.out.println("else-if");
		double percentage=45;
		
		if(percentage>=75){
			
			System.out.println("ECD");
		}
		else if(percentage>=60 && percentage<70){
			System.out.println("FC");
		}
		else if(percentage>=50 && percentage<60){
			System.out.println("SC");
		}
		else if(percentage>=35 && percentage<50){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}
		
		System.out.println("nested-if");
		//nested if
		int n1=10, n2=15, n3=-5;
		if(n1>n2){
			if(n1>n3){
				System.out.println("Big="+n1);
			}
			else{
				System.out.println("Big="+n3);
			}
		}
		else{
			if(n2>n3){
				System.out.println("Big="+n2);
			}
			else{
				System.out.println("Big="+n3);
			}
		}
		System.out.println("Main method ended");
	}
}