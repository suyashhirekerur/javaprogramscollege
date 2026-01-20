import java.util.Scanner;

public class ArithmeticOperations {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int a = sc.nextInt();

		System.out.print("Enter first number: ");
		int b = sc.nextInt();

		System.out.println("\nChoose an operation:\n");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulus");

		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();

		switch (choice) {
            		case 1:
                		System.out.println("Addition = " + (a + b));
                		break;

            		case 2:
                		System.out.println("Subtraction = " + (a - b));
                		break;

            		case 3:
                		System.out.println("Multiplication = " + (a * b));
                		break;

            		case 4:
                		if (b != 0)
                    		System.out.println("Division = " + (a / b));
                		else
                    		System.out.println("Error: Division by zero");
               			break;

            		case 5:
                		System.out.println("Modulus = " + (a % b));
                		break;

            		default:
                		System.out.println("Invalid choice");
        	}

		sc.close();
	}

}

