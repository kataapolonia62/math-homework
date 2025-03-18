import java.util.Random;

public class MathHomework {
    public static void main(String[] args) {
        Random rand = new Random();
        int number1 = rand.nextInt(10);
        int number2 = rand.nextInt(10);
        int sum = number1 + number2;
        System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);
    }
}
