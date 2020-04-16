

import java.util.*;
public class Date {
	public static int[] DayofWeek(int month, int year) {
		int daydays[]=new int[2];
		int D[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
		int day=1;
		if((year%400==0) || ((year%100!=0)&&(year%4==0)))
        {
            D[2]=29;
        }
		daydays[1]=D[month];
		
		int y0=year-(14-month)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=month+12*((14-month)/12)-2;
		int d0=(day+x+31*m0/12)%7;
		
		switch(d0) {
		case 0:
		        daydays[0]= 0;
		        break;
		case 1:
		        daydays[0]=1;
		        break;
		case 2:
 				daydays[0]=2;
 				break;
		case 3:
 				daydays[0]=3;
 				break;
		case 4:
 				daydays[0]=4;
 				break;
		case 5:
 				daydays[0]=5;
 				break;
		case 6:
 				daydays[0]= 6;
 				break;
		}
		return daydays;
	}
	
	public static void DayofWeek() {
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
	
	public static void print_calendar() {
		String months[]= {"","January","February","March","April","May","June","July"
				,"August","September","October","November","December"};
		Scanner in =new Scanner(System.in);
		System.out.println("Month ");
		int month=in.nextInt();
		System.out.println("year ");
		int  year=in.nextInt(); 
		String [][] calendar=new String[7][7];
		calendar [0][0]="s ";
		calendar [0][1]="m ";
		calendar [0][2]="t ";
		calendar [0][3]="w ";
		calendar [0][4]="th";
		calendar [0][5]="f ";
		calendar [0][6]="sa";
		int day[]=DayofWeek(month,year);
		int k=1;
		System.out.println(months[month]+" "+year);
		for(int i=1;i<7;i++) {
			for(int j=0;j<7 ;j++) {
				if(i==1 && j<day[0] || k>day[1]) {
				  calendar[i][j]="  ";
				}
				else {
					calendar[i][j]=String.format("%02d", k);
					k++;
				}
		    }
			
		}
		for(int i=0;i<7;i++) {
			for(int j=0;j<7 ;j++) {
				System.out.print(calendar[i][j] +" ");
		    }
			System.out.println();
		}
		in.close();
		
		
		}
		
	
	public static void main(String args[]) {
		//DayofWeek();
		print_calendar();
	}

}
