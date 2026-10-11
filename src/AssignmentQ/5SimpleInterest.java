package AssignmentQ;

import java.util.Scanner;

class SimpleInterest {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Simple Interest calculator \n");
         System.out.println("Please enter Principal amount Rs: ");
         int principal = input.nextInt();
         System.out.println("Now ,Tell me how many years are you borrowing money T: ");
         float T = input.nextFloat();
         System.out.println("Please,Tell me your rate of interest  R: ");
         float  R = input.nextFloat();

         double simpleInterest = (principal * T * R)/100;
         System.out.println("Simple Interest : "+ simpleInterest);
     }
}
