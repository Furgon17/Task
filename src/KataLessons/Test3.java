package KataLessons;

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

        Stream.of(1,2,3,3,4,5,5,6).distinct().forEach(System.out::println);
        
    }
}
