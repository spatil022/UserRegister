import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationUC8 {
	// Rule4 Should have at least 1 Numeric Character
	public static void password() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("\nEnter the Password");
		String p = sc.nextLine();
		if (Pattern.matches("^(?=.*[0-9])"+"(?=.*[a-z])"+"(?=.*[A-Z])"+"(?=.*[@#$%^&+=]){8,}$", p) == true)
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	}
	public static void main(String[] args) {
		password();
	}
}
