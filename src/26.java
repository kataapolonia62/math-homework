public class MathHomework {
    public static void main(String[] args) {
        // Example 1: Basic arithmetic operations
        System.out.println("3 + 5 = " + (3 + 5));  // Output: 8

        // Example 2: Comparison and assignment
        int age = 18;
        if (age >= 18) {
            System.out.println("You are old enough to vote.");
        } else {
            System.out.println("You are not old enough to vote.");
        }

        // Example 3: Looping through a sequence
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                System.out.println("Even index: " + i);
            }
        }

        // Example 4: Using arrays and loops
        String[] fruits = {"apple", "banana", "orange"};
        for (String fruit : fruits) {
            System.out.println(fruit);  // Output: apple, banana, orange
        }

        // Example 5: Conditional statements
        boolean isPrime = true;
        if (isPrime) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not prime.");
        }
    }
}
