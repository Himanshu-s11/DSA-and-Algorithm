//this leetcode 1295 problem no
public class LeetCodeEvenProblem {

	static int findNumber(int[] nums) {
		int count=0;
		for(int i: nums) {
			if(i%2==0) {
				count=count+1;
			}
		}
		return count;
	}
	
	static int digit(int num) {
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] nums= {22,21,45,6,44,23,8};
		int num= 23232;
		System.out.println(findNumber(nums));
		System.out.println(digit(num));
	}
}
