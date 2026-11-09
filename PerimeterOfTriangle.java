package Basic_Programs2;

import java.util.Scanner;

public class PerimeterOfTriangle
{
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter Side 1:");
  double a= sc.nextDouble();
  System.out.println("Enter Side 2:");		  
  double b= sc.nextDouble();
  System.out.println("Enter Side 3:");
  double c= sc.nextDouble();
  
 double Perimeter =a+b+c;
 System.out.println("Perimeter of Triangle = " + Perimeter);
 sc.close();
}
}
