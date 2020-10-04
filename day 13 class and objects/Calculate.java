class Calculate{
	
	void greeting(){
		System.out.println("Hello Good morning...");
	}
	
	double calculatePercentage(int m1, int m2, int m3, int m4){
		double perc = 0;
		perc = (m1+m2+m3+m4)*100.00/400;		
		return perc;
	
	}
	
	double findSquare(int n){
		
		return (n*n);
	}
	
	boolean checkNumEvenOrOdd(int num){
		
		if(num%2==0)
			return true;
		else
			return false;
	}
	
	char[] rainbowColors(){
		char rainbow[] = {'V','I','B','G','Y','O','R'};
		return rainbow;
		
	}
	
	double power(double n, int p){
		double res = 1;
		if(p>0){
			while(p>0){
				res*=n;
				p--;
			}
		}
		else if(p<0){
			while(p<0){
				res = res*(1/n);
				p++;
			}
		}
		else
			res = 1;
		
		return res;
		
	}	
}
