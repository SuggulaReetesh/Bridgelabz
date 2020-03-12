import java.util.*;
public class PowerOf2 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter a number to get powers of 2");
		n=in.nextInt();
		for(int i=0;i<=n;i++) {
			System.out.println((int)Math.pow(2, i));
		}
		in.close();
	}

}