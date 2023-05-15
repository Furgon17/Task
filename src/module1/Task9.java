package module1;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст первого человека: ");
        byte a = scanner.nextByte();
        System.out.println("Введите возраст второго человека: ");
        byte b = scanner.nextByte();
        System.out.println(Task9.getAgeDiff(a, b));

    }
    public static byte getAgeDiff(byte age1, byte age2){
        byte result = (byte) Math.abs(age1 - age2);     //abs - возвращает по модулю
        return result;
    }
}