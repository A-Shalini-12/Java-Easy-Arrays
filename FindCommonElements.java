package easyArrayProblems;

import java.util.ArrayList;
import java.util.HashSet;

public class FindCommonElements {

	public static void main(String[] args) {
		int array1[]= {1,2,3,4,5,6};
		int array2[]= {1,2,3,4,5};
		
		HashSet<Integer>arrayElementsSet=new HashSet<>();
		ArrayList<Integer>commonElementsList=new ArrayList<>();
		
		for(int num:array1)
		{
			arrayElementsSet.add(num);
			
		}
		for(int num:array2)
		{
			if(arrayElementsSet.contains(num)) {
				commonElementsList.add(num);
			}
			
		}
		
		System.out.print(commonElementsList.toString());
		
		
	}

}
