import java.util.*;
public class HarmonicNumber {
	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		int n;
		double result=0;
		System.out.println("Enter a number to generate harmonic");
		n=in.nextInt();
		for(int i=1;i<n;i++) {
			System.out.print(1+"/"+i+"+");
			result=result+1/(double)i;
		}
		result=result+1/(double)n;
		System.out.println(1+"/"+n+"="+result);
		in.close();
	}
}
