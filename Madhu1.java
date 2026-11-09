package Basic_Programs2;

public class Madhu1
{
    static void add()
    {
            System.out.println("Addition");
    }
    void sub()
    {
            System.out.println("Subtraction");
    }
    void mul()
    {
            System.out.println("Multiplication");
    }
    public static void main(String[] args) 
    {
            add();
            Madhu1 m=new Madhu1();//Syntax of creating an Object
            m.sub();//calling non static method
            m.mul();//calling non static method
    }
}
