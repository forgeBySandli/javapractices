import java.util.Scanner;

public class Sum {
    public static void main(String[] agrs){
        Scanner input= new Scanner(System.in);
        System.out.println("enter first no.A: ");
        int numberA= input.nextInt();
        System.out.println("enter second no.B: ");
        int numberB= input.nextInt();

        int sum = numberA + numberB;
        System.out.println("Sum is: "+sum);
    }
}
