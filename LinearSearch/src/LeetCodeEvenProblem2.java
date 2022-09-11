//leetcode problem no 1672
public class LeetCodeEvenProblem2 {
	
	public static void main(String[] args) {
		
	}
public int maxWealth(int[][] accounts) {
	int ans=Integer.MIN_VALUE;
	for(int[] i:accounts) {
		int sum=0;
		for(int j:i) {
			
			sum += j;
		}
		if(sum>ans) {
			ans=sum;
		}
	}
	return ans;
}
}
