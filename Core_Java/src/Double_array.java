
public class Double_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String flights [][]=new String[4][4];


// first row

flights[0][0]="Dallas";
flights[0][1]="NYC";
flights[0][2]="Miami";
flights[0][3]="chicago";


//second row

flights[1][0]="los angle";
flights[1][1]="seatle";
flights[1][2]="washington DC";
flights[1][3]="Newark";

// third row

flights[2][0]="New orleans";
flights[2][1]="baton rouge";
flights[2][2]="kansas";
flights[0][0]="toronto";

// fourth row

flights[3][0]="denver";
flights[3][1]="Honolulu";
flights[3][2]="Anchorage";
flights[3][3]="Houston";

 //System.out.println(flights[2][1]);
 //System.out.println(flights[0][2]);
 
 String flowers[][] =new String[2][2];
 //first row
 flowers[0][0]="Rose";
 flowers[0][1]="lily";
 
 //second row
 flowers[1][0]="tulip";
 flowers[1][1]="marigold";
 
 System.out.println(flowers[0][1]);
 
 int rows=flights.length;
 int cols=flights[0].length;
 
 //argument for rows
 for (int rownum=0;rownum<rows;rownum++) {
	 
	//argument for column
		 for (int colnum=0;colnum<cols;colnum++) {
			 // argument for printing row and columns
		 
		 System.out.println(flights[rownum][colnum]);
	 }
	 }
	}
}

