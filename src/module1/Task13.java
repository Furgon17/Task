package module1;
import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст для определения группы: ");
        int age = scanner.nextInt();
        Task13 volleyballPlayer = new Task13();
        System.out.println("Ваша группа: " + volleyballPlayer.determineGroup(age));

    }
    public int determineGroup(int age){
        int group = -1;
        if (age >= 7 && age <= 13) return group = 1;
        else if (age >= 17 && age <= 17) return group = 2;
        else if (age >= 18 && age <= 65) return group = 3;
    return group;
    }
}