import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		boolean Stop=true;//stop is false
		//stop=false
		//while(true)
		while(Stop) {//run this loop while true
		
		Scanner reader = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);		
			
		System.out.println("what is the price of items:");
		double price = reader.nextDouble();
		System.out.println("How much customer provided:");
		double provided = reader.nextDouble();

		double change = provided - price;
		double more = price - provided;

		if (provided > price) {
			System.out.println("change is : " + change);

		}
		if (provided < price) {
			System.out.print("Not enough money,you need to pay more" + more);
		} else if (provided == price) {
			System.out.print("No change ,you paid exact amonut.");
		}
		System.out.println("\nDo you want to cont. Y for Yes and N for No");
		String answer = scanner.nextLine();
		if (answer.equals("N")) {
			Stop=false;
		}//if Y run loop again and if N stop the program
		}
	}// end practice
}
