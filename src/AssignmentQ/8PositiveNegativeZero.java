package AssignmentQ;

import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker\n");
        System.out.println("enter your number: ");
        int num = input.nextInt();
        if(num > 0){
            System.out.println("Given number is Positive.");
        }else if(num == 0 ){
            System.out.println("Given number is Zero.");
        }else{
            System.out.println("Given number is Negative.");
        }
    }
}
