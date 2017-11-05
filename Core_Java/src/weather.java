
public class weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperature=75;      // factors influence weather are pressure,temperature 
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
	
	}

}
