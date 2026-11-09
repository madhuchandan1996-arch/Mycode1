package Basic_Programs2;

public class Globalvariable2
{
    static int a=100;     //global 
    int b=500;     //global 

    public static void main(String[] args) 
    {
      System.out.println(a);
      Globalvariable2 g1=new Globalvariable2();
      System.out.println(g1.b);
                    
    }
}

