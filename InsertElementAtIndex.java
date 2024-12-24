package easyArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertElementAtIndex {

	public static void main(String[] args) {
		int array[]= {1,2,4,5,6};
		int index=2,element=3;
		
		ArrayList<Integer>list=new ArrayList<>(Arrays.asList(
				Arrays.stream(array).boxed().toArray(Integer[]::new)));
		list.add(index, element);
		
		System.out.print(list.toString());
		
		
		
//		.boxed():
//
//			Transforms the primitive int elements into their wrapper class (Integer), creating a Stream<Integer>.

//		.toArray(Integer[]::new):
//
//			Collects the Stream<Integer> into an array of Integer objects (Integer[]).


	}

}
