//import java.util.Stack;

public class NtoOne {
   public static void main(String[] args) {
	fun(10);
}
	public static void fun(int n) {
		if(n==0) {
			return ;
		}
//		Stack<Integer> st= new Stack<Integer>();
//		st.push(n);
		System.out.println(n);
		fun(n-1);
		System.out.println(n);
		
	}
}
