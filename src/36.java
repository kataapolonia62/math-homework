public class MathHomework {
    public static void main(String[] args) {
        // Example Java code to solve math problems.
        double x = 3.5;
        double y = 4.0;
        double z = 2.0;

        System.out.println("x + y = " + (x + y));
        System.out.println("y * z = " + (y * z));

        // Additional math problems
        MathHomework example = new MathHomework();
        example.addProblem(4, 6);
        example.addProblem(-10, -2);
    }

    private void addProblem(double a, double b) {
        System.out.println("Adding " + a + " and " + b + ": " + (a + b));
    }
}
