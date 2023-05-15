//Задача 1
package module1;
import java.math.BigInteger;
public class Task7 {
    public static void main(String[] args) {
        Task7.maxLongSqr();
    }
    public static void maxLongSqr(){
        BigInteger big = BigInteger.valueOf(Long.MAX_VALUE); // в объект big помещаем макс значение long
        BigInteger sqrtBig = big.sqrt(); //возводим в квадрат
        System.out.println("Квадрат максимального значения, содержащегося в переменной long" + sqrtBig.toString());
    }

}