package module2.Task10;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        AsciiCharSequence asci = new AsciiCharSequence(new byte[]{54, 66, 33});
        System.out.println("toString (строковое представление): " + asci.toString());
        System.out.println("charAt (возвращает символ по указанному индексу): " + asci.charAt(1));
        System.out.println("length (длина): " + asci.length());
        System.out.println("subSequence: " + asci.subSequence(0, 2));
    }

    public static class AsciiCharSequence implements CharSequence {
        // Конструктор, принимающий массив байт
        private byte[] arr;
        public AsciiCharSequence(byte[] arr) {

            this.arr = arr;
        }

        @Override
        public String toString() {
            return new String(arr); //выводит массив символов
        }

        @Override
        public int length() {
            return arr.length; //выводит длину массива
        }

        @Override
        public char charAt(int index) {
            return (char) arr[index]; // Возвращает элемент по индексу. Приводим к char, потому что так вернет int.
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            byte[] result = new byte[end - start];
            for (int i = start; i < end; i++) {
                result[i - start] = arr[i]; // i - start, чтобы первый индкес был 0
            }
            return new AsciiCharSequence(result); // возвращает подмассив массива arr (сами указываем с какого по какой элемент)
        }
    }
}
