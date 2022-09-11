package leetcode;

public class FindTheDuplicateNumber {
	 public static int findDuplicate(int[] nums) {
	        int start=0;
	        int end=nums.length-1;
	        while(start<=end){
	            int mid= start+(end-start)/2;
	            if(nums[mid]==nums[mid+1]){
	                return nums[mid];
	            }if( nums[mid]==nums[mid-1]){
	                return nums[mid];
	            }
	        }
	        return -1;
	    }
	 public static void main(String[] args) {
		int[] num= {1,3,4,2,2};
		System.out.println(findDuplicate(num));
	}
}
