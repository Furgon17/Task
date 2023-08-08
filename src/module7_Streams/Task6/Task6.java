package module7_Streams.Task6;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task6 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        String input = reader.readLine().toLowerCase(); // читаем строку и переводим в нижний регистр
        String[] words = input.split("[^\\p{L}\\p{Digit}]+"); // разбиваем на слова
        Map<String, Long> wordFrequency = Arrays.stream(words)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting())); // считаем частоту появления слов
        Stream<Map.Entry<String, Long>> sorted = wordFrequency.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed() // сортируем по частоте в обратном порядке
                        .thenComparing(Map.Entry.comparingByKey())); // если частота одинаковая, сортируем по ключу (слову)
        sorted.limit(10) // ограничиваем до 10 слов
                .map(Map.Entry::getKey) // получаем только ключ (слово)
                .forEach(System.out::println); // выводим на консоль
    }
}
/*1. BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        Создание объекта класса BufferedReader, который позволяет считывать данные с консоли. InputStreamReader указывает,
        что данные будут считываться из стандартного ввода (System.in), а StandardCharsets.UTF_8 - что данные будут закодированы в UTF-8.

        2. String input = reader.readLine().toLowerCase();
        Считывание строки с консоли и приведение ее к нижнему регистру с помощью методов readLine() и toLowerCase().

        3. String[] words = input.split("[^\\p{L}\\p{Digit}]+");
        Разбиение строки на слова с помощью метода split(). Регулярное выражение "[^\\p{L}\\p{Digit}]+", переданное в
        качестве параметра методу, означает, что разделителем слов будут все символы, кроме букв и цифр.

        4. Map<String, Long> wordFrequency = Arrays.stream(words)
        .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        Создание мапы, в которой ключами являются слова, а значениями - количество их повторений в исходной строке.
         Для этого используется метод groupingBy из класса Collectors, который группирует элементы по заданному критерию
         и собирает их в мапу. В данном случае критерием является само слово, а значением - количество его повторений в исходной строке.

        5. Stream<Map.Entry<String, Long>> sorted = wordFrequency.entrySet().stream()
        .sorted(Map.Entry.<String, Long>comparingByValue().reversed()
        .thenComparing(Map.Entry.comparingByKey()));
        Создание стрима, который содержит отсортированные элементы мапы wordFrequency. Сначала они сортируются по
         частоте встречаемости в обратном порядке (чтобы самые часто встречающиеся слова были первыми), а затем - по ключу
          (слову), если частота одинаковая.

        6. sorted.limit(10)
        .map(Map.Entry::getKey)
        .forEach(System.out::println);
        Ограничение стрима до 10 элементов с помощью метода limit(), получение только ключей (слов) с помощью метода
         map() и вывод на консоль каждого элемента с помощью метода forEach(). В результате на экран выводятся 10 самых
         часто встречающихся слов в исходной строке.*/
