class BigItem{
	public static void main(String[] args){
		System.out.println("mms");
		
		int items[]={100,200,300,50,40};
		int big = items[0];
		
		for(int i=0;i<items.length;i++){
			if(items[i]>big){
				big=items[i];
			}
		}
		System.out.println("Biggest="+big);
		
		System.out.println("mme");
	}
}