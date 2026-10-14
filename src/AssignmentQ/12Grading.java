package AssignmentQ;

import java.util.Scanner;

class Grading {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Grade Calculator\n ");
         System.out.println("Please enter your percentage: ");
         float percentage = input.nextFloat();
         if(percentage >= 90){
             System.out.println("Great,You have got A");
         } else if (percentage >= 75) {
             System.out.println("You have got B");
         } else if (percentage >= 60) {
             System.out.println("You have got C,Work harder next time");
         } else if (percentage >=30) {
             System.out.println("You have got D,You seriously need to work");
         }else{
             System.out.println("Sorry, You have failed and got F");

         }

     }
}
