package Basic_Programs2;

public class NestedIfElse_3
{

	public static void main(String[] args)
	{
        int a=10;
        int b=20;
        int c=30;
        
        if(a<b)  //true
        {
        	System.out.println("1");
       
		      if(a!=b) //true
		      {
		        System.out.println("2");
		      }
        }
		
		 else
		 {
		   System.out.println("3");   
		 }
	}
}
	