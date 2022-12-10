import java.util.Arrays;

public class SectionSortExp {
      static void selection(int[] arr) {
    	  for(int i=0; i<arr.length; i++) {
    		  //find the max intem in remaining array ans swap it with correct index
    		  int last=arr.length-i-1;
    		  int max= getMaxIndex(arr, 0,last);
    		  swap(arr,max,last);
    	  }
      }

	 static int getMaxIndex(int[] arr, int start, int last) {
		// TODO Auto-generated method stub
		 int max=start;
		 for(int i=start; i<=last; i++) {
			 if(arr[max]<arr[i]) {
				 max=arr[i];
			 }
		 }
		return max;
	}
	 static void swap(int[] arr ,int first, int second) {
		 int temp=arr[first];
			arr[first]=arr[second];
			arr[second]=temp; 
	 }
	 
	 public static void main(String[] args) {
		 int[] arr= {7,2,3,2,5,6,4};
			selection(arr);
			System.out.println(Arrays.toString(arr));
	}
}
