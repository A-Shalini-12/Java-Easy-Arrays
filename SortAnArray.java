package easyArrayProblems;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		int[] arr = { 0,3,5,7,2,6};
		int arrlength = arr.length;
		for(int i=0;i<arrlength;i++)
		{
			for(int j=i+1;j<arrlength;j++)
			{
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		

	}

}
