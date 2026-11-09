package Basic_Programs2;
import java.util.Scanner;

public class HumanInput 
{
        public static void main(String[] args) 
        {
                Scanner s1=new Scanner(System.in);//calling parametrized constructor
                
                int a= s1.nextInt();
                int b= s1.nextInt();
                
                int sum=a+b;
                System.out.println(sum);
                
                s1.close();
                
        }
}
