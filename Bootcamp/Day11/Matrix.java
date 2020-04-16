
import java.util.Scanner;

public class Matrix {

	public static void multiplication() {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter rows and columns of first matrix");
		int rfm = in.nextInt();
		int cfm = in.nextInt();

		System.out.println("Enter rows and columns of the second matrix");
		int rsm = in.nextInt();
		int csm = in.nextInt();

		if (cfm != rsm) {
			System.out.println("Given matrices are not compatible to multiply");
		} else {

			int[][] A = new int[rfm][cfm];
			System.out.println("Enter the elements of first matrix");
			for (int i = 0; i < rfm; i++) {
				for (int j = 0; j < cfm; j++) {
					A[i][j] = in.nextInt();
				}
			}
			int[][] B = new int[rsm][csm];
			System.out.println("Enter numbers of second matrix");
			for (int i = 0; i < rsm; i++) {
				for (int j = 0; j < csm; j++) {
					B[i][j] = in.nextInt();
				}
			}

			int[][] product = new int[rfm][csm];

			for (int i = 0; i < rfm; i++) {
				for (int j = 0; j < csm; j++) {

					int sum = 0;
					for (int k = 0; k < rsm; k++) {
						sum = sum + A[i][k] * B[k][j];
					}

					product[i][j] = sum;
				}
			}

			System.out.println("Product of entered matrices:-");

			for (int i = 0; i < rfm; i++) {
				for (int j = 0; j < csm; j++) {
					System.out.printf("%d ", product[i][j]);
				}
				System.out.printf("%n");
			}

		}

		in.close();
	}

	public static void addition() {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter rows and columns of first matrix");
		int rfm = in.nextInt();
		int cfm = in.nextInt();

		System.out.println("Enter rows and columns of the second matrix");
		int rsm = in.nextInt();
		int csm = in.nextInt();

		if (rfm != rsm && cfm != csm) {
			System.out.println("Given matrices are not compatible to multiply");
		} else {

			int[][] A = new int[rfm][cfm];
			System.out.println("Enter the elements of first matrix");
			for (int i = 0; i < rfm; i++) {
				for (int j = 0; j < cfm; j++) {
					A[i][j] = in.nextInt();
				}
			}
			int[][] B = new int[rsm][csm];
			System.out.println("Enter numbers of second matrix");
			for (int i = 0; i < rsm; i++) {
				for (int j = 0; j < csm; j++) {
					B[i][j] = in.nextInt();
				}
			}

			int[][] Addition = new int[rfm][csm];

			for (int i = 0; i < rfm; i++) {
				for (int j = 0; j < csm; j++) {

					Addition[i][j] = A[i][j] + B[i][j];

				}
			}

			System.out.println("Addition of entered matrices:-");

			for (int i = 0; i < rfm; i++) {
				for (int j = 0; j < csm; j++) {
					System.out.printf("%d ", Addition[i][j]);
				}
				System.out.printf("%n");
			}

		}

		in.close();
	}

	public static void main(String args[]) {
		System.out.println("1.Multiplication");
		System.out.println("2.Addition");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		switch (n) {
		case 1:
			multiplication();
			break;
		case 2:
			addition();
			break;
		default:
			System.out.println("Enter correct choice");
		}
		in.close();
	}
}