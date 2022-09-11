package leetcode;
//153
public class MinimumInRotatedSortedArray {
	public static int findMin(int[] nums) {
        // finding the pivot element
        // pivot element is the highest element in the array and if pivot's index = len of array -1, then it means the array was never rotated or it was rotated sufficient times to be converted into the og array
        int pivot = findPivot(nums);
        if(pivot== nums.length-1){
            //if the array was never rotated or is in the og position
            return nums[0];
        }
        //if array was atleast once rotated return this
       return nums[pivot+1];
    }
    public static int findPivot(int [] nums){
       int start =0;
       int end =nums.length-1;
        // simple BS to find the pivot of the array
        while(start<=end){
            int mid = start+(end-start)/2;
            //check for pivot and pivot +1 element
            if(mid<end &&nums[mid]>nums[mid+1]){
                return mid;
            }
            //check for pivot-1 and pivot element
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            //check for the mid in the second half of the array
           else if(nums[mid]<nums[start]){
               end = mid-1;
           }
            //check for the mid in the first half of the array
            else{
                start= mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
		int[] num= {3,4};
		System.out.println(findMin(num));
	}
    
}
