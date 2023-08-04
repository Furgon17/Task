package module7_Streams.Task4;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = pseudoRandomStream(13).limit(100).toArray();
        System.out.println(Arrays.toString(arr));

    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, x -> (x * x / 10) % 1000);
    }
}
