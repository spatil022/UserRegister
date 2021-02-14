import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationUC9 {
	// UC 9 - Cleared All Sample Provided

	public static void email() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter EMail");
		String email = sc.nextLine();
		if (Pattern.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*$", email) == true)
			System.out.println("Valid Email");
		else
			System.out.println("Invalid Email");
	}

	public static void main(String[] args) {
		email();
	}

}
