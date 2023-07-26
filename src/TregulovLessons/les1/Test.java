package TregulovLessons.les1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> s =Stream.of(1, 2, 3).map(String::valueOf).collect(Collectors.toList());
        System.out.println(s);
    }
}
