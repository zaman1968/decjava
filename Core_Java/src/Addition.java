
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		argument_sum(7, 8);
		argument_subtruction(4, 5);
		argument_multiplication(6, 7);
		argument_calculation(8, 9, 10);
		argument_power(4, 1);

	}

	public static void sum() {
		int add = 8 + 9;
		System.out.println(add);
	}

	public static void argument_sum(int a, int b) {

		int adding = a + b;
		System.out.println(adding);
	}

	public static void argument_subtruction(int a, int b) {
		int subtruction = a - b;
		System.out.println(subtruction);
	}

	public static void argument_multiplication(int a, int b) {
		int multiplication = a * b;
		System.out.println(multiplication);
	}

	public static void argument_calculation(int a, int b, int c) {
		int calculation = (a + b) / c;
		System.out.println(calculation);
	}

	public static void argument_power(int a, int b) {
		double power = Math.pow(a, b);
		System.out.println(power);
	}

	public static void argument_power(double x, double y, double b) {
		double slope, m = y / x;

	}
}