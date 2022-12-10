
public class ODDEven {

	public static void main(String[] args) {
		int n =67;
		System.out.println(isOdd(n));
	}

	private static boolean isOdd(int n) {
		// TODO Auto-generated method stub
		
	return (n & 1) ==1;
	}
}
