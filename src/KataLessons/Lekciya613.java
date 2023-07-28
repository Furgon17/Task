package KataLessons;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lekciya613 {
    public static void main(String[] args) {
        UnaryOperator<Integer> binaryOperator = (x) -> x*x;
        System.out.println(binaryOperator.apply(4));
    }
}
