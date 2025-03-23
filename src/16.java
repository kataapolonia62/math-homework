public class MathHomework {
    public static void main(String[] args) {
        int sum = 0;
        int average = 0;

        // Example of basic arithmetic operations

        System.out.println("Example: 5 + 3 equals " + (sum += 5 + 3));  // 8
        System.out.println("Example: 7 - 2 equals " + (average -= 7 - 2));  // 1.0
        System.out.println("Example: 9 * 4 equals " + (product *= 9 * 4));  // 36

        // More complex operations can be added here
    }

    public static int product(int a, int b) {
        return a * b;
    }
}
