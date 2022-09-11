package leetcode;
//1095
public class MountainArrayHard {

	public static int search(int[] arr, int target ) {
		int peak= peakIndexMountainArray(arr);
		int firstTry= binarySearch(arr, target, 0, peak);
		if(firstTry!=-1) {
			return firstTry;
		}
	//other wise try to search in second half
		return binarySearch(arr, target, peak+1, arr.length-1);
		
	}

	private static int binarySearch(int[] arr, int target, int start, int end) {
		boolean isAsc= arr[start]<arr[end];
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target==arr[mid]) {
				return mid;
			}else {
				if(isAsc) {
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

	private static int peakIndexMountainArray(int[] arr) {
		int start=0;
		int end=arr.length;
        while(start<end){
            int mid= start+(end-start)/2;
            
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,3,1};
		int ans= search(arr, 3);
		System.out.println(ans);
	}
}
