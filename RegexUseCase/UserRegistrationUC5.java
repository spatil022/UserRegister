import java.util.regex.Pattern;
import java.util.*;

public class UserRegistrationUC5 {
	// Rule1 minimum 8 Characters
	public static void password() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("\nEnter the Password");
		String p = sc.nextLine();
		if (Pattern.matches("^[A-Za-z0-9]{8,}$", p) == true)
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	}
	public static void main(String[] args) {
		password();
	}

}
