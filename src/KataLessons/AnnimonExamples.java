package KataLessons;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

//Это код Шрёдингера. Он может нормально выполниться и показать 1000000, может выполниться и показать 869877,
//        а может и упасть с ошибкой Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:'
//возможно, что при параллельном заполнении списка возникнет состояние гонки (race condition), когда несколько потоков
//        попытаются добавить элемент в список одновременно, что может привести к непредсказуемым результатам.
//        Чтобы избежать такой ситуации, можно использовать синхронизацию или другие механизмы для обеспечения
//        безопасности доступа к списку из нескольких потоков.
public class AnnimonExamples {
    public static void main(String[] args) {
        final List<Integer> ints = new ArrayList<>();
        IntStream.range(0, 1000)
                .parallel()
                .forEach(i -> ints.add(i));
        System.out.println(ints.size());

    }
}
