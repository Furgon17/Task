package module7_Streams.Task5;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        findMinMax(Stream.of(1,1,4,5,36,32), Integer::compareTo, (min, max) -> {System.out.println(min);
        System.out.println(max);});
    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<? extends T> list = stream.sorted(order).collect(Collectors.toList());
        if (list.isEmpty()){
            minMaxConsumer.accept(null,null);
        } else minMaxConsumer.accept(list.get(0), list.get(list.size()-1));
    }
}
