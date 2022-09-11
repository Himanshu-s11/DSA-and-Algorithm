
public class FindMax {

	static int findMaximum(int[] arr) {
		int ans= arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>ans) {
				ans= arr[i];
				
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr= {22,21,33,44,55,32,1,-9,54};
		System.out.println(findMaximum(arr));
	}
}
