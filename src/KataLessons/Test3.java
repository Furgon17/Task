package KataLessons;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
//        Stream.iterate(2, x-> x< 24, x -> x+2).forEach(System.out::println);

//        Stream.concat(Stream.of("Privet"), Stream.of("Poka")).forEach(System.out::println);

//        Stream.Builder<Integer> streamBuilder = Stream.<Integer>builder().add(0).add(1);
//        for (int i = 2; i <=8; i+=2){
//            streamBuilder.accept(i);
//        }

//        streamBuilder.add(9).add(10).build().forEach(System.out::println);

//        IntStream.range(2, 6).forEach(System.out::println);
//        IntStream.rangeClosed(2, 9).filter(x -> x % 3 ==0).forEach(System.out::println);
//        Stream.of("1", "2", "3").map(Integer::parseInt).map(x -> x + 10).forEach(System.out::println);
//        Stream.of(1,3,0,2).flatMapToInt(x -> IntStream.rangeClosed(0, x)).forEach(System.out::println);

//        Stream.of(1, 2, 3, 4, 5, 6)
//                .flatMap(x -> {
//                    if (x % 2 == 0) {
//                        return Stream.of(-x, x);
//                    }
//                    return Stream.empty();
//                }).forEach(System.out::println);

//        Stream.of(1,2,3,4,5,6)
////                .mapMulti((x, consumer) -> {
////                    if (x%2==0){
////                        consumer.accept(-x);
////                        consumer.accept(x);
////                    }
////                }).forEach(System.out::println);

//        Stream.of(1,2,3,4,5,6).limit(3).forEach(System.out::println);

//        Stream.of(1,2,3,3,4,5,5,6).distinct().forEach(System.out::println);

//        Stream.of(0, 3, 0, 0, 5)
//                .peek(x -> System.out.format("до distinct: %d%n", x))
//                .distinct()
//                .peek(x -> System.out.format("после distinct: %d%n", x))
//                .map(x -> x*x)
//                .forEach(x -> System.out.format("После map: %d%n", x));
//        List<Integer> integerList = Stream.of(0, 3, 0, 0, 5).peek(x-> System.out.format("%s ", x)).collect(Collectors.toList());
//        System.out.println(integerList);
//        Stream.of(8, 2, 3, 4, 2, 5).dropWhile(x -> x > 3).forEach(System.out::println);
//        long count = IntStream.range(0, 10)
//                .flatMap(x -> IntStream.range(0, x))
//                .count();
//        System.out.println(count);
        System.out.println(
                Stream.of(0, 2, 9, 13, 5, 11).
                        map (x -> x * 2)
//                        .filter(x -> x % 2 == 1).peek(System.out::println)
                        .count()
        );
    }
}
