package constructorproject;

public class constructor1
{
	static int a = 50;
	int b = 60;
	           
	           constructor1(char f )
	           {
	        	   a = 20;
	        	   b = 15;
	           }
	           constructor1(int c )
	           {
	        	   a = 27;
	        	   b = 17;
	           }
	           constructor1()
	           {
	        	   a = 57; 
	        	   b = 65;
	           }

	           public static void main(String[] args) 
	           {
	        	   System.out.println(a);
	        	   
	        	   
	        	   constructor1 x = new constructor1();
	        	   System.out.println(x.b);
	        	   System.out.println(a);
	        	   
	        	   constructor1 y = new constructor1(45);
	        	   System.out.println(y.b);
	        	   System.out.println(a);
	        	   
	        	   constructor1 z = new constructor1('d');
	        	   System.out.println(z.b);
	        	   System.out.println(a); 
				
			}

}
