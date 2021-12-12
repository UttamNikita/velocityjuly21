package constructorproject;

public class constrctor5
{
int a =45;
static int b = 67;
public static void test()
{
	int a = 78;
	System.out.println(a);
}
public static void main(String[] args)
{
	System.out.println(b);
	System.out.println(constrctor5.b);
	test();
	constrctor5 x = new constrctor5();
	System.out.println(x.b);
	System.out.println(x.a);
	
}
}
