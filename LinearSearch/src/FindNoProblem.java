import java.util.Scanner;

public class FindNoProblem {
	
	//Scanner in =new Scanner(System.in);
	//search in the array and return the no itself
	static int linearSearch2(int[] arr, int target) {
		  if(arr.length==0) {
			  return -1;
		  }
		   
		  for(int i:arr) {
			  
			  if(i == target ) {
				  return i;
			  }
		  }
			return -1;
			
		}
	//search in array and return the index
	static int linearSearch(int[] arr, int target) {
	  if(arr.length==0) {
		  return -1;
	  }
	   
	  for(int i=0; i<arr.length; i++) {
		  int n= arr[i];
		  if(n == target ) {
			  return i;
		  }
	  }
		return -1;
		
	}

	public static void main(String[] args) {
		int[] arr= {22,21,33,44,55,32,1,54};
		int target= 32;
		int ans= linearSearch(arr, target);
		System.out.println(ans);
		int ans2= linearSearch2(arr, target);
		System.out.println(ans2);
	}
}
