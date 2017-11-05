
public class Non_static {
// to call a non static function we have to make a object and an object is instance of a class
// if static is not mentioned 	
	public static void main(String[] args) {
				// TODO Auto-generated method stub
	Non_static x=new Non_static();//instance of a class	
x.car();
x.flower();
	}
public void car() { // non static can be called everywhere easily
	System.out.println("Toyota");
}
	public void flower() {
	System.out.println("rose");
	}
}

