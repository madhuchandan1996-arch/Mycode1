package Basic_Programs2;

public class Switch_Case3
{

	public static void main(String[] args)
	{
      char browser='x';
      switch(browser)
      {
          case 'c':
    	  System.out.println("Chrome Browser");
    	  break;
    	  
          case 'f':
          System.out.println("Firefox browser");
          break;
      
           case 'e':
    	   System.out.println("Edge Browser");
           break;
           
           default:
           System.out.println("Your selection is wrong");
      }
	}
}
