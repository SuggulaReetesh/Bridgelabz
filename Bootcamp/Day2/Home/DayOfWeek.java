

import java.util.*;
public class DayOfWeek {
	public static void main(String args[]) {
		int day,month,year;
		Scanner in =new Scanner(System.in);
		System.out.println("Day ");
		day=in.nextInt();
		System.out.println("Month ");
		month=in.nextInt();
		System.out.println("year ");
		year=in.nextInt();
		
		int y0=year-(14-month)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=month+12*((14-month)/12)-2;
		int d0=(day+x+31*m0/12)%7;
		
		switch(d0) {
		case 0:System.out.print("Sunday");
		 		break;
		case 1:System.out.print("Monday");
 				break;
		case 2:System.out.print("Tuesday");
 				break;
		case 3:System.out.print("Wednesday");
 				break;
		case 4:System.out.print("Thursday");
 				break;
		case 5:System.out.print("Friday");
 				break;
		case 6:System.out.print("Saturday");
 				break;
		}
		in.close();
		
		
	}

}
