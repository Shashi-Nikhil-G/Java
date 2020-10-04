class Calculate{

double calculatePercentage(int m1, int m2, int m3, int m4){
	System.out.println("4 int param");
	double perc = (m1+m2+m3+m4)*100.00/400;
	return perc;
}

double calculatePercentage(double m1, double m2, double m3, double m4){
	System.out.println("4 int param");
	double perc = (m1+m2+m3+m4)*100.00/400;
	return perc;
}

double calculatePercentage(int m1, int m2, int m3, int m4, int m5, int m6, int max){
	System.out.println("6+1 int param");
	double perc = (m1+m2+m3+m4)*100.00/max;
	return perc;
}

double calculatePercentage(double m1, double m2, double m3, double m4, double m5, int max){
	System.out.println("5+1 double param");
	double perc = (m1+m2+m3+m4)*100.00/400;
	return perc;
}
}