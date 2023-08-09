package module7_Streams;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    public static BigInteger factorial(int value) {
        if (value < 2) return BigInteger.valueOf(1);
        //метод mapToObj используется для преобразования каждого целого числа в объект BigInteger с помощью метода valueOf
        //метод reduce используется для перемножения всех объектов BigInteger в потоке и получения их произведения в виде объекта BigInteger
        else return IntStream.rangeClosed(2, value).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
    }
}
