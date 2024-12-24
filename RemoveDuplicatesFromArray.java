package easyArrayProblems;

import java.util.HashSet;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[] arr = { 0, 3, 5, 7, 2, 6,5,7,5};
		HashSet<Integer>removeDuplicateSet=new HashSet<>();
		for(int i:arr) {
			removeDuplicateSet.add(i);
		}
		System.out.println(removeDuplicateSet.toString());
		
		

	}

}
