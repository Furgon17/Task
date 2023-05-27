package module1;
import java.util.Arrays;
class Task23 {
	public static void main(String args[]) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		getArrayMiddle(arr);
	}

	public static void getArrayMiddle(int[] numbers) {
		int size = numbers.length;
		if (size % 2 == 0) {
			int[] arr = new int[2];
			System.arraycopy(numbers, size / 2 - 1, arr, 0, 2);
			System.out.println(Arrays.toString(arr));
		}
		if (size  % 2 != 0) {
			int[] arr = new int[1];
			System.arraycopy(numbers, size / 2, arr, 0, 1);
			System.out.println(Arrays.toString(arr));
		}
	}
}
