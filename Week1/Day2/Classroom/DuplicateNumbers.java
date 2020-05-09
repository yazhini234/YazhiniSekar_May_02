package Day2;

public class DuplicateNumbers {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int l = arr.length;
		for (int i = 1; i < l; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
}
