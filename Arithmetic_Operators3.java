package Basic_Programs2;

public class Arithmetic_Operators3
{
	
	public static void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
public	static void sub()
	{
		int a=10;
		int b=200;
		int c=b-a;
		System.out.println(c);
	}
public	static void mul()
	{
		int a=10;
		int b=20;
		int c=b*a;
		System.out.println(c);
	}
public	static void div()
	{
		int a=10;
		int b=200;
		int c=b/a;
		System.out.println(c);
	}
	
public	static void mod()
	{
		int a=10;
		int b=29;
		int c=b%a;
		System.out.println(c);
	}
	

	public static void main(String[] args)
	{
         System.out.println("Start of the main method");
         add();
         sub();
         mul();
         div();
         mod();
         System.out.println("End of the main method");
	}

}
