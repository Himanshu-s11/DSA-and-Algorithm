
public class SearchByRange {
  static int searchInRange(int[] arr, int start, int end, int target){
	  if(arr.length==0) {
		  return -1;
	  }
	  for(int i= start; i<=end; i++) {
		  int n= arr[i];
		  if(target == n) {
			  return i;
		  }
	  }
	  return end;
	  
  }
  public static void main(String[] args) {
	  int[] arr= {22,21,33,44,55,32,1,54};
		int target= 32;
		int start= 3;
		int end=7;
		int ans= searchInRange(arr, target, start, end);
		System.out.println(ans);
}
}
