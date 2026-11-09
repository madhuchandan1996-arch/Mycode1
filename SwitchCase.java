package Basic_Programs2;

import java.util.Scanner;

public class SwitchCase
{
        public static void main(String[] args) 
        {
                //int input=100;//this input should come at run time
                Scanner s1=new Scanner(System.in);
                System.out.println("Please enter 1 for Chrome");
                System.out.println("Please enter 2 for firefox");
                System.out.println("Please enter 3 for Edge");
                System.out.println("Please enter 4 for Safari");

                int value= s1.nextInt();
                switch(value)
                {
                case 1: System.out.println("Chrome Browser");//launch chrome browser
                                break;
                case 2:System.out.println("Firefox browser");//launch Firefox browser
                                break;
                case 3:System.out.println("Edge Browser");//launch edge browser
                                break;
                case 4:System.out.println("Safari Browser");//launch edge browser
                                break;                
                default:        
                        System.out.println("your selection is wrong");
                        
                        s1.close();
                
                }
        }
}
