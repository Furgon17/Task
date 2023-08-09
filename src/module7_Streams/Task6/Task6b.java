package module7_Streams.Task6;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task6b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8").useDelimiter("[^\\p{L}\\p{Digit}]+");

        HashMap<String, Integer> hashMap = new HashMap <>();
        scanner.forEachRemaining(n ->
                hashMap.put(n.toLowerCase(), hashMap.get(n.toLowerCase()) == null ? 1 : hashMap.get(n.toLowerCase()) + 1));
        hashMap.entrySet()
                .stream().sorted(Comparator.<Map.Entry <String, Integer>>comparingInt(Map.Entry::getValue)
                        .reversed().thenComparing(Map.Entry::getKey))
                .map(Map.Entry::getKey).limit(10).forEach(System.out::println);
        scanner.close();
    }
}
