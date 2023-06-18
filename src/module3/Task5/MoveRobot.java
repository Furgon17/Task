package module3.Task5;

public class MoveRobot {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) throws RobotConnectionException {
        int attempts = 0;
        boolean success = false;
        RobotConnection connection = null;
        while (!success && attempts < 3) {
            try {
                connection = robotConnectionManager.getConnection();
                connection.moveRobotTo(toX, toY);
                success = true;
            } catch (RobotConnectionException e) {
                attempts++;
            } finally {
                try {
                    if (connection != null) {
                        connection.close();
                    }
                } catch (Exception e) {
                    // ignore
                }
            }
        }
        if (!success) {
            throw new RobotConnectionException("Не удалось установить соединение или отправить команду.");
        }
    }
}
