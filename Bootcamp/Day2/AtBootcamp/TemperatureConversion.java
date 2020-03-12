import java.util.*;
public class TemperatureConversion {
	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		int choice;
		double f,c;
		System.out.println("Enter Choice");
		System.out.println("1.farenheit");
		System.out.println("2.celsius");
		choice=in.nextInt();
		switch(choice) {
		case 1 : System.out.println("Enter Farenheit temperature");
		         f=in.nextDouble();
		         c=(f-32)*5/9;
		         System.out.println("Celsius "+c);
		         break;
		case 2  :System.out.println("Enter Celsius temperature");
        		c=in.nextDouble();
        		f=(c*9/5)+32;
        		System.out.println("Farenheit "+f);
        		break;
        default:System.out.print("Enter correct choice");		
		}
		in.close();
	}

}
