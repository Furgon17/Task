package module1;

import java.util.Arrays;

public class Task21 {
    public static void main(String[] args) {
        int[] a = {2, 1, 5, 4, 9,};
        int[] b = {10, 6, 3, 7, 8};
        mergeAndSort(a, b);

    }

    public static void mergeAndSort(int[] firstArray, int[] secondArray) {
        //Создаю из двух массивов 1
        int size = firstArray.length + secondArray.length;
        int[] c = new int[size];
        for (int i = 0; i < firstArray.length; i++) { //Добавляем эл-ты первого массива
            c[i] = firstArray[i];
        }
        int index = firstArray.length;// продолжаем заполнение с индекса, равного размеру 1-го массива
        for (int j = 0; j < secondArray.length; j++) { //Добавляем эл-ты второго массива
            c[index++] = secondArray[j];
        }
        // Сортируем массив
        int temp = 0;
        boolean isSorted = false;
        while (!isSorted) { // Пока массив не отсортирован
            isSorted = true; // Считаем, что массив отсортирован true
            for (int i = 1; i < (c.length); i++) {
                if (c[i] < c[i - 1]) {
                    temp = c[i]; //записываем меньшее значине во временную переменную
                    c[i] = c[i - 1]; // записываем наибольшее значение
                    c[i - 1] = temp; // а на его место ставим больший
                    isSorted = false; // Если происходит хоть одна сортировка, то делаем false
                }
            }
        }
        // Выводим на экран
        System.out.print("[");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
            if (i < c.length - 1) System.out.print(", ");
        }
        System.out.print("]");
    }

}
