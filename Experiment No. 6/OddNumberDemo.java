
class OddNumberException extends Exception {

    OddNumberException(String message) {
        super(message);
    }
}

public class OddNumberDemo {

    static void checkNumber(int n) throws
            OddNumberException {
        if (n % 2 != 0) {
            throw new OddNumberException("Number is odd");
        }
        System.out.println("Number is even");;
    }

    public static void main(String[] args) {
        int num = 7;

        try {
            checkNumber(num);
        } catch (OddNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
