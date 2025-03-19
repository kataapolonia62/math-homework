import java.util.Scanner;

public class MathHomework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println("The square of that number is " + Math.pow(num, 2));
    }
}
