package easyArrayProblems;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int array1[]= {1,2,3,4,5};
		int array2[]= {6,7,8,9};
		int resultArray[]=new int[array1.length+array2.length];
		System.arraycopy(array1, 0, resultArray, 0, array1.length);
		System.arraycopy(array2, 0, resultArray, array1.length, array2.length);
		System.out.print(Arrays.toString(resultArray));
		

	}

}
