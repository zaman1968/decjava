
public class Global_local {
	static int c = 500;
	int b = 200;// non static global variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		age(); // why use()?
		salary();
		apple();
		System.out.print(c);
		Global_local b = new Global_local();//
		System.out.println(b);
	}

	public static void age() {
		int x = 3;
		System.out.println(x + c);
	}

	public static void salary() {
		int y = 300;
		System.out.println(y);

	}

	public static void apple() {
		int b = 200;
		System.out.println(c);
	}

}