package Basic_Programs2;

public class Final_Example
{
    // Global (instance) final variable
    final int a = 100;

    public static void main(String[] args)
    {
        Final_Example r1 = new Final_Example();

        // Local final variable
        final int b = 50;

        System.out.println(r1.a); // global final variable
        System.out.println(b);    // local final variable
    }
}
