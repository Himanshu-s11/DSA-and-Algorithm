package leetcode;

public class NArrarySearch {

	static int ans(int[] arr, int target) {
		int start=0;
		int end=1;
		while(target>arr[end]) {
			int newStart= end+1;
			//duble the size of box
			end= end+(end-start)*2;
			start= newStart;
		}
		return search(arr, target, start, end);
	}
	
	static int search(int[] arr, int target, int start, int end) {
		//start with size of 2
		
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
		int ans= ans(arr, 44);
		System.out.println(ans);
	}
}
