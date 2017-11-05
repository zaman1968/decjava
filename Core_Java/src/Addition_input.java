import java.util.Scanner;

public class Addition_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		String operation;
Scanner input =new Scanner(System.in);
System.out.println("provide your first number");
a=input.nextInt();


System.out.println("provide your second number");
b=input.nextInt();


Scanner op = new Scanner(System.in);
System.out.println("provide your operation");
operation = op.next();


if (operation=="+");
{
	System.out.println("your result is "+(a+b));
	
}

 if (operation=="-");

{
	System.out.println("your result is " +(a-b));
}
 if (operation=="*");
{
	System.out.println("your result is " +(a*b));
}
 if (operation=="/");
{
System.out.println("your result is " +(a/b));
}
	
 
 
	}

}
