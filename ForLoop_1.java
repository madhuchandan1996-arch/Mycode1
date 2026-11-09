package Basic_Programs2;
import java.util.Scanner;

public class ForLoop_1
{
        public static void main(String[] args) 
        {
        
                for(int i=0;i<3;i++)
                {
                        Scanner s1=new Scanner(System.in);
                        System.out.println("What is your name?");
                        String name= s1.next();
                        System.out.println("What is your age?");
                        int age= s1.nextInt();
                        System.out.println("What is your Salary?");
                        double salary=  s1.nextDouble();
                        
                }
        }
}