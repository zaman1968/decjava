import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);

Maths Maths = new Maths();

double answer = 0;
double inputA, inputB;
char operator;
boolean done = false;

 while (done == false) {
    System.out.print("Please enter your sum: ");

    inputA = input.nextDouble();
    operator = input.next().charAt(0);
    inputB = input.nextDouble();        




switch (operator) {
case '+': answer = Maths.add(inputA, inputB);
          break;
case '-': answer = Maths.subtract(inputA, inputB);
          break;
case '*': answer = Maths.multiply(inputA, inputB);
          break;
case '/': answer = Maths.divide(inputA, inputB);
          break;
case '^': answer = Maths.power(inputA, inputB);
          break;
}

System.out.println(answer);             
}       

input.close();

		
		
		
		
		
	}

}
