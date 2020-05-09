package Day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "Welcome to Chennai";
		char[] c = str.toCharArray();
		int count;
		String processedChar = "";
		for (int i = 0; i < c.length; i++) {
			count = 1;
			if (!processedChar.contains(String.valueOf(c[i]))) {
				for (int j = i + 1; j < c.length; j++) {
					if (c[i] == c[j])
						++count;
				}
				processedChar = processedChar.concat(String.valueOf(c[i]));
				System.out.println(c[i] + "->" + count);
			}
		}
	}
}
