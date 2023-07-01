package module4;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Task1 {
    public static void main(String[] args) {
        try {
            //Создаём объект класса FileInputStream для чтения файла
            FileInputStream fileInputStream = new FileInputStream("input.txt");
            // Вызываем метод sumOfStream и передаём в него объект fileInputStream
            int sum = sumOfStream(fileInputStream);
            System.out.println("Сумма чисел в потоке равна: " +  sum);
            // закрываем поток
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int sumOfStream(InputStream inputStream) throws IOException {
        // Эта переменная будет использоваться для хранения суммы чисел, полученных из потока.
        int sum = 0;
        // Эта переменная будет использоваться для хранения следующего байта, полученного из потока.
        int nextByte;
        // В цикле while выполняется чтение байта из потока inputStream методом read(). Результат чтения присваивается переменной nextByte.
        // В условии цикла проверяется, что значение переменной nextByte не равно -1. Значение -1 означает конец потока
        while ((nextByte = inputStream.read()) != -1) {
            //Внутри цикла if-условие проверяет, является ли символ, представленный байтом nextByte, цифрой.
            // Для этого используется метод Character.isDigit(), который возвращает true, если символ является цифрой.
            if (Character.isDigit(nextByte)) {
                //Если символ является цифрой, то его числовое значение получается с помощью метода Character.getNumericValue().
                // Полученное значение добавляется к переменной sum.
                sum += Character.getNumericValue(nextByte);
            }
        }
        return sum;
    }
}
