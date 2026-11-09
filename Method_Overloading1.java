package Basic_Programs2;
public class Method_Overloading1
{
	static void add(int a,int b)    //local variable
	        {
	                int c=a+b;//local variable
	                System.out.println(c);
	        }
	         void add(int a,double b)//local variable
	        {
	                double c=a+b;//local variable
	                System.out.println(c);
	        }
	         static void add(double a,int b)//local variable
	        {
	                double c=a+b;//local variable
	                System.out.println(c);
	        }
	         void add(double a,double b)//local variable
	        {
	                double c=a+b;//local variable
	                System.out.println(c);
	        }
	        public static void main(String[] args) 
	        {
	        	Method_Overloading1  a1=new Method_Overloading1();
	                a1.add(3.6,5.9);
	                add(3.5,5);
	                a1.add(3.6,5.9);
	                add(3,5);
	        }
}
	    
	                    
	 
