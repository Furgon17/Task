//Задача 1
package module1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество мониторов: ");
        int monitors = scanner.nextInt();
        System.out.println("Введите количество программистов: ");
        int programmers = scanner.nextInt();
        System.out.println("Столько мониторов никому не достанутся! " + drawisMonitorsCounter(monitors, programmers));
    }
    public static int drawisMonitorsCounter(int monitors, int programmers){
        int result = monitors % programmers;
        return result;
    }

}