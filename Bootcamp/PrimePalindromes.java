package Day10;

import java.util.Scanner;

public class PrimePalindromes {
	public static int palindrome(int n) {
		int reverse=0;
		int m=n;
		while(n>0) {
			int r=n%10;
			reverse=(reverse*10)+r;
			n=n/10;
		}

		if(reverse==m) 
			return 1;
		else 
			return 0;
	}

	public static int prime(int n) {
		int i;
		if (n <= 1)
			return 0;
		if (n == 2 || n == 3)
			return 1 ;
		if (n % 2 == 0 || n % 3 == 0)
			return 0;
		for (i = 5; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return 0;
		}
		return 1;

	}

	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("start Range");
		int start=in.nextInt();
		System.out.println("End Range");
		int end=in.nextInt();
		
		int primes[] = new int[1000];
		int j=0;
		for (int i = start; i <= end; i++) {
			if (prime(i) == 1) {
				primes[j] = i;
				j++;
			}
		}
		for (int k =0 ; k <j; k++) {
			if(palindrome(primes[k])==1 && primes[k]>10) {
				System.out.println(primes[k]);
			}
	    }
	}
}