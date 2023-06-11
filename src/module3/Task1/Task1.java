package module3.Task1;

public class Task1 {
    public static void main(String[] args) {
        try {
            testExp();
        } catch (MyNewException e){
            e.printStackTrace(); //красное поле с указанием строки, где выброшено исключение
        }
    }

    public static void testExp() throws MyNewException{ // throws обзначает, что метод может дать исключение
        throw new MyNewException("Информация, прописанная в моем новом исключении"); //создаем объект класса MyNewExeption, хранящий исключение
    }
}
