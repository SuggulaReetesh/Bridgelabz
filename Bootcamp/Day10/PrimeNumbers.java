

import java.util.Scanner;

public class PrimeNumbers {

	public static int isPrime(int n) {
		int i;
		if (n <= 1)
			return 0;
		if (n == 2 || n == 3)
			return n;
		if (n % 2 == 0 || n % 3 == 0)
			return 0;
		for (i = 5; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return 0;
		}
		return n;
	}

	static void updateFreq(int n, int freq[]) {
		while (n > 0) {
			int digit = n % 10;
			freq[digit]++;

			n /= 10;
		}
	}

	public static void prime_anagrams(int[][] A, int rows, int end) {
		int l = A.length * A[0].length, k = 0;
		int a[] = new int[l];
		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= 100; j++) {
				if (A[i][j] > 0) {
					a[k] = A[i][j];
					k++;
				}
			}
		}

		int check = 1;
		for (int i = 0; i < k; i++) {
			check = 1;
			int freqA[] = new int[10];
			updateFreq(a[i], freqA);

			for (int l1 = i + 1; l1 < k; l1++) {
				check = 1;
				int freqB[] = new int[10];
				updateFreq(a[l1], freqB);

				for (int j = 0; j < 10; j++) {

					if (freqA[j] != freqB[j])
						check = 0;

				}
				if (check == 1) {
					System.out.println(a[i] + " " + a[l1]);
				}
			}
		}
	}

	public static int palindrome(int n) {
		int reverse = 0;
		int m = n;
		while (n > 0) {
			int r = n % 10;
			reverse = (reverse * 10) + r;
			n = n / 10;
		}

		if (reverse == m)
			return 1;
		else
			return 0;
	}

	public static void display(int A[][], int rows) {
		System.out.println("The Final Array is : ");
		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= 100; j++) {
				if (A[i][j] > 0)
					System.out.print(A[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i, j;

		System.out.print("Enter the start range: ");
		int m = in.nextInt();
		System.out.print("Enter the end range : ");
		int n = in.nextInt();

		System.out.println("1. print primes");
		System.out.println("2. prime anagrams");
		System.out.println("3. prime palindromes");
		System.out.println("Enter choice");

		int rows = n / 100 - m / 100;
		double k1 = (double) n / 100.0 - (double) m / 100.0;
		if (k1 > rows) {
			rows = rows + 1;
		}

		int A[][] = new int[rows + 1][101];

		int x = m;

		for (i = 0; i <= rows + 1; i++) {
			for (j = 0; j <= 100 && x <= n; j++) {

				A[i][j] = isPrime(x);
				x++;
			}
		}

		int choice = in.nextInt();
		switch (choice) {
		case 1:
			display(A, rows);
			break;
		case 2:
			prime_anagrams(A, rows, n);
			break;
		case 3:
			for (int i1 = 0; i1 <= rows; i1++) {
				for (int j1 = 0; j1 <= 100; j1++) {
					if (palindrome(A[i1][j1]) == 1 && A[i1][j1] > 10) {
						System.out.println(A[i1][j1]);
					}
				}
			}
			break;
		default:
			System.out.println("Enter correct choice");

		}

		in.close();
	}
}
