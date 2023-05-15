package module1;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Правда ли, что а + b = с? \n" + "Введите первое число: ");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double b = scanner.nextDouble();
        System.out.println("С каким числом сравниваем? ");
        double c = scanner.nextDouble();
        System.out.println("Ответ: " + Task3.doubleExpression(a, b ,c));
    }
    public static boolean doubleExpression(double a, double b, double c){

        return Math.abs(a + b - c)< 0.0001;
    }
}