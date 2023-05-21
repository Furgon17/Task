package module1;
import java.util.Arrays;
class Task24 {
	public static void main(String args[]) {
		int[] arr1 = {9, 2, 8, 4};
		int[] arr2 = {5, 6, 1};
		mergeAndSort(arr1, arr2);
	}

	public static void mergeAndSort(int[] firstArray, int[] secondArray) {
		int[] arr = new int[firstArray.length + secondArray.length];
		System.arraycopy(firstArray, 0, arr, 0, firstArray.length);
		System.arraycopy(secondArray, 0, arr, firstArray.length, secondArray.length);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}