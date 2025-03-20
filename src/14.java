import java.util.Random;

class MathHomework {
  public static int getAnswer(int num1, int num2) {
    Random rand = new Random();
    int operator = rand.nextInt(4); // 0: +, 1: -, 2: *, 3: /
    switch (operator) {
      case 0:
        return num1 + num2;
      case 1:
        return num1 - num2;
      case 2:
        return num1 * num2;
      case 3:
        if (num2 == 0) {
          throw new IllegalArgumentException("Cannot divide by zero");
        }
        return num1 / num2;
    }
  }
}