package module7_Streams.Task1;

import java.util.function.UnaryOperator;

// UnaryOperator<T> (унарный оператор) принимает в качестве параметра объект типа T,
// выполняет над ними операции и возвращает результат операций в виде объекта типа T:
public class Task1 {
    public static void main(String[] args) {
        UnaryOperator<Integer> sqrt = x -> x * x;
        System.out.println(sqrt.apply(5));
    }
}