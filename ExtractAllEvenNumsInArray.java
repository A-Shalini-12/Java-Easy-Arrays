package easyArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractAllEvenNumsInArray {

	public static void main(String[] args) {
		int array[]= {1,4,2,7,9,6,8};
		ArrayList<Integer> evenNumberList = new ArrayList<>();
		
		Arrays.stream(array).filter(x->x%2==0).forEach(i->evenNumberList.add(i));
		System.out.println(evenNumberList.toString());
		
	}

}
