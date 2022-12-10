
public class BinarySearch {
  public static void main(String[] args) {
	  int[] n= {1,2,3,4,5,6,7};
	  int t=5;
	System.out.println(search(n,t,0,n.length-1));
}
  static int search(int[] n, int t , int s,int end) {
	  
	  if(s>end) {
		  return -1;
	  }
	 int mid= s+(end-s)/2;
	 if(t==n[mid]) {
		 return mid;  
	 }
	 if(t<n[mid]) {
		return search(n, t, s, end=mid-1);
	 }else {
		return  search(n, t, s=mid+1, end);
	 }
	
  }
}
