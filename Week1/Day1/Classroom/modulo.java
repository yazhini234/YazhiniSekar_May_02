package Day1;

public class modulo {

	public static void main(String[] args) {
		int result = 0;
		int quotient = 123;
		int remainder = 0;

		while (quotient > 0) {
			remainder = quotient % 10;
			System.out.println("remainder is" +remainder);
			quotient = quotient / 10;
			System.out.println("remainder is" +quotient);
			result = result + remainder;
			System.out.println("remainder is" +result);
		}
		System.out.println("Sum is "+result);
	}
}