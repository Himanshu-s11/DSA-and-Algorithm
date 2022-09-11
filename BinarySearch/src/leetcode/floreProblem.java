package leetcode;

public class floreProblem {
	 public static int flore(int[] num, int target) {
	    	int start=0;
	    	int end=num.length-1;
	    	if(target>num[num.length-1]) {
	    		return-1;
	    	}
	    	while(start<=end) {
	    		int mid=start+(end-start)/2;
	    		if(target<num[mid]) {
	    			end=mid-1;
	    		}else if(target>num[mid]) {
	    			start=mid+1;
	    		}else {
	    			return num[mid-1];
	    		}
	    	}
	    	 return num[end];
	    }
	   
	    public static void main(String[] args) {
	    	int arr[]= {2,4,12,13,44,45,56,67,78};
			int ans= flore(arr, 14);
			System.out.println(ans);
		}
}
