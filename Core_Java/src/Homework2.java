
public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Single array table with all months, January-December.
		
	String month []=new String[12];	
	

	month[0] ="January";
	month[1] ="February";
	month[2] ="March";
	month[3] ="April";
	month[4] ="May";
	month[5] ="June";
	month[6] ="July";
	month[7] ="August";
	month[8] ="september";
	month[9] ="October";
	month[10] ="November";
	month[11] ="December";
	
	
	System.out.println(month[0]);
	System.out.println(month[1]);
	System.out.println(month[2]);
	System.out.println(month[9]);
	System.out.println(month[10]);
	System.out.println(month[11]);
	
	
	// A 3X4 double array table that displays food name.
	
	String food [][] = new String [3][4];
	food[0][0]="Rice";
	food[0][1]="Biryani";
	food[0][2]="Parata";
	food[0][3]= "Illish curry";
	food[1][0]= "Rupchada fry";
	food[1][1]= "Chingri malai curry";
	food[1][2]= "Beef bhuna";
	food[1][3]= "Dal";
	food[2][0]= "Shobji";
	food[2][1]= "Malpua";
	food[2][2]= "Misti Doi";
	food[2][3]= "Roshogolla"; 
	
	System.out.println(food[0][2]);
	System.out.println(food[2][3]);
	
	// Switch_break ( weather with temperature) 
	int temperature=50;
	switch(temperature) {
	case 50 :
	System.out.println("It is cold");
	break;
	case 70 : 
	System.out.println("It is a pleasent weather");
	break;
	case 80 :
	System.out.println("It is hot");
	break;
	}		  
	// switch_break( weather with range of temperature)
	int temperature =50;
	switch(temperature) {
	if( temperatue<50)
	System.out.println("It is cold");
	break;
	
	if( temperatue>80)
		System.out.println("It is hot");
	break;
	if(( temperatue>50)&&(temperature<80))
		System.out.println("It is a pleasent weather");
	break;
	}
	// Earth temperature with distance of earth from sun
			
	int Earthtemperature =61;                // temperature of earth depends on distance between earth and sun
	int distance= 96922000;                    // Mean distance is 96.92 million miles,mean temperature is 61 degree(F) and 1 degree variation with 150 miles 
	Earthtemperature = 61+(96920000-distance)/150;         // of movement
	 
	     System.out.println("EarthTemperatue in farenhight = " +Earthtemperature );
	   
	// weather forecast
	
	temperature=75;      // factors influence weather are pressure,temperature 
	int pressure = 745;        // and presence of waterbody
	int waterbody=1;
			
	if (pressure >= 800) {
		System.out.println("It will be windy");
		
    } else if ((pressure<750) &&(temperature>65)&&(waterbody>0) ) {
    	System.out.println("It will be cloudy,rainy and lightining");
    	
    } else if ((pressure<750)&&(temperature<30)) {
    	System.out.println("It will be Snow");
   
    } else 
    	
    		System.out.println("It will be Sunny");
	
	
	// for loop
	
	
	for(int mark=0;
			mark<50;
			mark++)
	{
		System.out.println("fail");
	}
	
	for(int mark1=50;
		    mark>=50;
			mark++)
	{    System.out.println("pass");
	
	}
    // while loop
	
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


	}
	
    }
       
	     	          
	        	
	        	
	        	      
	            
	            
	            
	    
	    


	
	
	
	
	
	
	
	 
	