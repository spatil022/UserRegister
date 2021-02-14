import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationUC6 {
	// Rule2 Should have at least 1 Upper Case
	public static void password() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("\nEnter the Password");
		String p = sc.nextLine();
		if (Pattern.matches("^(?=.*[a-z])"+"(?=.*[A-Z]){8,}$", p) == true)
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	}
	public static void main(String[] args) {
		password();
	}

}
