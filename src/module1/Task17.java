package module1;
import java.util.Scanner;
public class Task17 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int lenght = scanner.nextInt();
        int[] arr = new int[lenght];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        printArray(arr);
    }
    public static void printArray(int[] numbers){
        System.out.print("[");
        for (int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i]);
            if (i<numbers.length - 1) System.out.print(", ");
        }
        System.out.print("]");
    }
}