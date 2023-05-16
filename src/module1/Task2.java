package module1;
import java.util.Scanner;

public class Task2   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость товара: ");
        double price = scanner.nextDouble();
        System.out.println("Введите количество: ");
        int count = scanner.nextInt();
        System.out.println("Итоговая стоимость: " + priceCalculation(price, count));
    }
    public static double priceCalculation(double price, int count){
        double result = price * count;
        return result;
    }

}