//Задача 1
package module1;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите площаль треугольника: ");
        double area = scanner.nextDouble();
        System.out.printf("Радиус окружности равен: %.3f", calcCircleRaduis(area));
    }
    public static double calcCircleRaduis(double area){
        double result = Math.sqrt(area / Math.PI);
        return result;
    }

}