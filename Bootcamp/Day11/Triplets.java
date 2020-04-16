
import java.util.Scanner;

public class Triplets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array length");
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		int check = 0;
		int[] numbers = new int[10];
		int count = 0;
		int distinctcount = 0;
		for (int i = 0; i < n - 2; i++) {
			count = 0;
			for (int j = i + 1; j < n - 1; j++) {
				count = 0;
				for (int k = j + 1; k < n; k++) {
					count = 0;
					if (arr[i] + arr[j] + arr[k] == 0) {

						if (numbers[Math.abs(arr[i])] > 0) {
							count++;
						} else {
							numbers[Math.abs(arr[i])]++;
						}
						if (numbers[Math.abs(arr[j])] > 0) {
							count++;
						} else {
							numbers[Math.abs(arr[j])]++;
						}
						if (numbers[Math.abs(arr[k])] > 0) {
							count++;
						} else {
							numbers[Math.abs(arr[k])]++;
						}

						if (count < 3) {
							distinctcount++;
							System.out.print(arr[i] + " " + arr[j] + " " + arr[k]);
							System.out.println();
							check = 1;
						}

					}
				}
			}
		}
		System.out.println("No of distinct triplets :" + distinctcount);
		if (check == 0)
			System.out.println(" triplets does not exist ");
		in.close();
	}
}