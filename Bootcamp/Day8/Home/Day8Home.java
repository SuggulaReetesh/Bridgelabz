

import java.util.*;

public class Day8Home {
	private static Scanner in = new Scanner(System.in);
	public static char check;
	public static int mid;

	public static int binarySearch(int arr[], int l, int r) {
		if (r >= l) {

			mid = l + (r - l) / 2;
			System.out.println("Is Less or equal " + mid + " Y/N ?");
			check = in.next().charAt(0);

			if (check == 'Y')
				return binarySearch(arr, l, mid - 1);
			else
				return binarySearch(arr, mid + 1, r);
		} else {
			return mid;
		}

	}

	public static void insertionSort(String arr[]) {
		int i, j;
		String key;
		for (i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		 for (int k = 0; k < arr.length; k++) 
	            System.out.print(arr[k] + " "); 
	}

	public static void main(String[] args) {
		System.out.println("1. binary search guess number");
		System.out.println("2. Insertion sort of strings");
		int n = in.nextInt();
		switch (n) {
		case 1:
			System.out.println("Enter a number to power of 2");
			int l = in.nextInt();
			System.out.println("choose a number between 0 to" + (int)(Math.pow(2,l)-1));
			int[] arr = new int[(int)Math.pow(2, l)];
			for (int i = 0; i < Math.pow(2, l); i++) {
				arr[i] = i + 1;
			}
			int guess = binarySearch(arr, 0, arr.length - 1);
			System.out.println(guess);
			break;
		case 2:
			int l1 = in.nextInt();
			String[] arr1 = new String[l1];
			for (int i = 0; i < l1; i++) {
				arr1[i] = in.next();
			}
			insertionSort(arr1);
			break;
		}

	}

}
