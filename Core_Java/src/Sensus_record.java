import java.util.Scanner;

public class Sensus_record {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1) A census is going on in your county. Make a program that will allow you to input a person's name , age , and occupation. After inputing the person's information will display.  
	
		Scanner reader =new Scanner(System.in);	//scanner object with input argument
		System.out.println("what is your name");
		String name=reader.next();//reading your input
		
	     System.out.println("what is your age");
	     int age = reader.nextInt();
	     
	    System.out.println("what is your occupation");
	    String occupation = reader.next();
	    
		System.out.println("your name is " + name);
		System.out.println("your age  is " + age);
		System.out.println("your occupation is " + occupation );
	}

}
