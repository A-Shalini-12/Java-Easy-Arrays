package easyArrayProblems;

import java.util.ArrayList;

public class PrintDiagonalElements {

	public static void main(String[] args) {
		int twoDimensionalArray[][]= {{1,2,3},{4,5,6},{7,8,9}};
		ArrayList<Integer>diagonalList=new ArrayList<>();
		int arraylength=twoDimensionalArray.length-1;
		for(int i=0;i<twoDimensionalArray.length;i++)
		{
			for(int j=0;j<twoDimensionalArray[i].length;j++)
			{
				if(j==arraylength) {
					diagonalList.add(twoDimensionalArray[i][j]);
					
				}
			}
			arraylength--;
		}
		System.out.println(diagonalList.toString());
		
		
//		OPTIMIZED
		int arraylength2=twoDimensionalArray.length-1;
		ArrayList<Integer>diagonalList2=new ArrayList<>();
		for(int i=0;i<twoDimensionalArray.length;i++) {
			diagonalList2.add(twoDimensionalArray[i][arraylength2-i]);
		}
		
		System.out.print(diagonalList2.toString());
		

	}

}
