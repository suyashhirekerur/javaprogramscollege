
class DivisionException extends Exception {

    DivisionException(String message) {
        super(message);
    }
}

class Calculator {

    static int divide(int a, int b) throws
            DivisionException {
        if (b == 0) {
            throw new DivisionException("Cannot divide by zero");
        }
        return a / b;
    }
}

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        try {
            int result = Calculator.divide(10, 0);
            System.out.println("Result: " + result);
        } catch (DivisionException e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
}
