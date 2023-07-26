package TregulovLessons.les4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Lesson4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((accimilator, element) ->
                accimilator * element).get();
//        System.out.println(result);
        int result2 = list.stream().reduce(1, (accimilator, element) ->// 1 - Когда мы таким образом вставляем число,
                // это будет являться начальным значением нашего accumulator'а (Вместо 5)
                accimilator * element); //.get(); нет смысла использовать, т.к. null уже не может быть, (минимум 1, указанная в параметре)
        System.out.println(result2);
        List<Integer> list100 = new ArrayList<>();
        Optional<Integer> opt = list.stream().reduce((accumulator, e) ->
                accumulator * e);
        if (opt.isPresent()) {
            System.out.println(opt.get());
        } else System.out.println("Not Present");

        List<String> list3 = new ArrayList<>();
        list3.add("privet");
        list3.add("kak dela?");
        list3.add("OK");
        list3.add("poka");
        String result3 = list3.stream().reduce((accumulator, e) ->
                accumulator+ " " + e).get(); //объединяем в 1 строку элементы листа
        System.out.println(result3);
    }
}
