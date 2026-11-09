package Basic_Programs2;

class Animal // parent class
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog is Barking");
	}
}

class Cat extends Animal
{
	void meaw()
	{
		System.out.println("Cat is Meowing");
	}
}

public class HierarchicalInheritanceDemo
{
	public static void main(String [] args)
	{
		
		Dog d1=new Dog();
		d1.eat();
        d1.bark();


       Cat c1=new Cat();
       c1.eat();
       c1.meaw();
		
	}
}