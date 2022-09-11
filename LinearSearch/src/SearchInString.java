
public class SearchInString {
  static boolean search(String str, char target) {
	  if(str.length() == 0) {
		  return false;
	  }
	  for(int i=0; i<str.length(); i++) {
		  if(target == str.charAt(i)) {
			  return true;
		  }
	  }
	  return false;
  }
  //using for each
  static boolean search2(String str, char target) {
	  if(str.length() == 0) {
		  return false;
	  }
	  for(char c: str.toCharArray()) {
		  if(target == c) {
			  return true;
		  }
	  }
	  return false;
  }
  
  
  public static void main(String[] args) {
	String str = "Himanshu";
	 char target= 'u';
	 System.out.println(search(str, target));
	 System.out.println(search2(str, target));
}
}
