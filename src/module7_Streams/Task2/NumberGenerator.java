package module7_Streams.Task2;

public interface NumberGenerator<T extends Number> {
    boolean cond(T arg);
}
