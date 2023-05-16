package module1;
import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ведите число, факториал которого необходимо вычислить: ");
    int num = scanner.nextInt();
    System.out.println("Факториал равен: " + factorial(num));
    }
    public static int factorial(int num){
        if (num == 1){
            return 1;
        }
        if (num == 0){
            return 0;
        }
        return num * factorial(num-1); //вызываем этот же метод в его теле, это и есть рекурсия: 4 * (4-1) , 3 * (3-1) , 2 * (2-1) пока num не станет 1
    }
}

