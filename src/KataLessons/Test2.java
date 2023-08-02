package KataLessons;

import java.util.stream.Stream;

public class Test2 {
    public static  void main(String[] args){
        String str = Math.random() > 0.5 ? "I,m feeling lucky" : null;
        Stream.ofNullable(str).forEach(System.out::println);
    }
}
