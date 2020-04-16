
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterUser {
	static Scanner in = new Scanner(System.in);

	public static void iterate(String regex, String field) {
		int check = 0;
		while (check != 1) {
			System.out.println("Enter " + field);
			String fieldvalue = in.next();
			check = validate(regex, fieldvalue);
		}
	}

	public static int validate(String regex, String s) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		if (m.matches()) {
			System.out.println("correct format");
			System.out.println();
			return 1;
		} else {
			System.out.println("try again with correct format");
			return 0;
		}
	}

	public static void main(String args[]) {
		iterate("[A-Z]*||[a-z]*||[A-Z][a-z]*", "firstname");
		iterate("[A-Z]*||[a-z]*||[A-Z][a-z]*", "lastname");
		iterate("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$", "email");
		iterate("^\\+(?:[0-9] ?){6,14}[0-9]$", "phone number");
		iterate("[a-zA-Z]?","company name");
		iterate("[a-zA-z0-9]*", "userid");
		iterate("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})", "password");
	}
}