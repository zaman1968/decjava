
import java.io.*;
public class TryCatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("please type your name :");
	/*Scanner reader =new Scanner(System.in);*/ 
	String name =in.readLine();
	System.out.println("The  7th character is:"+ name.charAt(6));

	
	}//ends try

catch(Exception e){
	System.out.println("error message:"+e.getMessage());
	System.out.println("your name is not at least 7th character long");
}//ends catch
	}
}

