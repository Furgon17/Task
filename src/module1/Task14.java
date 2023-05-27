package module1;
import java.util.Scanner;
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели");
        String day = scanner.nextLine();
        System.out.println("Это выходной? " + isWeekend(day));
    }
    public static boolean isWeekend(String weekDay){
        boolean a = false;
        switch (weekDay){
            case "Saturday":
                a = true;
                break;
            case "Sunday":
                a = true;
                break;
            default: a = false;
        } return a;
    }
}