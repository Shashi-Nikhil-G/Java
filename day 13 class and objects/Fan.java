class Fan{
	String brandName;
	int blades;
	String color;
	String type;
	
	String res;
	String stateOfFan(String s)
	{
		
		if(s == "ON")
			res="Fan is rotating";
		if(s == "OFF")
			res="Fan is not roating";
		return res;
	}
	
	int speed(int s)
	{
		
		return s;
	}
	
}