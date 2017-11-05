import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader =new Scanner(System.in);
		do
        {
            System.out.print("1. Addition\n");
            System.out.print("2. Subtraction\n");
            System.out.print("3. Multiplication\n");
            System.out.print("4. Division\n");
            System.out.print("5. Exit\n\n");
            System.out.print("Enter Your Choice : ");
            choice = scan.next().charAt(0);

		System.out.println("Inrter the fnum:");
		double fnum=reader.nextDouble();
		System.out.println("Inter the snum:");
		double snum=reader.nextDouble();
		
		Scanner op = new Scanner(System.in);
		 System.out.println("provide your operation");
		 String operation = op.next();

       

	   if (operation=="+");
	   {
	   	System.out.println("your result is "+(fnum +snum));
	   	
	   }

	    if (operation=="-");

	   {
	   	
		System.out.println("your result is " +(fnum-snum));
		
	   }
	    if (operation=="*");
	   {
	   	System.out.println("your result is " +(fnum*snum));
	   	
	   }
	    if (operation=="/");
	   {
	   System.out.println("your result is " +(fnum/snum));
	   
	   }
		
       
	}

}
