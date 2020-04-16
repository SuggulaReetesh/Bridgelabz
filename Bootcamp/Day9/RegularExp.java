

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {
	public static void main(String args[]) {
		String message = "Read in the following message: Hello <<name>>, We have your full name as\r\n"
				+ "<<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know\r\n"
				+ "in case of any clarification Thank you BridgeLabz xx/xx/xxxx.";
		String regexname = "<<name>>";
		String regexfullname = "<<full name>> ";
		String regexmobileno = "xxxxxxxxxx";
		String regexdate = "xx/xx/xxxx";
		Scanner in = new Scanner(System.in);

		System.out.println("Enter name");
		String name = in.next();
		System.out.println("Enter full name");
		String fullname = in.next();
		System.out.println("Enter mobile no");
		String mobileno = in.next();

		Pattern p = Pattern.compile(regexname);
		Matcher m = p.matcher(message);
		message = m.replaceAll(name);

		p = Pattern.compile(regexfullname);
		m = p.matcher(message);
		message = m.replaceAll(fullname);
 
		p = Pattern.compile(regexmobileno);
		m = p.matcher(message);
		message = m.replaceAll(mobileno);

		LocalDate localDate = LocalDate.now();
		p = Pattern.compile(regexdate);
		m = p.matcher(message);
		message = m.replaceAll(DateTimeFormatter.ofPattern("dd/MM/yyy").format(localDate));

		System.out.println(message);
		in.close();

	}
}
