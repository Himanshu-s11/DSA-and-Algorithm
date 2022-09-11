package leetcode;
//81  Search in Rotated Sorted Array II
public class RotatedArray {
	
	 static boolean search(int[] nums, int target) {
		 
	        int pivot = findPivot(nums);
	        System.out.println("poivt2"+" "+ pivot);
	        if(pivot==-1){
	            int ans= binarySearch(nums,target,0,nums.length-1);
	            System.out.println("poivt1"+ ans);
	            if( ans==-1) {
	            	return false;
	            }else {
	            	return true;
	            }
	        }
	        if(nums[pivot]==target){
	        	
	            return true;
	        }
	        if(target>= nums[0]){
	            int find= binarySearch(nums,target,0,pivot-1);
	            if(find==-1) {
	            	return false;
	            }else {
	            	return true;
	            }
	        }else{
	            int finds= binarySearch(nums,target,pivot+1,nums.length-1);
	            if(finds ==-1) {
	            	return false;
	            }else {
	            	return true;
	            }
	        }
	    
	 }  
	       static int binarySearch(int[] nums, int target, int start, int end){
			//boolean isAsc= arr[start]<arr[end];
			while(start<=end){
				int mid=start+(end-start)/2;
				if(target==nums[mid]) {
					return mid;
				}else {
						if(target>nums[mid]) {
							start=mid+1;
						}else{
							end=mid-1;
						}
	            }
			}
			return -1;
		}

	 //if element ayt m,s,e are equal thn just skip duplicate       
	     static int findPivot(int[] nums){
	        int start=0;
	        int end=nums.length-1;
	            while(start<=end){
	                int mid=start+(end-start)/2;
	                if(mid<end && nums[mid]>nums[mid+1]){
	                    return mid;
	                } if(mid>start && nums[mid]<nums[mid-1]){
	                    return mid-1;
	                }else if(nums[mid]==nums[start] && nums[mid]==nums[end]) {
	                	//check if start is pivot
	                	if(nums.length!=1 && nums[start]>nums[start+1]) {
	                		return start;
	                	}
	                	start++;
	                	if(nums.length!=1 && nums[end]<nums[end-1]) {
	                		return end-1;
	                	}
	                	end--;
	                }else if(nums[start]<nums[mid] || nums[mid]<=nums[start] && nums[mid]> nums[end]){
	                	start=mid+1;
	                }else{
	                    end=mid-1;
	                }
	            }
	             return -1;
	        }
	      public static void main(String[] args) {
			int[] num= {1,1,3};
			System.out.println(search(num,0));
		}
	       
}
