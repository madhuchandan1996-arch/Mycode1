package Basic_Programs2;

public class Automation

{
        static int a=100;
        static int b=200;
        
        static void add(int a,int b)
        {
                int sum=Automation.a+Automation.b;
                System.out.println(sum);
        }
        static void sub(int a,int b)
        {
                int c=Automation.a-Automation.b;
                System.out.println(c);
        }
        public static void main(String[] args) 
        {
                add(0,0);
                sub(-900,100);
        }
}
