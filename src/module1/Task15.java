package module1;
import java.util.Scanner;
public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели");
        String day = scanner.nextLine();
        System.out.println("Это выходной? " + isWeekend(day));
    }
    public static boolean isWeekend(String weekDay){
        if (weekDay.equals("Saturday")){
            return true;
        }
        if (weekDay.equals("Sunday")){
            return true;
        }
        else return false;
    }
}