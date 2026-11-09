package Basic_Programs2;

public class Nonstaticvariable
{
    static int a=10;
    double b=3.5;
    public static void main(String[] args) 
    {
            a=25;//updated the value for a
            System.out.println(a);
            Nonstaticvariable n1=new Nonstaticvariable();
            System.out.println(n1.b=5.9);
            
            
            
    }
}


