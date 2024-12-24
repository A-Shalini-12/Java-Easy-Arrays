package easyArrayProblems;

public class CheckPalindromeArray {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,3,2,1};
		System.out.println(isPalindrome(array));
		
		
	}

	private static boolean isPalindrome(int[] array) {
		
		int arraylength=array.length;
		int i=0,j=arraylength-1;
		
		while(i<arraylength) {
			if(array[i++]!=array[j--])
			{
				return false;
				
			}
			
		}
		return true;
		
	}

}
