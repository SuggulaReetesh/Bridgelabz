

import java.util.Random;
import java.util.Scanner;

public class Birthdate {
	public static void main(String args[]) {
		String months[] = { " ", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		int days[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Scanner in = new Scanner(System.in);
		System.out.println("Enter start year");
		int startyear = in.nextInt();
		System.out.println("Enter end year");
		int endyear = in.nextInt();
		System.out.println("Enter no birthdates to generate");
		int n = in.nextInt();
		String birthdates[] = new String[n + 1];
		Random r = new Random();
		for (int i = 1; i <= n; i++) {
			int randyear = r.nextInt((endyear - startyear) + 1) + startyear;
			if (((randyear % 4 == 0) && (randyear % 100 != 0)) || (randyear % 400 == 0)) {
				days[2] = 29;
			} else {
				days[2] = 28;
			}

			int randmonth = r.nextInt((12 - 1) + 1) + 1;
			String month;
			if (randmonth < 10) {
				month = "0" + Integer.toString(randmonth);
			} else {
				month = Integer.toString(randmonth);
			}

			int randday = r.nextInt((days[randmonth] - 1) + 1) + 1;
			String day;
			if (randday < 10) {
				day = "0" + Integer.toString(randday);
			} else {
				day = Integer.toString(randday);
			}

			birthdates[i] = day + "-" + month + "-" + Integer.toString(randyear);
			System.out.println(birthdates[i]);
		}
		for (int i = 1; i <= 12; i++) {
			System.out.println(months[i]);
			for (int j = 1; j < n; j++) {
				if (Integer.parseInt(birthdates[j].substring(3, 5)) == i) {
					System.out.println(birthdates[j]);
				}

			}
		}
		in.close();

	}

}
