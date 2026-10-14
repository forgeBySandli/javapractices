package AssignmentQ;

import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Compound Interest calculator \n");
        System.out.println("Please enter Principal amount Rs: ");
        int principal = input.nextInt();
        System.out.println("Now ,Tell me how many years are you borrowing money T: ");
        float years = input.nextFloat();
        System.out.println("Please,Tell me your rate of interest  R: ");
        float  R = input.nextFloat();

        double CompoundInterest = principal * Math.pow((1 + R/100),years);
        System.out.println("Your compound interest  is Rs: " +  CompoundInterest);
    }
}
