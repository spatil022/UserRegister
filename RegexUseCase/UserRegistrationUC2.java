import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationUC2 {


	public static void lastName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Last Name");
		String lN = sc.nextLine();
		if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lN) == true)
			System.out.println("Valid Last Name");
		else
			System.out.println("Invalid Last Name");
	}
	public static void main(String[] args) {
		lastName();
	}

}
