

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Day8 {
	static int binarySearch() {
		String[] a = new String[100];
		String x;
		Scanner in1 = new Scanner(System.in);
		x = in1.next();
		in1.close();
		String filelocation = "F:\\eclipse web projects\\bridgelabz bootcamp\\src\\Day8\\names.csv";
		String line = "";
		int j = 0;
		try {

			BufferedReader br = new BufferedReader(new FileReader(filelocation));
			while ((line = br.readLine()) != null) {
				String[] employee = line.split(",");
				for (int i = j; i < employee.length; i++) {
					a[j] = employee[i];
					j++;
				}

			}
			br.close();
		}
		 
		catch (IOException e) {
			e.printStackTrace();
		}
		String arr[] = new String[j];
		for (int i = 0; i < j; i++) {
			arr[i] = a[i];
		}
		Arrays.sort(arr);
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int m = left + (right - left) / 2;

			int res = x.compareTo(arr[m]);
			if (res == 0)
				return m;
			if (res > 0)
				left = m + 1;
			else
				right = m - 1;
		}
	
		return -1;
	}

	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
	}

	public static String[] mergeSort(String[] list) {
		String[] sorted = new String[list.length];
		if (list.length == 1) {
			sorted = list;
		} else {
			int mid = list.length / 2;
			String[] left = null;
			String[] right = null;
			if ((list.length % 2) == 0) {
				left = new String[list.length / 2];
				right = new String[list.length / 2];
			} else {
				left = new String[list.length / 2];
				right = new String[(list.length / 2) + 1];
			}
			int x = 0;
			int y = 0;
			for (; x < mid; x++) {
				left[x] = list[x];
			}
			for (; x < list.length; x++) {
				right[y++] = list[x];
			}
			left = mergeSort(left);
			right = mergeSort(right);
			sorted = mergeArray(left, right);
		}

		return sorted;
	}

	private static String[] mergeArray(String[] left, String[] right) {
		String[] merged = new String[left.length + right.length];
		int lIndex = 0;
		int rIndex = 0;
		int mIndex = 0;
		int comp = 0;
		while (lIndex < left.length || rIndex < right.length) {
			if (lIndex == left.length) {
				merged[mIndex++] = right[rIndex++];
			} else if (rIndex == right.length) {
				merged[mIndex++] = left[lIndex++];
			} else {
				comp = left[lIndex].compareTo(right[rIndex]);
				if (comp > 0) {
					merged[mIndex++] = right[rIndex++];
				} else if (comp < 0) {
					merged[mIndex++] = left[lIndex++];
				} else {
					merged[mIndex++] = left[lIndex++];
				}
			}
		}
		return merged;
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("1. binary search words");
		System.out.println("2. bubble sort");
		System.out.println("3. merge sort");
		int n = in.nextInt();
		switch (n) {
		case 1:
			int check = binarySearch();
			if (check == -1) {
				System.out.println("Not found");
			} else {
				System.out.println("Found");
			}
			break;

		case 2:
			int arraylen = in.nextInt();
			int[] a = new int[arraylen];
			for (int i = 0; i < a.length; i++) {
				a[i] = in.nextInt();
			}
			bubbleSort(a);
			break;
		case 3:
			int l = in.nextInt();
			String[] arr = new String[l];
			for (int i = 0; i < l; i++) {
				arr[i] = in.next();
			}
			arr=mergeSort(arr);
			for (int i = 0; i < l; i++) {
				System.out.println(arr[i]);
			}
			
			break;
		default:
			System.out.println("Enter correct choice");

		}
		in.close();
	}
}
