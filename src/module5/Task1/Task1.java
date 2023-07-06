package module5.Task1;

public class Task1 {
    public static void main(String[] args) {
        Box<String> s = new Box<>("Первый Дженерик");
        Box<Integer> i = new Box<>(5);
        System.out.println(s.toString() + " \n" + i.toString());
    }
}
