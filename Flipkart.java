package Basic_Programs2;

public class Flipkart 
{
        Flipkart()
        {
                System.out.println("1st Cons");
        }
        Flipkart(int a)
        {
                System.out.println("2nd Cons");
        }
        Flipkart(int a,double b)
        {
                System.out.println("3rd Cons");
        }
        Flipkart(int a,double b,int c)
        {
                System.out.println("4th Cons");
        }
        Flipkart(int a,double b,double c)
        {
                System.out.println("5th Cons");
        }
        public static void main(String[] args) 
        {
                Flipkart f1=new Flipkart();
                Flipkart f2=new Flipkart(90);
                Flipkart f3=new Flipkart(41,96.3);
                Flipkart f4=new Flipkart(1,0.6,5);
                Flipkart f5=new Flipkart(0,0.7,0.6);
        }
}
