
public class PelindromeNo {
	static int sum = 0;
	public static void rev(int n) {
		
		if(n==0) {
			return;
		}
		int rem=n%10;
		sum=sum*10+rem;
		rev(n/10);
	}
	
   public static void main(String[] args) {
	   rev(12);
	System.out.println(sum);
	System.out.println(pelindrom(12));
}

public static boolean pelindrom(int i) {
	
	return rev(i);
}
	}

