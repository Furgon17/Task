package module5.Task4;

import java.util.*;

public class Task4 {
//Set хранит в себе только уникальные элементы
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println(set1);
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(0);
        set2.add(2);
        set2.add(3);
        System.out.println(symmetricalDifference(set1, set2));
    }

    public static <T> Set<T> symmetricalDifference(Set<? extends T> set1, Set<? extends T> set2) {
//Создаём новый Set для хранения симметрической разности
        Set<T> set = new HashSet<>();
//Добавляем в него все элементы с помощью метода adAll()
        set.addAll(set1);
        set.addAll(set2);
//создаем итератор iterator, который будет использоваться для прохода по элементам множества set.
        Iterator<T> iterator = set.iterator();
//Пока есть элемент, на который ссылается итератор (не null)
        while (iterator.hasNext()) {
//Создаём переменную типа Т, для хранения элементов итератора
            T element = iterator.next();
//Если в Set1 и Set2 находятся одинаковые елементы,
            if (set1.contains(element) && set2.contains(element)) {
//то удаляем данный элемент из set
                iterator.remove();
            }
        }
        return set;
    }
}
