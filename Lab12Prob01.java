
public class Lab12Prob01 {

	public static void main(String[] args) {
		
		System.out.println(recursiveAbstract(9));
		
	}
	
	public static int recursiveAbstract(int n) {
		if (n == 2) {
			return 4;
		}
		else if (n == 1) {
			return 3;
		}
		else if (n == 0) {
			return 1;
		}
		else {
			return recursiveAbstract(n - 3) * (recursiveAbstract(n - 2) - recursiveAbstract(n - 1));
		}
	}

}
