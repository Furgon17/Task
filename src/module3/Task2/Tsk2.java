package module3.Task2;

public class Tsk2 {

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stack = new Exception().getStackTrace();
        if (stack.length < 3) {
            return null;
        }
        StackTraceElement el = stack[2];
        return el.getClassName() + "#" + el.getMethodName();
    }
   /* используется объект типа StackTraceElement, который содержит информацию о стеке вызовов методов.
    С помощью метода getStackTrace() создается массив объектов StackTraceElement, представляющих стек вызовов.
    Если длина массива меньше трех, то метод возвращает null, так как нет достаточно информации для определения
    вызывающего класса и метода. В противном случае, извлекается элемент стека с индексом 2 (т.е. вызывающий метод),
    из которого извлекаются имя класса и метода с помощью методов getClassName() и getMethodName().*/
}
