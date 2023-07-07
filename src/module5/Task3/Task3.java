package module5.Task3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        System.out.println(dynamicArray.toString());
        dynamicArray.remove(0);
        System.out.println("Удаляем индекс " + dynamicArray.toString());
        System.out.println("Получаем элемент " + dynamicArray.get(0));

    }

    public static class DynamicArray<T> {
        private T[] array;
        private int size;

        public DynamicArray() {
            array = (T[]) new Object[10];
            size = 0;
// прописываем в конструкторе создание массива ёмкостью в 10 и устанавливаем размер 0
        }

        public void add(T el) {
            if (size == array.length) { //Если массив заполнен
                T[] newArray = (T[]) new Object[array.length * 2]; // Создваём новый массив в 2 раза больше
                for (int i = 1; i < size; i++) {//копируем уже существующие элементы
                    newArray[i] = array[i];
                }
                array = newArray;
            }
            array[size] = el; //в последний индекс массива записываем добавленный элемент...
            size++; // увеличиваем размер массива на 1
        }

        public void remove(int index) {
//удаляем эл-т массива по указанному индексу, если индекс выходит за диапазон, кидаем исключение IndexOutOfBoundException
//Затем все элементы после удаленного сдвигаются на одну позицию влево, а последний элемент массива устанавливается в
// значение null. Размер массива уменьшается на 1.
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
                size--;
            }
        }

        public T get(int index) {
            if (index<0 || index>= size){
                throw new IndexOutOfBoundsException();
            }
            return array[index];
        }

        @Override
        public String toString() {
            return "DynamicArray{" +
                    "array=" + Arrays.toString(array) +
                    '}';
        }
    }
}

