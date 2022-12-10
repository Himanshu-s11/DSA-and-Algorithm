//write a function that takes in a number and print it 
//print first 5 no:1,2,3,4,5
public class NumberExamp {
     public static void main(String[] args) {
		printNo(1);
	}
     static void printNo(int n) {
    	 //base condition -where recursion stop making new call
    	 if(n==5) {
    		 System.out.println(n);
    		 return;
    	 }
    	System.out.println(n);
    	//if function is being called again and again it will take separate memory in stack
    	//space complex is not constant because of rec call.
    	printNo(n+1);
     }
     
}