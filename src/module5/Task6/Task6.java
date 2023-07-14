package module5.Task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Task6 {

    public static void main(String[] args) {
//Создаём объект bofferReader для чтения и ввода с клавиатуры
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
//помещаем в массив строку, считанную с консоли и разбиваем элементы пробелами
            String[] line = br.readLine().split(" ");
//кол-во слов в строке
            int i = line.length;
// созд. связанный список для хранения слов
            LinkedList<String> buff = new LinkedList<>();
// Проходим по каждому слову в массиве line
            for (int j = 1; j < i; ++j) {
//Проверяем, является ли индекс слова нечетным числом
                if ((j & 1) != 0) {
//Если индекс нечетный, добавляем слово в начало списка buff
                    buff.addFirst(line[j]);
                }
            }
// Для каждого элемента списка buff выполняем действие, описанное после стрелки ->
            buff.forEach(e -> System.out.print(e + " "));
        } catch (IOException e) {

        } catch (NullPointerException e) {

        }
    }
}
