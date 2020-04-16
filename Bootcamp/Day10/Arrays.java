

import java.util.Scanner;

public class Arrays {
	private static Scanner in = new Scanner(System.in);

	public static double[][] readdouble() {
		System.out.println("Enter no of rows");
		int m = in.nextInt();
		System.out.println("Enter no of rows");
		int n = in.nextInt();
		System.out.println("Enter values");
		double[][] a = new double[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = in.nextDouble();
			}
		}
		return a;
	}

	public static void print(double[][] a) {
		int m = a.length;
		int n = a[0].length;
		System.out.println(m + " " + n);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%9.5f ", a[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] readint() {
		System.out.println("Enter no of rows");
		int m = in.nextInt();
		System.out.println("Enter no of rows");
		int n = in.nextInt();
		System.out.println("Enter values");
		int[][] a = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = in.nextInt();
			}
		}
		return a;
	}

	public static void print(int[][] a) {
		int m = a.length;
		int n = a[0].length;
		System.out.println(m + " " + n);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%9.5f ", a[i][j]);
			}
			System.out.println();
		}
	}

	public static boolean[][] readbool() {
		System.out.println("Enter no of rows");
		int m = in.nextInt();
		System.out.println("Enter no of rows");
		int n = in.nextInt();
		System.out.println("Enter values");
		boolean[][] a = new boolean[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = in.nextBoolean();
			}
		}
		return a;
	}

	public static void print(boolean[][] a) {
		int m = a.length;
		int n = a[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j])
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		System.out.println("1. double array");
		System.out.println("2. int array");
		System.out.println("3. boolean array");
		System.out.println("\nEnter choice");
		int n = in.nextInt();
		switch (n) {
		case 1:
			print(readdouble());
			break;
		case 2:
			print(readint());
			break;
		case 3:
			print(readbool());
			break;
		default:
			System.out.println("enter correct choice");

		}
	}
}