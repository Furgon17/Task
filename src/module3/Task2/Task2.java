package module3.Task2;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        //Метод Thread.currentThread().getStackTrace() возвращает массив элементов стека вызовов,
        // начиная с текущего потока. По умолчанию, первые три элемента этого массива будут соответствовать
        // методам getStackTrace(), getCallerClassAndMethodName() и методу, который вызвал getCallerClassAndMethodName().
        // Поэтому мы берем элемент с индексом 3, который будет соответствовать методу, вызвавшему метод, который вызвал
        // getCallerClassAndMethodName(). Если массив элементов стека вызовов содержит меньше 4 элементов, это означает,
        // что метод, вызвавший getCallerClassAndMethodName(), является точкой входа в программу, и мы возвращаем null.
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return null;
        }
        StackTraceElement caller = stackTrace[3];
        return caller.getClassName() + "#" + caller.getMethodName();
    }
}
