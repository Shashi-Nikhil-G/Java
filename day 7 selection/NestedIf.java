class NestedIf{
	public static void main(String[] args){
		int a=5,b=10,c=8;
		if(a>b)
		{
			if(a>c)
				System.out.println("Large="+a);
			else
				System.out.println("Large="+c);
		}
		else
		{
			if(b>c)
				System.out.println("Large="+b);
			else
				System.out.println("Large="+c);
		}
	}
}