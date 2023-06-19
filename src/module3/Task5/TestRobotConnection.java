package module3.Task5;

public class TestRobotConnection implements RobotConnection {
    private int x;
    private int y;
    private boolean isConnected;

    public TestRobotConnection() {
        this.x = 0;
        this.y = 0;
        this.isConnected = false;
    }

    @Override
    public void moveRobotTo(int x, int y) {
        // Если подключение не удалось, вывести исключение
        if (isConnected == false) {
            throw new RuntimeException("Соединение не установлено. :(, Не удалось переместить робота...");
        }
        // Если удалось, передаем координаты
        this.x = x;
        this.y = y;
        System.out.println("Робот успешно перемещен в х: " + x +", y: " + y);
    }
    public boolean connect(int ping) {
        if (ping < 5) {
            return isConnected = true;
        } else return isConnected = false;
    }
    @Override
    public void close() {
        isConnected = false;
        System.out.println("Соединение закрыто");
    }


}