package module1;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите проверяемое число: ");
        int a = scanner.nextInt();

        System.out.println(Task10.isPowerOfTwo((a)));

    }
    public static boolean isPowerOfTwo(int num){
        Integer a = Integer.bitCount(Math.abs(num));

        return (a!= 0) && (a == 1) ? true : false;
    }
}