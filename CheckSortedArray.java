package easyArrayProblems;

public class CheckSortedArray {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,1};
		System.out.println(isSortedArray(array));

	}

	private static boolean isSortedArray(int[] array) {
		
		for(int i=0;i<array.length-1;i++) {
			if(array[i]>array[i+1])
			{
				return false;
			}
		}
		return true;
	}

}
