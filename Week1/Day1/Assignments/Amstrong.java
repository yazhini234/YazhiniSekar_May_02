package Day1;

public class Amstrong {
	
	public static void main(String[] args) {
		int result = 0;
		int quotient= 153;
		int original = 153;
		int remainder = 0;

		while (quotient > 0) {
			remainder = quotient % 10;
		    quotient = quotient / 10;
			result = result + (remainder*remainder*remainder);
			
		}
	if(result==original)
		System.out.println("its an Amstrong number");
	}

}
