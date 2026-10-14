package AssignmentQ;

import java.util.Scanner;

class LeapYear {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Year Calculator.\n");
         System.out.println("Enter your Year.");
         int year = input.nextInt();

         if (year % 4 == 0){
             System.out.println("Your year is a leap year");
         }else if( year % 100 == 0){
             System.out.println("Your year is a leap year");
          }else if( year % 400 == 0) {
             System.out.println("Your year is a leap year");
         }else {
             System.out.println("Your year is not a leap year");
         }
     }
}
