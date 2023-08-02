package module7_Streams.Task2;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(getGenerator().cond(6));
    }

    public static NumberGenerator<? super Number> getGenerator() {
        NumberGenerator<Integer> numberGenerator = x -> x.intValue() > 0;
        return (NumberGenerator) numberGenerator;
    }
}
