package Basic_Programs2;

public class AdditionOneprogram
{
	
    static   void add(int a,int b) // local variable
      {
	       int c=a+b;            // local variable
	       System.out.println(c);
      }

	 void add(int a, double b) //local variable
	{
		    double c=a+b;          //local variable
		    System.out.println(c);
    }
	static void add(double a, int b)
	{
		    double c=a+b;        //local variable
		    System.out.println(c);  //local variable
    }
	 void add(double a, double b)
	{
		    double c=a+b;    //local variable
		    System.out.println(c);   //local variable
    }
 public static void main(String[] args)
{
	 
	 AdditionOneprogram a1= new AdditionOneprogram();
	 add(3,6);
	 a1.add(9,7.6);
	 add(3.5,4);
	 a1.add(3.5,7.6);

}
}
