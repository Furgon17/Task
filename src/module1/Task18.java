package module1;
public class Task18 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,5,7,10,12,13,45};
        getSubArrayBetween(arr,2,11);
    }
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        // Проверяем входные параметры
        if (numbers == null || numbers.length == 0 || start > end) {
            return new int[0];
        }

        // Вычисляем размер подмассива
        int size = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                size++;
            }
        }

        // Создаем и заполняем подмассив
        int[] arr = new int[size];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                arr[index++] = numbers[i];
            }
        }
        System.out.print("[");
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
            if (i<arr.length - 1) System.out.print(", ");
        }
        System.out.print("]");

        return arr;
    }
}