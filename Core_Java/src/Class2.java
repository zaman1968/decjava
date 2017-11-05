
public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	/*	 
		for(int mark=0;
				mark<50;
				mark++)
		{
			System.out.println("fail");
		}
	
		for(int mark=50;
			    mark>=50;
				mark++)
		{    System.out.println("pass");
		
		}
		*/
		double balance=5000;
		double rate = 5;
		double target = 10000;
		int year=0;
		
		while ( balance<target )
		 {
           year++;
           double interest=(balance*rate)/100;
           balance+=interest;}
           
           
			System.out.println("the rate will be double after"+year+"years");

		
		int temperature= 100;
		int pressure =700;
		
			
		
		
		if ((temperature>65) && (pressure<750)) 
			System.out.println("It will be rainy");
			 else 
			System.out.println("It will be Sunny");
		    }
	}


