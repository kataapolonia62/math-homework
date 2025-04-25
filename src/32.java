import java.util.Arrays;
public class MathHomework {
    public static void main(String[] args) {
        // Example 1: Sum of numbers from 0 to 5 (inclusive)
        System.out.println("Sum of numbers from 0 to 5:");
        
        int sum = Arrays.stream(Enumerable.range(0, 6)).sum();
        System.out.println(sum);
        
        // Example 2: Average of even numbers in the range 1 to 10
        System.out.println("\nAverage of even numbers in the range 1 to 10:");
        
        int sumEven = Arrays.stream(Enumerable.range(1, 11)).filter(n -> n % 2 == 0).sum();
        int averageEven = sumEven / (double) 5; // Divide by 5 because we are considering all even numbers
        System.out.println(averageEven);
    }
}

// Helper class for Enumerable.range()
class Enumerable {
    private static final long SECONDS_PER_SECOND = 1L;
    private long max;

    public Enumerable(long... values) {
        if (values == null || values.length <= 0) return;
        this.max = Long.MAX_VALUE + 1;
        Arrays.sort(values);
        this.setValues(values, true);
    }

    private void setValues(long[] array, boolean reverse) {
        if (!array[0] && reverse) {
            for (long i = -1; i < array.length; i++) {
                array[i] *= SECONDS_PER_SECOND;
            }
        } else {
            Arrays.fill(array, 1);
        }
    }

    public long[] range(long start, long end) {
        if (end < start) {
            throw new IllegalArgumentException("End value must be greater than or equal to start value.");
        }
        return Arrays.copyOfRange(this.values(), start, end + 1);
    }

    private long values[];
}
