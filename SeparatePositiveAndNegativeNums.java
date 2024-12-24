package easyArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class SeparatePositiveAndNegativeNums {

	public static void main(String[] args) {
		int array[]= {-1,2,-3,4,-5,-6};
		
		List<Integer> positiveNumbersList = new ArrayList<>();
        List<Integer> negativeNumbersList = new ArrayList<>();
        
        for(int num:array)
        {
        	if(num>0)
        	{
        		positiveNumbersList.add(num);
        		
        	}
        	else {
        		negativeNumbersList.add(num);
        		
        	}
        }
        System.out.println(positiveNumbersList.toString());
        System.out.println(negativeNumbersList.toString());
        
		

	}

}
