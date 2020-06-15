import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");
        int num = Integer.valueOf(input.nextLine());

        System.out.println("Output: " + (num * num));
    }
}
