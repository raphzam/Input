import java.util.Scanner;

public class SameLine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");
        String first = input.nextLine();

        System.out.print("Input: ");
        String second = input.nextLine();

        System.out.println(first + " " + second);
    }
}
