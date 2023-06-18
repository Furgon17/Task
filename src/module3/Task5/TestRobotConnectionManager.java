package module3.Task5;

public class TestRobotConnectionManager implements RobotConnectionManager{
    private int attempts;

    public TestRobotConnectionManager() {
        this.attempts = 0;
    }

    @Override
    public RobotConnection getConnection() throws RobotConnectionException{
        attempts++;
        if(attempts < 3){
            throw new RobotConnectionException("Не удалось установить соединение");
        }
        TestRobotConnection connection = new TestRobotConnection();
        connection.connect();
        return connection;
    }
}
