public class MathHomework {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                if(i % 2 == 0 && j % 3 == 0) {
                    sum += i * j;
                }
            }
        }
        System.out.println("The sum of the even numbers divisible by 3 is: " + sum);
    }
}
