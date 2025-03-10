import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(100);
        System.out.println("The random number is: " + randomNumber);
    }
}
