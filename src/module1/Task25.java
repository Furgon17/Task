package module1;
import java.util.Arrays;
class Task25 {
	public static void main(String args[]) {
		int[] arr = {1, 2, 3, 46, 5, 9, 6, 7, 1, 4, 3};
		printOddNumbers(arr);
	}

	public static void printOddNumbers(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i]);
				if (arr[arr.length - 1] % 2 == 0) {
					if (i < arr.length - 2) System.out.print(",");
				} else {
					if (i < arr.length - 1) System.out.print(",");
				}
			}
		}
		System.out.println();
	}
}