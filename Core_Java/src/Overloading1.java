
public class Overloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Add(4, 5));
		System.out.println(Add(4.45, 5.55));
		System.out.println(Add("Zaman", "Rafia"));

	}

	public static int Add(int a, int b) {
		return (a + b);
	}

	public static double Add(double a, double b) {
		return (a + b);
	}

	public static String Add(String a, String b) {
		return (a + b);

	}
}