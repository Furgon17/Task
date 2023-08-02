package module7_Streams.Task3;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {
        Predicate<Integer> condition = x -> x>0;
        Function<Integer, String> ifTrue = x -> "Positive";
        Function<Integer, String> ifFalse = x -> "Negative";
        Function<Integer, String> result = ternaryOperator(condition, ifTrue, ifFalse);
        System.out.println(result.apply(0));
        System.out.println(result.apply(1));
    }
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return x -> (condition.test(x) ? ifTrue.apply(x) : ifFalse.apply(x));
    }
}
