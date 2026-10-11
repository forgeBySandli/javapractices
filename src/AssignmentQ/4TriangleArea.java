package AssignmentQ;

import java.util.Scanner;

class TriangleArea {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Area Calculator \n");
         System.out.println("Area of Triangle \n");
         System.out.println("Please enter Base length in cm : ");
         double base = input.nextDouble();
         System.out.println("Please enter height in cm : ");
         double height = input.nextDouble();

         double area = 0.5 * base * height;
         System.out.println("The area of your triangle is: "+ area +"cms2");
     }
}
