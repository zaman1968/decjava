//Overloading function happens when both has the same name but different arguments
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 number(6);
 number(6.7);
 String ("rose");
 String (20);
	}
public static void number(int c) {
	System.out.println( c);
}
public static void number(double c) {
	System.out.println( c);
}
public static void String(String rose) {
	System.out.println(rose);
}
public static void String( int A) {
	System.out.println(A);
}
}