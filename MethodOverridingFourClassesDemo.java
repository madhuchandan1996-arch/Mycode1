package Basic_Programs2;

//Grandparent class
class Vehicle
{
 void speed()
 {
     System.out.println("Vehicle has a general speed");
 }
}

//Parent class
class Car extends Vehicle
{
 void speed()
 {
     System.out.println("Car speed is 120 km/h");
 }
}

//Child class
class SportsCar extends Car
{
 void speed()
 {
     System.out.println("SportsCar speed is 250 km/h");
 }
}

//Sub-child class
class SuperSportsCar extends SportsCar
{
 void speed()
 {
     System.out.println("SuperSportsCar speed is 350 km/h");
 }
}

//Main class
public class MethodOverridingFourClassesDemo
{
 public static void main(String[] args)
 {
     Vehicle v= new Vehicle();
     v.speed();

     Car c = new Car();
     c.speed();

     SportsCar s= new SportsCar();
     s.speed();

     SuperSportsCar s1= new SuperSportsCar();
     s1.speed();
 }
}
