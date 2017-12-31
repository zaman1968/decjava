
public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	System.out.println(10/2);// 5
	System.out.println(10/1);// error
	System.out.println("I am a student of Techfios");// never get reached or executed
}//ends try

catch(Exception e) {
	System.out.println("you can not divide by 0!");
	System.out.println("pleasse run the program again with different denominator.");
}
	}

}
