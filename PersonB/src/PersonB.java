import java.util.Scanner;

public class PersonB 
{
	private static String name;
	private static String newName = ""; // a new variable needs to be created to receive the backwards string
	
	public static void main( String[] args ) 
	{
		Scanner userInput = new Scanner(System.in); //Scanner is the class, not Scantron
		name = userInput.next();
		userInput.close();
		// a for loop was missing. You need to reverse the string given
		for( int i = name.length() - 1; i >= 0; i-- )
		{
			newName += name.charAt( i );
		}
		System.out.println( newName ); // you needed to print you results
	}

}
