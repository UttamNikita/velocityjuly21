package constructorproject;

public class constrctor4 
{
	int a =67;
	static int b = 23;
	public constrctor4 ( int c) 
	{
		a = 26;
		b = 32;
	}
	public static void main(String[] args)
	{
		 constrctor4 x =  new constrctor4(32);
		 System.out.println(x.a);
		 System.out.println(x.b);
		
		 
		
	}
	

}
