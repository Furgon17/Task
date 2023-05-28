package module2;

import static java.lang.System.*;
//Знак * в данном случае означает импорт всех статических членов класса java.lang.System.
//        Таким образом, мы можем использовать все статические методы и переменные этого класса
//        без указания его имени. Например, мы можем написать out.println("Hello World!");
//вместо System.out.println("Hello World!");.
public class Task6 {
    public static void main(String[] args) {
        out.println("Теперь можно не писать System.");
    }
}