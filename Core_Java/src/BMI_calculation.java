
import java.util.Scanner;

public class BMI_calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input=new Scanner(System.in);
      System.out.println("Please inter your weight in KG ");
    	double W = input.nextDouble();
    	System.out.println("please inter your height in meter");
    	double H= input.nextDouble();
    	Double BMI = W/(H*H);// W in kg and H in meter\
    	
    	
    	if( BMI<18.5) {
    	System.out.println("your BMI is : " +BMI + " and you are uder weight");
    	}
    	if(( BMI>=18.5)&&(BMI<24.9)) {
    		
    		System.out.println("your BMI is : " +BMI + " and you are normal weight");
    	}	
        if(( BMI>=25)&&(BMI<29.9)) {
    		
    		System.out.println("your BMI is : " +BMI + " and you are over weight");
    	}
        if(( BMI>=30)&&(BMI<34.5)) {
    		
    		System.out.println("your BMI is : " +BMI + " and you are obse class I(Moderate obese)");
    	}
        if(( BMI>=35)&&(BMI<39.9)) {
    		
    	System.out.println("your BMI is : " +BMI + " and you are obse class II(severe obese)"); 
	    }
        if( BMI>=40){
    		
        	System.out.println("your BMI is : " +BMI + " and you are obse class III(very severe obese)"); 
    	}  
}
}