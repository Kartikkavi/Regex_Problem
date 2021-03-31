import java.util.Scanner;
import java.util.regex.*;

public class Reg {
	
	static String fName;

		static String firstName(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name : ");
		fName = sc.nextLine();
		return fName;
	}

	public static void main(String args[]) {
	
		Boolean firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",Reg.firstName());

		if(Boolean.TRUE.equals(firstName))
		{
			System.out.println("Correct format");
		}
		else
		{
			System.out.println("Incorrect format try   K artik this format");
		}
}
}
