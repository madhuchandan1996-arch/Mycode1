package Basic_Programs2;

public class Logical_operators
{

	public static void main(String[] args)
	{
		
	  int a=10;
	  int b=20;
	  int c=30;
	  
	  if(a>b && b==20)
	  {
		  System.out.println("Case 1");
	  }
		if(a>10 || b==20)
		{
			System.out.println("Case 2");
		}
		if(!(a>10 && b==20))
		{
			System.out.println("Case 3");
		}
		if(!(a>10 || c>=40))
		{
			System.out.println("Case 4");
		
		}
		
	}

}
