import java.util.*;
public class CarLoan {
	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		int P;
		double R,Y;
		System.out.println("Principal Loan");
		P=in.nextInt();
		System.out.println("rate of interest");
		R=in.nextDouble();
		System.out.println("Years");
		Y=in.nextDouble();
		
		double r=R/(12*100);
		double n=12*Y;
		double payment= (P*r/(1-Math.pow(1+r, -1*n)));
		
		System.out.print("Payment to be made" + payment);
		
	}
}
