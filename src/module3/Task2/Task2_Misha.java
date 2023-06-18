package module3.Task2;

public class Task2_Misha {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        m1();
    }

    private static void m1() {
        System.out.println(getCallerClassAndMethodName());
        m2();
    }

    private static void m2() {
        System.out.println(getCallerClassAndMethodName());
        m3();
    }

    private static void m3() {
        System.out.println(getCallerClassAndMethodName());
    }
    private static void m4() {

    }
    static class MyNewException extends Exception{
    }
    public void testExp() throws MyNewException {
        throw new MyNewException();
    }
    public static String getCallerClassAndMethodName() {
        StackTraceElement[] ste = new Exception().getStackTrace();
        if (ste.length <3) {
            return null;
        } else {
            return ste[2].getClassName() + "#" + ste[2].getMethodName();
        }
    }
}