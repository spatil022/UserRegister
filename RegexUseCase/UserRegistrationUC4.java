import java.util.regex.Pattern;
import java.util.*;

public class UserRegistrationUC4 {
	// UC4 - Mobile Format
	public static void mobile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Mobile Number With Country Code(space between code and number)");
		String m = sc.nextLine();
		if (Pattern.matches("^[1-9]{2}\s{1}[1-9]{1}[0-9]{9}$", m) == true)
			System.out.println("Valid Mobile");
		else
			System.out.println("Invalid Mobile");
	}
	public static void main(String[] args) {
		mobile();
	}
}
