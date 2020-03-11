import java.util.*;
public class Quadratic {
	public static void main(String args[]) {
		int a,b,c;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		double root1= (-b+(Math.sqrt(b*b - 4*a*c)))/2*a;
		double root2= (-b-(Math.sqrt(b*b - 4*a*c)))/2*a;
		System.out.println(root1);
		System.out.println(root2);
		in.close();
	}

}
