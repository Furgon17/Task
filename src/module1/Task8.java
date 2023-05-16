package module1;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите расстоянии от \\ , для вывода символа: ");
        int a = scanner.nextInt();
        System.out.println(charExpression(a));

    }
    public static char charExpression(int a){
        int b = '\\'; // используют для получения кода символа
        char symbol = (char) (b+a);
        return symbol;
    }
}