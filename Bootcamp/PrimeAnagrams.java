package Day10;

public class PrimeAnagrams {

	public static int prime(int n) {
		int i;
		if (n <= 1)
			return 0;
		if (n == 2 || n == 3)
			return 1;
		if (n % 2 == 0 || n % 3 == 0)
			return 0;
		for (i = 5; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return 0;
		}
		return 1;
	}

	public static void main(String args[]) {
		
		int primes[] = new int[101];
		
		for (int i = 1; i <= 100; i++) {
			if (prime(i) == 1) {
				primes[i] = i;
			}
		}
		for (int i = 1; i <= 20; i++) {
			if (primes[i] != 0) {
				int num = primes[i];
				num = num % 10 * 10 + num / 10;
				if (primes[num] == num) {
					System.out.println(i + " " + primes[num]);
				}

			}
		}

	}
}