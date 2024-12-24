package easyArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementAtIndex {

	public static void main(String[] args) {
		int array[]= {1,2,4,5,6};
		int index=2;
		ArrayList<Integer>list=new ArrayList<>(Arrays.asList(
				Arrays.stream(array).boxed().toArray(Integer[]::new)));
		list.remove(index);
		System.out.print(list.toString());
		
	}

}
