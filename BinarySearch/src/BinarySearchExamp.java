
public class BinarySearchExamp {
    //return the index
	static int binarySearch(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		System.out.println(end);
		while(start<=end) {
			//double mid= (start+end)/2;
			int mid=start+(end-start)/2;
			if(target<arr[mid]) {
				end= mid-1;
			}else if(target>arr[mid]) {
				start=mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {2,4,12,13,44,45,56,67,78};
		int ans= binarySearch(arr, 44);
		System.out.println(ans);
}}
