package module1;
import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ведите число, факториал которого необходимо вычислить: ");
    int num = scanner.nextInt();
    System.out.println("Факториал равен: " + factorial(num));
    }
    public static int factorial(int num){
        int i = 1;
        int fact = 1;
        if (num == 0){
            return 0;
        }
        while (i <= num){
            fact *= i;
            i++;
        } return fact;
    }
}

