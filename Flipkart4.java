package Basic_Programs2;

class Flipkart4
{
        Flipkart4(char a)
        {
             //   this();
                System.out.println("3rd Cons");
        }
        Flipkart4()
        {
                System.out.println("4th Cons");
        }
}
public class Flipkart4 extends Flipkart4
{
        
        Flipkart4()
        {
                super('D');
                System.out.println("2nd Cons");
        }
        Flipkart4(int a)
        {
           //     this();
                System.out.println("1st Cons");
        }
        public static void main(String[] args) 
        {
                new Flipkart4(100);
        }
}

       