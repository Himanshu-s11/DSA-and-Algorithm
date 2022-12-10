
public class SumOfDegit {

	public static void main(String[] args) {
		System.out.println(sumofDegit(2045));
	}

	private static int sumofDegit(int n) {
		int rem=0;
		if(n==0) {
			return 0;
		}
		rem=n%10;
		n=n/10;
		return (rem+sumofDegit(n));
	}
}
