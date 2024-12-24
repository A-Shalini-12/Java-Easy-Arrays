package easyArrayProblems;

import java.util.Arrays;

public class FindMinElementInArray {

	public static void main(String[] args) {
		int arr[]= {-80,-30,-50,-90};
		int minimumValue=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<minimumValue)
			{
				minimumValue=arr[i];
			}
		}
		System.out.println("Minimum value using forloop "+minimumValue);
		
		
//		OPTIMIZED SOLUTION
		System.out.println("Minimum value using stream "+Arrays.stream(arr).min().getAsInt());
		
		
	}

}
