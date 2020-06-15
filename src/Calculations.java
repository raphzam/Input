import java.util.Scanner;

public class Calculations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int firstNum = Integer.valueOf(input.nextLine());
        System.out.println("Enter another number: ");
        int secondNum = Integer.valueOf(input.nextLine());

        System.out.println("Sum : " + (firstNum + secondNum));
        System.out.println("Product : " + (firstNum * secondNum));


    }
}
