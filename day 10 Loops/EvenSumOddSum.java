class EvenSumOddSum{
	public static void main(String[] args){
		System.out.println("mms");
		
		int evenSum=0;
		int oddSum=0;
		
		int i=0;
		while(i<=10){
			if(i%2==0)
				evenSum+=i;
			else
				oddSum+=i;
			i++;
		}
		System.out.println("EvenSum="+evenSum+"\n"+"OddSum="+oddSum);
		
		System.out.println("mme");
	}
}