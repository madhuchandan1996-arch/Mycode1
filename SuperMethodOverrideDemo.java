package Basic_Programs2;
class Parent1  //Parent class
{
 void display()
 {
     System.out.println("This is Parent class display method");
 }
}

//Child class
class Child1 extends Parent1
{
 void display()
 {
     super.display();  // calling parent class method
     System.out.println("This is Child class display method");
 }
}

//Main class
public class SuperMethodOverrideDemo
{
 public static void main(String[] args)
 {
     Child1 obj = new Child1();
     obj.display();
 }
}

