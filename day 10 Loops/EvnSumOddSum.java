
class EvnSumOddSum{
	static public void main(String[] args){
		System.out.println("mms");
		
		int evenSum = 0;
		int oddSum = 0;
		for(int i=0;i<=10;i++){
			if(i%2==0)
				evenSum+=i;
			else
				oddSum+=i;
		}
		System.out.println("evenSum="+evenSum+"\n"+"oddSum="+oddSum);
		
		System.out.println("mme");
	}
}