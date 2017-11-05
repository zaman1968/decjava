
public class Visit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String country [][]=new String[2][3];


		// first row

		country[0][0]="Bangladesh";
		country[0][1]="Japan";
		country[0][2]="Switzerland";


		//second row

		country[1][0]="Itly";
		country[1][1]="Spain";
		country[1][2]="Russia";
		

		
		 int rows=country.length;
		 int cols=country[0].length;
		 
		//argument for rows
		 for (int rownum=0;rownum<rows;rownum++) {
			 
			//argument for column
			 for (int colnum=0;colnum<cols;colnum++) {
				 // argument for printing row and columns
				 
				 System.out.println(country[rownum][colnum]);
			 
      }
	  }
}
}

