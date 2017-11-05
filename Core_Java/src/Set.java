import java.util.Scanner;

public class Set {

	private String code;

	public void setCode(String code) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("please give me the code");
		String name = input.nextLine();
		this.code = name;
	}

	public String getCode() {
		return code;
	}
}
