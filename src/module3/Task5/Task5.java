package module3.Task5;

public class Task5 {
    public static void main(String[] args) {
        // Test successful connection and movement
        RobotConnectionManager manager = new TestRobotConnectionManager();
        try {
            System.out.println("Первая попытка: ");
            MoveRobot.moveRobot(manager, 5, 10);
            System.out.println("Робот успешно перемещен");
        } catch (RobotConnectionException e) {
            System.out.println("Не удалось переместить робота: " + e.getMessage());
        }

        // Test failed connection
        manager = new TestRobotConnectionManager();
        System.out.println("Вторая попытка: ");
        try {
            MoveRobot.moveRobot(manager, 10, 15);
            System.out.println("Робот успешно перемещен");
        } catch (RobotConnectionException e) {
            System.out.println("Не удалось переместить робота: " + e.getMessage());
        }

        // Test failed movement
        manager = new TestRobotConnectionManager();
        System.out.println("Третья попытка: ");
        try {
            MoveRobot.moveRobot(manager, -5, -10);
            System.out.println("Робот успешно перемещен");
        } catch (RobotConnectionException e) {
            System.out.println("Не удалось переметить робота: " + e.getMessage());
        }
    }
}
