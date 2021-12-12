package constructorproject;

public class contructor6
{
	static int a = 076;
	int b = 48;
	int c = 75;
	contructor6()
	{
		
	}
	contructor6 (int g, char t)
	{
		a = 544;
		b = 790; 
		c = 946;
	}
	contructor6 (char e, int d)
	{
		a = 4783;
		b = 9002; 
		c = 4668;
	}
	contructor6(int d)
	{
		a = 9443;
		b = 9750; 
		c = 4652;
	}
	contructor6(char k)
	{
		a = 444;
		b = 980; 
		
	}
	public static void main(String[] args)
	{
		contructor6 x = new contructor6 ();
		System.out.println(x.a);
		System.out.println(x.b);
		System.out.println(x.c);
		
		contructor6 y = new contructor6 (50, 's');
		System.out.println(y.a);
		System.out.println(y.b);
		System.out.println(y.c);
		
		contructor6 z = new contructor6 ('d', 43);
		System.out.println(z.a);
		System.out.println(z.b);
		System.out.println(z.c);
		
		contructor6 f= new contructor6 (50);
		System.out.println(f.a);
		System.out.println(f.b);
		System.out.println(f.c);
		
		contructor6 h = new contructor6 ('c');
		System.out.println(h.a);
		System.out.println(h.b);
		System.out.println(h.c);
		}}


