

import java.util.Scanner;

public class HarmonicSeries {
	public static void harmonicseries(int n, double HS[][]) {

		double result = 0;
		int j = 1, k = 1;
		for (int i = 1; i <= n; i++) {
			result = result + 1 / (double) i;
			if (result < (double) j + 1) {
				HS[j][k] = result;
				k++;
			}

			else {
				k = 1;
				j = j + 1;
				HS[j][k] = result;
				k++;

			}

		}
		for (int i = 1; i <= n; i++) {
			for (j = 1; j < 100; j++) {
				if(HS[i][j]>0)
				System.out.print(HS[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Enter how many n values to store");
		n = in.nextInt();
		double HS[][] = new double[n + 1][1000];
		harmonicseries(n, HS);

		in.close();
	}
}
