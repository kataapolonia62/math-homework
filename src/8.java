import java.util.*;
public class MathHomework {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = input.nextInt();
    System.out.println("The factorial of " + num + " is " + factorial(num));
  }
  public static int factorial(int n) {
    if (n == 0) return 1;
    else return n * factorial(n - 1);
  }
}
