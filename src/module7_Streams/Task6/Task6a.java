package module7_Streams.Task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.stream.Stream;

public class Task6a {
    public static void main(String[] args) throws IOException {
//Создаем пустой объект HashMap в котором будут храниться слова и их количество
        HashMap<String, Integer> result = new HashMap<>();
//создаем объект InputStreamReader, который будет читать данные из стандартного входного потока с использованием кодировки UTF-8.
        InputStreamReader inputStreamReader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
//BufferedReader обеспечивает буферизацию данных, что позволяет считывать данные построчно или блоками, а не по одному символу за раз
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        bufferedReader.lines() //получаем поток строк из BufferReader
                //через flatMap() преобразуем каждую строку в поток слов, разделенных знаками препинания и пробелами.
                .flatMap(l -> Stream.of(l.split("[\\p{Punct}\\s]+"))) //
                .map(w -> w.toLowerCase()) //Приводим каждое слово к нижнему регистру
//через ForEach() елаем проверку для каждого слова в потоке: Если оно уже есть в HashMap, то увеличиваем его количество на +1,
//а если еще нет, тогда добавляем его в HashMap c начальным значением 1.
                .forEach(w -> {
                    if(result.containsKey(w)) result.put(w, result.get(w) + 1);
                    else result.put(w, 1);
                });

        // Сортируем отображение по количеству слов в обратном порядке, по словам в лексиграфическом
        // и выводим первых 10 элементов в stdout

        result.entrySet()
                .stream()//Получаем поток пар ключ,значение из HashMap
//Сортируем поток по значению (количеству слов), в обратном порядке. Если значения равны, то сортируем по ключу (слову).
                .sorted((e1, e2) -> {
                    if(e1.getValue() == e2.getValue()) return e1.getKey().compareTo(e2.getKey());
                    else return e2.getValue().compareTo(e1.getValue());})
                .limit(10) //ограничиваем поток первыми 10 элементами
                .forEach(e -> System.out.println(e.getKey())); //выводим ключ в консоль
    }
}