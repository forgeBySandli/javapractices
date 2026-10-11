package AssignmentQ;

import java.util.Scanner;

class Arithmetic8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Arithmetic Calculator\n");
        System.out.println("Please enter first number");
        int first = input.nextInt();
        System.out.println("Please enter second number");
        int second = input.nextInt();

        int add = first + second;
        int sub = first - second;
        int product = first * second;
        int divide = first / second;
        int mod = first % second;

        System.out.println("Addition is : "+ add);
        System.out.println("Subtraction is : "+ sub);
        System.out.println("Multiplication is : "+ product);
        System.out.println("Divide is : "+ divide);
        System.out.println("Mod is : "+ mod);


    }
}
