
public class FindSingleNo {

	public static void main(String[] args) {
		int[] arr= {1,3,4,2,1,4,6,2,3};
		System.out.println(ansOfArry(arr));
	}

	private static int ansOfArry(int[] arr) {
		// TODO Auto-generated method stub
		int unique=0;
		
		for(int n: arr) {
			unique^=n;
		}
		return unique;
	}
}
