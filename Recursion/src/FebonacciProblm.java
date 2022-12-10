//find the nTH febonacci no
//0,1,1,2,3,5,8,13...
//fibo(n)=f(n-1)+f(n-2)
public class FebonacciProblm {
   public static void main(String[] args) {
	System.out.println(febo(2));
}
   static int febo(int n) {
	   while(n<2) {
		   return n;
	   }
	return febo(n-1)+febo(n-2);   
   }
}
