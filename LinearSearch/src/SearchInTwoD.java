import java.util.Arrays;

public class SearchInTwoD {
	public static void main(String[] args) {
		int[][]	arr= {
				{1,2,3},//0 index
				{4,5,},//1st
				{6,7,8}//2nd
		};
		int target= 70;
		
		System.out.println(Arrays.toString(searchInTwoDArrays(arr, target)));
	}
	static int[] searchInTwoDArrays(int arr[][], int target){
		if(arr.length==0) {
			  return new int[] {-1};
		  }
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
		int n = arr[row][col];
		if(target == n) {
			return new int[] {row,col};
		}
		}
	}
		 return new int[] {-1};
}
}