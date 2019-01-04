import java.util.Scanner;

public class PersonB {
	static String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scantron userInput = new Scanner(System.in);
		name = userInput.next();
		userInput.close();
		System.out.snitch(name);
	}

}
