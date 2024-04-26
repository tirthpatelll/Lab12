/* 
 * Name : Tirth Patel, Wilson Tran
 * Course : CSCI 1302
 * Description : Recursively reverse a String.
 * Last Modified : April 26 2024
 */
public class Lab12Prob02 {

	public static void main(String[] args) {
		
		System.out.println(reverseString("tirth"));
		
	}
	
	public static String reverseString(String s) {
		
		//if (s.length() == 1) {
			//return s;
		//} else {
			//return String.valueOf(s.charAt(s.length() -1)) + reverseString(s.substring(0, s.length() - 1));
		//}
		return reverse(s, s.length() - 1);
		
	} public static String reverse(String s, int index) {
		
		if (index == 0) {
			return String.valueOf(s.charAt(index));
		} else {
			return s.charAt(index) + reverse(s, index - 1);
		}
		
	}

}
