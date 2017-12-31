import java.util.Scanner;

public class Ageinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean stop = true;
		while (stop) {
			Scanner reader = new Scanner(System.in); // scanner object with input argument
			System.out.println("what is your name");
			String name = reader.next();// reading your input

			System.out.println("what is your age ");
			int age = reader.nextInt();// reading your input

			System.out.println("what is your city ");
			String city = reader.next();// reading your input

			System.out.println("what is your zipcode");
			int zipcode = reader.nextInt();

			System.out.println("what is your state");
			String state = reader.next();

			System.out.println("your name is " + name);
			System.out.println("your age is " + age);
			System.out.println("your city is " + city);
			System.out.println("your zipcode is " + zipcode);
			System.out.println("your state is " + state);
		}
		System.out.println("\nDo you want to cont. Y for Yes and N for No");
		Scanner scanner = null;
		String answer = scanner.nextLine();
		if (answer.equals("N")) {
			stop = false;
		}
	}
}
