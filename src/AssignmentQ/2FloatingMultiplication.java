package AssignmentQ;

import java.util.Scanner;

class FloatingMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are doing Float Multiplication\n");
        System.out.println("Please enter first  decimal number: ");
        double first = input.nextDouble();
        System.out.println("Now, please enter second decimal number: ");
        double second = input.nextDouble();

        double multiplication = first * second;
        System.out.println("\n Result is : " + multiplication);
    }
}
