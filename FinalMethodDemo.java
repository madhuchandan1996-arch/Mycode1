package Basic_Programs2;
class Parent //Parent class
{
 final void show()
 {
     System.out.println("This is a final method in Parent class");
 }
}

//Child class
class Child extends Parent
{// ❌ This will cause a compile-time error
    // void show()
    // {
    //     System.out.println("Trying to override final method");
    // }
 
}

//Main class
public class FinalMethodDemo
{
 public static void main(String[] args)
 {
     Child obj = new Child();
     obj.show();
 }
}
