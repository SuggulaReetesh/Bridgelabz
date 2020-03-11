import java.util.*;
public class LeapYear {
	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		int year;
		year=in.nextInt();
		if(year%4==0 && year>=1582) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.print("leap year");
				}
				else {
					System.out.println("Not a leap year");
				}
			}
			else {
				System.out.println("leap year");
			}
		}
		else {
			System.out.println("Not aleap year");
		}
		in.close();
		
	}
}
