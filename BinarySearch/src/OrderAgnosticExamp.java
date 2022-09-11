//when the array is not sorted
public class OrderAgnosticExamp {

	static int oerderAgnostic(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		
		//find array is sorted in ass or dsc
		boolean isass= arr[start]<arr[end];
//		if(start<end) {
//			isass=true;
//		}else {
//			isass=false;
//		}
		while(start<=end) {
			int mid=start+(end-start)/2;
		if(target==arr[mid]) {
			return mid;
		}else {
			if(isass) {
				if(target>arr[mid]) {
					start=mid+1;
				}else{
					end=mid-1;
				}
			}else {
				if(target>arr[mid]) {
					end=mid-1;
				}else{
					start=mid+1;
				}
				
			}
		}
	}
		return -1;
   }
	
	public static void main(String[] args) {
		int arr[]= {2,4,12,13,44,45,56,67,78};
		int ans= oerderAgnostic(arr, 2);
		System.out.println(ans);
	}
}
