package Basic_Programs2;

public class AndOperator
{

	public static void main(String[] args)
	{
		int a =10;
		int b=20;
		int c=30;
		
		if(a>10 && b==20) // false,true---> false
		{
			System.out.println("Case 1"); // Not execute
		}
		if(a>10 || b==20) // false,true--->true
		{
			System.out.println("Case 2"); //execute
		}
		if(!(a>10 && b==20)) // false,true---->true
		{
			System.out.println("Case 3"); //execute
		}
		if(!(a>10 || b>=20))  // false,true----> false
		{
			System.out.println("Case 4"); //Not execute
		}
		
		
	}
}
