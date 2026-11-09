package Basic_Programs2;

//Parent class
class Parent2
{
 Parent2()
 {
     System.out.println("Parent default constructor");
 }

 Parent2(int a)
 {
     System.out.println("Parent parameterized constructor: " + a);
 }
}

//Child class
class Child2 extends Parent2
{
 Child2()
 {
     this(10);   // calls current class parameterized constructor
     System.out.println("Child default constructor");
 }

 Child2(int x)
 {
     super(x);   // calls parent class parameterized constructor
     System.out.println("Child parameterized constructor: " + x);
 }
}

//Main class
public class SuperThisConstructorDemo
{
 public static void main(String[] args)
 {
     Child2 obj = new Child2();
 }
}

