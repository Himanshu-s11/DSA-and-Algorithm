import java.util.Arrays;

//when given no from range 1 to n
public class CyclicSortExamp {
     static void cyclic(int[] arr) {
    	 int i=0;
    	 while(i<arr.length) {
    		 int correct=arr[i]-1;
    		 if(arr[i]!=arr[correct]) {
    			 swap(arr,i,correct);
    		 }else {
    			 i++;
    		 }
    			 
    	 }
     }
     static void swap(int[] arr ,int first, int second) {
		 int temp=arr[first];
			arr[first]=arr[second];
			arr[second]=temp; 
	 }
     public static void main(String[] args) {
		 int[] arr= {7,3,2,5,6,4,1};
			cyclic(arr);
			System.out.println(Arrays.toString(arr));
	}
}

