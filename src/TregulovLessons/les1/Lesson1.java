package TregulovLessons.les1;

import java.util.*;
import java.util.stream.Collectors;

//Stream - это интерфейс. Stream - это последовательность элементов, поддерживающих последовательные и параллельные операции над ними
//1. Разберем метод map()
public class Lesson1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("ok");
        list.add("poka");
//Допустим мы хотим вывести количество символов в наших строках. Раньше мы бы делали это так:
//        for(int i = 0; i<list.size(); i++){
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
//2й способ: вызываем метод stream() на нашем листе, чтобы сделать из него стрим. На выходе мы имеем поток,
// т.е. работаем уже не с коллекцией, а с потоком
// Далее вызываем метод map(), который берет по очередим каждый элемент нашего стрима и спопоставляет ему элемент, который из него получается
// после применения на нем тех действий, которые мы описываем внутри map() с помощью лямбда выражений
        // map на вход принимае интерфейс function
        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList()); //каждому элеметну стрима присвоей его значение длин
//Чтобы обратно поток преобразовать в коллекцию необходимо применить метод collect(Collectors.toList())
//Методы стрима не меняют сам лист, на котором были вызваны
        System.out.println(list);
        System.out.println(list2);
        System.out.println();
//Пример применения метод map() для массива
        int[] array = {5, 9, 3, 8, 1};
//Чтобы из массива получить стрим применяем Arrays.stream() и в параметры передаем массив:
        //в map проверим, Если эл-т массива делится без остатка на 3, то делим
        array = Arrays.stream(array).map(element ->
        {
            if (element % 3 == 0) {
                element = element/3; //тогда заменяем элемент, поделив его на 3
            }
            return element;
        }).toArray(); //toArray(), чтобы преобразовать поток в массив
        System.out.println("Результат метода map, где делим на 3 эл-ты кратные 3: " + Arrays.toString(array));
        System.out.println( );
        System.out.println("Пример с использованием Set:");
        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("OK");
        set.add("poka");
        System.out.println(set);
        Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        System.out.println("Получи отсортированные значения, т.к из TreeSet: " + set2);
        //можем этот поток преобразовать и в лист, тогда никакой сортировки не будет
        List<Integer> list3 = set.stream().map(e -> e.length()).collect(Collectors.toList());
        System.out.println("list 3 уже не отсортирован "+list3);
    }
}
