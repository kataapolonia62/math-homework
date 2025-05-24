import java.util.Random;

public class MathHomework {
    private static final int NUMBERS = 10; // Number of random numbers to generate

    public void main() throws Exception {
        Random rand = new Random();
        for (int i = 0; i < NUMBERS; i++) {
            System.out.println("Random number: " + rand.nextInt(10) + " - " + rand.nextInt(10));
        }
    }
}
