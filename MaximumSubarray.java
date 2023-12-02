package zsgs;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumSubarray {
	public static void maximumSubarray(int[] subArray) {
		int start = 0, end = 0;
		int sum = Integer.MIN_VALUE;
		for (int i = 0; i < subArray.length; i++) {
			int temp = 0;
			for (int j = i; j < subArray.length; j++) {
				temp += subArray[j];
				if (temp > sum) {
					sum = temp;
					start = i;
					end = j;
				}
			}
		}
		int[] result = new int[end - start + 1];
		int j = 0;
		for (int i = start; i <= end; i++) {
			result[j++] = subArray[i];

		}
		printMatrix(result);

	}

	public static void printMatrix(int[] result) {
		for (int k = 0; k < result.length; k++) {
			System.out.print(result[k] + " ");
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array length");
		int len = scan.nextInt();
		int[] subarray = new int[len];
		System.out.println("Enter the Array");
		for (int i = 0; i < len; i++) {
			subarray[i] = scan.nextInt();
		}
		maximumSubarray(subarray);

	}

}
