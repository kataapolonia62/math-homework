public class MathHomework {
  public static void main(String[] args) {
    System.out.println("Solve for x in the equation 2x + 5 = 11");
    double x = solveEquation(2, 5, 11);
    System.out.println("The solution is: " + x);
  }

  private static double solveEquation(double a, double b, double c) {
    return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
  }
}
