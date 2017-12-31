import java.util.Scanner;

public class Calculator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b, res;
		char choice;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("1. Addition\n");
			System.out.print("2. Subtraction\n");
			System.out.print("3. Multiplication\n");
			System.out.print("4. Division\n");
			System.out.print("5. Exit\n\n");
			System.out.print("Enter Your Choice : ");
			choice = scan.next().charAt(0);
			switch (choice) {
			case '1':
				System.out.print("Enter first number: ");
				a = scan.nextDouble();

				System.out.print("Enter second number : ");
				b = scan.nextDouble();
				res = (a + b);

				System.out.print("Result = " + res);
				res = scan.nextDouble();
				break;
			case '2':
				System.out.print("Enter first number: ");
				a = scan.nextDouble();

				System.out.print("Enter second number : ");
				b = scan.nextDouble();
				res = (a - b);

				System.out.print("Result = " + res);
				res = scan.nextFloat();
				break;

			case '3':
				System.out.print("Enter first number: ");
				a = scan.nextDouble();

				System.out.print("Enter second number : ");
				b = scan.nextDouble();
				res = (a * b);
				System.out.print("Result = " + res);
				res = scan.nextDouble();
				break;
			case '4':
				System.out.print("Enter first number: ");
				a = scan.nextDouble();

				System.out.print("Enter second number : ");
				b = scan.nextDouble();
				res = (a / b);
				System.out.print("Result = " + res);
				res = scan.nextDouble();
				break;
			case '5':
				System.exit(0);
				break;
			default:
				System.out.print("Wrong Choice!!!");
				break;
			}
			System.out.print("\n---------------------------------------\n");
		} while (choice != 5);

	}

}