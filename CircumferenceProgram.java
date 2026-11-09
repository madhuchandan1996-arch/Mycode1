package Basic_Programs2;

import java.util.Scanner;

public class CircumferenceProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // -------- Circle --------
        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();

        double circleCircumference = 2 * 3.14 * radius;
        System.out.println("Circumference of Circle: " + circleCircumference);

        // -------- Triangle --------
        System.out.println("Enter the three sides of the triangle:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double triangleCircumference = a + b + c;
        System.out.println("Circumference of Triangle: " + triangleCircumference);

        sc.close();
    }
}

