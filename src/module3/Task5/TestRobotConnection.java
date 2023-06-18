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
        if (!isConnected) {
            throw new RuntimeException("Соединение не установлено. :(");
        }
        this.x = x;
        this.y = y;
    }

    @Override
    public void close() {
        isConnected = false;
        System.out.println("Соединение прервано");
    }

    public boolean connect() {
        int ping = (int) Math.random() * 10;
        if (ping < 2) {
            return isConnected = true;
        } else isConnected = false;
        return isConnected;
    }
}