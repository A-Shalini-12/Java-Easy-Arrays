package easyArrayProblems;

import java.util.Arrays;

class ReverseAnArray {
	public static void main(String[] args) {
		int[] arr = { 0, 3, 5, 7, 2, 6 ,9};
		int arrlength = arr.length;
		int reverseArray[] = new int[arrlength];
		for (int i = arrlength - 1, j = 0; i >= 0; i--, j++) {
			reverseArray[j] = arr[i];
		}
		System.out.println("Non optimized Solution " + Arrays.toString(reverseArray));

//		OPTIMIZED SOLUTION
		int i = 0;
		while (i < arrlength / 2) {
			int temp = arr[i];
			arr[i] = arr[arrlength - (1 + i)];
			arr[arrlength - (1 + i)] = temp;
			i++;
		}
		System.out.println("Optimized Solution  " + Arrays.toString(arr));

	}
}