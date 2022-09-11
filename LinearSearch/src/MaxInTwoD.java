import java.util.Arrays;

public class MaxInTwoD {
	public static void main(String[] args) {
		
	int[][]	arr= {
			{1,2,3},//0 index
			{4,5,},//1st
			{6,7,8}//2nd
	};
	
	
	System.out.println(max(arr));
}
	static int max(int[][] arr) {
		int max= Integer.MIN_VALUE;
		for(int[] i: arr) {
			for(int j:i) {
			if(j>max) {
			max=j;
			}
			}
		}
		return max;
		
	}

}
