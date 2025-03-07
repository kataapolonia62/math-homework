import java.util.Random;

public class MathHomework {
    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);

        System.out.println("What is " + num1 + " + " + num2 + "?");

        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if (answer == num1 + num2) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + (num1 + num2));
        }
    }
}
