import java.util.Arrays;

public class BubbleSoert {

	static void bubble(int[] arr) {
		//run the steps n-1 time
		for(int i=0; i<=arr.length-1;i++) {
			boolean swap=false;
			for(int j=1; j< arr.length-i; j++) {
				//swap if item is smaller than the privous one
				if(arr[j]<arr[j-1]) {
			    //swap
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				swap=true;
			}
		}
			if(!swap) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,2,5,6,4,0,0};
		bubble(arr);
		System.out.println(Arrays.toString(arr));
	}
	
}
