import java.util.Scanner;
import java.util.regex.*;

public class Reg {

	static String fName;
	static String lName;

   
   static String firstName(){
      Scanner sc1 = new Scanner(System.in);
      System.out.println("Enter your first name first letter must be Capital");
      fName = sc1.nextLine();
      return fName;
   }

	
	static String lastName(){
      Scanner sc2 = new Scanner(System.in);
      System.out.println("Enter your last name first letter must me Capital");
      lName = sc2.nextLine();
      return lName;
   }
	

   public static void main(String args[]) {


      
      Boolean firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",Reg.firstName());

      Boolean lastName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",Reg.lastName());

      
      if (firstName == true) {
          System.out.println("First Name: " + fName);
      
      }
	else {
		System.out.println("Invalid");}

		if (lastName == true) {
           System.out.println("Last Name: " + lName);
      }
	else {
	System.out.println("invalid");}

		
	}
}
