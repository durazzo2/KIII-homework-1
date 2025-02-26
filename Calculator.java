public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }
    public double log(int a, int b) {
        if (a <= 0 || a == 1 || b <= 0) {
            throw new IllegalArgumentException("Base must be greater than 0 and not equal to 1, and number must be positive.");
        }
        return Math.log(b) / Math.log(a);
    }

}
