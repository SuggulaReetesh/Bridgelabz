import java.util.*;
public class SpringSeason {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int d,m;
		Boolean check=false;
		System.out.print("Month");
		m=in.nextInt();
		System.out.print("Day");
		d=in.nextInt();
		
		if(m==3 && d>=20) {
			check=true;
		}
		if(m==4 && d>=1 &&d<=30 ) {
			check=true;
		}
		if(m==5 && d>=1 && d<=31) {
			check=true;
		}
		if(m==6 && d>=1 && d<=20) {
			check=true;
		}
		if(check==true) {
			System.out.print(true);
		}
		else {
			System.out.print(false);
		}
		
		in.close();
	}
}
