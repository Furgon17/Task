package KataLessons;

public class Test {
    public static void main(String[] args) {
//        NumberGenerator<? super Number> numberGenerator = getGenerator();
        System.out.println(getGenerator().cond(7));

    }
    interface NumberGenerator<T extends Number> {
        boolean cond(T x);
    }
    public static NumberGenerator getGenerator() {
        return x -> x.intValue() >0;

    }
}
