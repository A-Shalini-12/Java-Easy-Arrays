package easyArrayProblems;

import java.util.Arrays;

public class FindMaxElementInArray {

	public static void main(String[] args) {
		int arr[]= {-80,-30,-50,-90};
		
		int maximumValue=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>maximumValue)
			{
				maximumValue=arr[i];
			}
		}
		System.out.println("Maximum value using forloop "+maximumValue);
		
//		OPTIMIZED SOLUTION
		System.out.println("Maximum value using stream "+Arrays.stream(arr).max().getAsInt());
		
		

	}

}
