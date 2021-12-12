package constructorproject;

public class cons7
{
	static int a = 32;
	int b = 42;
	int c = 65;
	cons7()
	{
		
	}
	cons7 (int t, char a)
	{
		 a = 544;
		 b = 79; 
		 c = 946;
	}
	cons7 (char g, int a)
	{
		 a = 4783;
		 b = 9002; 
		 c = 4668;
	}
	cons7(int a)
	{
		 a = 9443;
		 b = 9750; 
		 c = 4652;
	}
	cons7(char a)
	{
		 a = 444;
		 	b = 980; 
		
		
	}
	public static void test()
	{
		int a = 56;
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		int d = 73;
		System.out.println(d);
		test();
		cons7 x = new cons7 ();
		System.out.println(x.a);
		System.out.println(x.b);
		System.out.println(x.c);
		
		cons7 y = new cons7 (50, 's');
		System.out.println(y.a);
		System.out.println(y.b);
		System.out.println(y.c);
		
		cons7 z = new cons7 ('d', 43);
		System.out.println(z.a);
		System.out.println(z.b);
		System.out.println(z.c);
		
		cons7 f= new cons7 (50);
		System.out.println(f.a);
		System.out.println(f.b);
		System.out.println(f.c);
		
		cons7 h = new cons7 ('c');
		System.out.println(h.a);
		System.out.println(h.b);
		System.out.println(h.c);
		}}




