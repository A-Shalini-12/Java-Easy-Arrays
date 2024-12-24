package easyArrayProblems;

import java.util.HashMap;
import java.util.Map.Entry;

public class CountOccurrenceOfElement {

	public static void main(String[] args) {
		int[] arr = { 0, 3, 5, 7, 2, 6,5,7,5};
		HashMap<Integer,Integer> countElementOccurance=new HashMap<>();
		for(int i:arr)
		{
			countElementOccurance.put(i,countElementOccurance.getOrDefault(i, 0)+1);
			
		}
		for(Entry<Integer, Integer>entry:countElementOccurance.entrySet()) {
			
			System.out.println("Element "+entry.getKey()+" has Occured "+entry.getValue());
			
		}
		
	}

}
