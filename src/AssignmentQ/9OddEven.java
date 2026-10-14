package AssignmentQ;

import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd/Even Calculator");
        System.out.println("Enter your number: ");
        int num = input.nextInt();

        if( num % 2 == 0){
            System.out.println("Your number is Even");
        }else{
            System.out.println("Your number is Odd");
        }
    }
}
