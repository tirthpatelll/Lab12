
public class Lab12Prob03 {

	public static void main(String[] args) {
		
		System.out.println(reverseString("tirth"));
		
	}
	
	public static String reverseString(String s) {
		
		return reverse(s, s.length() - 1);
		
	} public static String reverse(String s, int index) {
		
		if (index == 0) {
			return "" + s.charAt(index);
		} else {
			return s.charAt(index) + reverse(s, index - 1);
		}
		
	}

}
