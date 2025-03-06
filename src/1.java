import java.util.Random;

public class MathHomework {
    public static void main(String[] args) {
        Random rand = new Random();
        int number1 = rand.nextInt(10);
        int number2 = rand.nextInt(10);
        System.out.println("What is " + number1 + " x " + number2 + "?");
    }
}
