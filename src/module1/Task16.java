package module1;
import java.util.Scanner;
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели");
        String day = scanner.nextLine();
        System.out.println("Это выходной? " + checkWeekend(day));
    }
    public static String checkWeekend(String weekday){
    return weekday.equals("Sunday") || weekday.equals("Saturday") ? "Ура, выходной!" : "Надо еще поработать"; // условие ? выражение1 : выражение2
    }
}