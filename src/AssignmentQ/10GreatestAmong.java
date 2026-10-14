package AssignmentQ;

import java.util.Scanner;

class GreatestAmong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to find the Greatest number identifier\n");
        System.out.println("Please enter your first number:");
        int first = input.nextInt();
        System.out.println("Please enter your second number: ");
        int second = input.nextInt();
        System.out.println("Now, enter your final number: ");
        int third = input.nextInt();

        if(first >= second && first >= third ){
            System.out.println(first + " First is greatest number.");
        } else if (second >= third  ){
            System.out.println(second + " Second is greatest number.");
        }else {
            System.out.println(third + " third is greatest number.");

        }

    }
}
