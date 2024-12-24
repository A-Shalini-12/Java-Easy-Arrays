package easyArrayProblems;


import java.util.stream.IntStream;

public class SearchForAnElement {

	public static void main(String[] args) {
		int[] arr = { 0,3,5,7,2,6};
		int arrlength = arr.length;
		int elementToSearch=7;
		boolean isElementFound=false;
		int searchElementIndex=-1;
		for(int i=0;i<arrlength;i++)
		{
			if(arr[i]==elementToSearch) {
				isElementFound=true;
				searchElementIndex=i;
				break;
			}
				
		}
		System.out.println(isElementFound?"Element "+elementToSearch +" is found at the index "+searchElementIndex:"No such element found");
		
//		USING INTSTREAM
		int searchElementIndex2= IntStream.range(0, arrlength).filter(i->arr[i]==elementToSearch).findFirst().orElse(-1);
		System.out.println(searchElementIndex2!=-1?"Element "+elementToSearch +" is found at the index "+searchElementIndex2:"No such element found");
	
	}

}
