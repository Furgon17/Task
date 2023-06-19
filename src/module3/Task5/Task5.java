package module3.Task5;

public class Task5 {
    public static void main(String[] args) {
        // Test successful connection and movement
        TestRobotConnectionManager manager = new TestRobotConnectionManager(4);
        try {
            System.out.println("Первая попытка: ");
            MoveRobot.moveRobot(manager, 5, 10);
        } catch (RobotConnectionException e) {
            System.out.println("Не удалось переместить робота: " + e.getMessage());
        }

        // Test failed connection
        manager = new TestRobotConnectionManager(4);
        System.out.println("Вторая попытка: ");
        try {
            MoveRobot.moveRobot(manager, 10, 15);
        } catch (RobotConnectionException e) {
            System.out.println("Не удалось переместить робота: " + e.getMessage());
        }

        // Test failed
        manager = new TestRobotConnectionManager(3);
        System.out.println("Третья попытка: ");
        try {
            MoveRobot.moveRobot(manager, -5, 1);
        } catch (RobotConnectionException e) {
            System.out.println("Не удалось переметить робота: " + e.getMessage());
        }
    }
}
