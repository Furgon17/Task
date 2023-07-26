package TregulovLessons.les3;
//Рассмотрим forEach для стримов

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        //Выведем каждый элемент стрима на экран
        Arrays.stream(array).forEach(el -> System.out.println(el));
        //Можно это запистаь еще проще, благодаря тому, что forEach возвращает void(ничего)
        Arrays.stream(array).forEach(System.out::println); //System.out::println - это метод-референс (т.е мы даем ссылку на наш метод println,
        //говорим, тчо наше метод находится в System.out. И Java понимает, что в метод println мы должны вставить каждый элемент нашего )
        Arrays.stream(array).forEach(Utils::myMethod); //С каждым элементом потомка сделай метод myMethod, находящийся в классе Utils
    }
}

class Utils {
    public static void myMethod(int a) {
        a+=5;
        System.out.println("Element = " +a);
    }
}