package TregulovLessons.Les7_Sorted;

import java.util.Arrays;

public class Lesson5 {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        //Сортировка в потоке методом sorted()
//        array = Arrays.stream(array).sorted().toArray();
//        System.out.println(Arrays.toString(array));
        //Через фильтрацию берем только нечетные элементы, далее с помощью метода map делим на 3 только те числа,
        // которые делятся на 3 без остатка. Далее с помощью reduce(a,e) вычисляем сумму массива, где а - аккумулятор, в который записывается сумма.
        int result = Arrays.stream(array).filter(e -> e % 2 == 1).map(e -> {
            if (e % 3 == 0) {
                e = e / 3;
            }
            return e;
        }).reduce((a,e) -> a+e).getAsInt(); //исп getAsInt потому что reduce возвращает Optional, а нам нужен инт
        System.out.println(result);
    }
}
