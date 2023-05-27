package module1;

public class Task20 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        inverseArray(arr);
    }

    public static int[] inverseArray(int[] numbers) {
        int[] arrJ = new int[numbers.length];
        int j = 0;
        for (int i = (numbers.length - 1); i >= 0; i--) {
            arrJ[j] = numbers[i];
            j++;

        }
        System.out.print("[");
        for (int i = 0; i < arrJ.length; i++) {
            System.out.print(arrJ[i]);
            if (i < arrJ.length - 1) System.out.print(", ");
        }
        System.out.print("]");
        return arrJ;
    }
}

